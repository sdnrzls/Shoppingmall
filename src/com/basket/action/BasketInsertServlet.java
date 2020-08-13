package com.basket.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.basket.model.Basket;
import com.basket.model.BasketDAO;
import com.member.model.User;


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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		BasketDAO dao = BasketDAO.getInstance();
		Basket basket = new Basket();
		
		HttpSession session = request.getSession(); // 技记积己
		User suser = (User)session.getAttribute("user");//User俊 技记殿废
		

		
		basket.setUserid(suser.getUserid());// 技记汲沥
		basket.setProductid(Integer.parseInt(request.getParameter("productid")));
		basket.setNumbers(Integer.parseInt(request.getParameter("inventory")));
		basket.setUploadfile(request.getParameter("uploadfile"));
		basket.setPrice(Integer.parseInt(request.getParameter("price")));
	
		dao.Basketinsert(basket);
		response.sendRedirect("basketlist");
	}

}
