package com.product.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.model.Product;
import com.product.model.ProductDAO;



/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/product/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Product product = new Product();
		product.setProductid(Integer.parseInt(request.getParameter("productid")));
		product.setProducttype(Integer.parseInt(request.getParameter("producttype")));
		product.setProductname(request.getParameter("productname"));
		product.setExplanation(request.getParameter("explanation"));
		product.setPrice(Integer.parseInt(request.getParameter("price")));
		product.setInventory(Integer.parseInt(request.getParameter("inventory")));
		product.setUploadfile(request.getParameter("uploadfile"));
		ProductDAO dao = ProductDAO.getInstance();
		dao.ProductUpdate(product);
		response.sendRedirect("list");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
