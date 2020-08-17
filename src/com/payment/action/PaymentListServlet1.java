package com.payment.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.member.model.User;
import com.payment.model.Payment;
import com.payment.model.PaymentDAO;

/**
 * Servlet implementation class PaymentListServlet1
 */
@WebServlet("/payment/paymentlist")
public class PaymentListServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentListServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		PaymentDAO dao = PaymentDAO.getInstance();

		
		HttpSession session = request.getSession(); // 技记积己 啊廉坷扁
		User user = (User)session.getAttribute("user");
		
		ArrayList<Payment> arr=dao.PaymentList(user.getUserid());
		request.setAttribute("arr", arr);
			
		RequestDispatcher rd =request.getRequestDispatcher("paymentlist.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
