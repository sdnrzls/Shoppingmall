package com.payment.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


import com.basket.model.Basket;
import com.basket.model.BasketDAO;
import com.member.model.User;



/**
 * Servlet implementation class PaymentInsertServlet
 */
@WebServlet("/payment/payment")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() {
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

		HttpSession session = request.getSession(); // 技记积己 啊廉坷扁
		User user = (User)session.getAttribute("user");
		
		ArrayList<Basket> arr=dao.BasketList(user.getUserid());
		request.setAttribute("arr", arr);
			
		RequestDispatcher rd =request.getRequestDispatcher("payment.jsp");
		rd.forward(request, response);
		
	}

}
