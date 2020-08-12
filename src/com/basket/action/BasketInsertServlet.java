package com.basket.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.basket.model.Basket;
import com.basket.model.BasketDAO;


/**
 * Servlet implementation class BasketInsertServlet
 */
@WebServlet("/basket/insert")
public class BasketInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BasketInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		BasketDAO dao = BasketDAO.getInstance();
		Basket basket = new Basket();
		basket.setUserid(request.getParameter("userid"));
		basket.setProductid(request.getParameter("productid"));
		basket.setNumbers(Integer.parseInt(request.getParameter("numbers")));
	
		dao.Basketinsert(basket);
		//response.sendRedirect("list");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
