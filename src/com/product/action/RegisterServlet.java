package com.product.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.member.model.User;
import com.member.model.UserDAO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.product.model.Product;
import com.product.model.ProductDAO;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/product/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");	
		
		int uploadFileSizeLimit = 5*1024*1024; //5MB  �� ����
		String encType = "UTF-8";
		String savePath = "upload";
		ServletContext context = getServletContext();
		String uploadFilePath = context.getRealPath(savePath);
		System.out.println("�������� ���� ���丮 : " + uploadFilePath);
		

		MultipartRequest multi = new MultipartRequest(
				request,   //request��ü
				uploadFilePath,  //�������� ���� ���丮
				uploadFileSizeLimit, //�ִ� ���ε� ���� ũ��
				encType,  //���ڵ����
				new DefaultFileRenamePolicy()); // ���� ���� ���̸� �ο�
		
		//���ε�� �����̸� ���ϱ�
		String fileName= multi.getFilesystemName("uploadfile");
		System.out.println("fileName : " + fileName);
		
		ProductDAO dao = ProductDAO.getInstance();
		Product product = new Product();
		product.setProducttype(Integer.parseInt(multi.getParameter("producttype")));
		product.setProductname(multi.getParameter("productname"));
		product.setExplanation(multi.getParameter("explanation"));;
		product.setPrice(Integer.parseInt(multi.getParameter("price")));
		product.setInventory(Integer.parseInt(multi.getParameter("inventory")));		
		
		if(fileName==null) {//���� ���ε� �ȵ�
			System.out.println("���� ���ε� ���� �ʾ���");
		}else {
		product.setUploadfile(fileName);
		}
		
		dao.Productregister(product);
		response.sendRedirect("list");


}
}
