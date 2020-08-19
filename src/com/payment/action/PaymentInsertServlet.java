package com.payment.action;

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
import com.payment.model.Payment;
import com.payment.model.PaymentDAO;

/**
 * Servlet implementation class PaymentInsertServlet
 */
@WebServlet("/payment/paymentinsert")
public class PaymentInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentInsertServlet() {
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
		
		PaymentDAO dao = PaymentDAO.getInstance();
		Payment payment = new Payment();
		
		HttpSession session = request.getSession(); // 技记积己
		User suser = (User)session.getAttribute("user");//User俊 技记殿废
		
		
		payment.setUserid(suser.getUserid());// 技记汲沥
		payment.setProductid(Integer.parseInt(request.getParameter("productid")));
		payment.setNumbers(Integer.parseInt(request.getParameter("numbers")));
		payment.setAddress(request.getParameter("address"));
		payment.setphone(request.getParameter("phone"));
		payment.setCreditcardnumber(request.getParameter("creditcardnumber"));
		payment.setCreditcardpassword(request.getParameter("creditcardpassword"));
		payment.setPrice(Integer.parseInt(request.getParameter("price")));
		payment.setUploadfile(request.getParameter("uploadfile"));
	
		dao.Paymentinsert(payment);
		response.sendRedirect("paymentlist");
	}

}
