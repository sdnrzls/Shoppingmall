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
		
		ProductDAO dao = ProductDAO.getInstance();
		Product product = new Product();
		product.setProducttype(Integer.parseInt(request.getParameter("producttype")));
		product.setProductname(request.getParameter("productname"));
		product.setExplanation(request.getParameter("explanation"));;
		product.setPrice(Integer.parseInt(request.getParameter("price")));
		product.setInventory(Integer.parseInt(request.getParameter("inventory")));		
		
		
		dao.Productregister(product);
		response.sendRedirect("list");
	}

}
