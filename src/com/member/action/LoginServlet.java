package com.member.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.member.model.User;
import com.member.model.UserDAO;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Main/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
		   String userid = request.getParameter("userid");
		   String password = request.getParameter("password");
		   UserDAO dao =UserDAO.getInstance();
		   User user = dao.Userlogin(userid, password);
		   int flag = -1;
		   if(user!=null) {
			   flag = user.getUsertype();
			   if(user.getUsertype()==0 || user.getUsertype()==1){
				   HttpSession session=request.getSession();//HttpSession로 session를 생성하지않으면 사용 불가능
				   session.setAttribute("user", user);
			   }
		   }
		  
		 response.setContentType("type/html;charset=utf-8");
		 PrintWriter out = response.getWriter(); //PrintWriter로 out객체 생성하지않으면 사용 불가능
		 out.println(flag);
			}
	}


