package com.payment.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.basket.model.Basket;
import com.product.model.Product;


public class PaymentDAO {

	//디비 연결
			private static  PaymentDAO instance  = new PaymentDAO();
			public static PaymentDAO  getInstance() {
				return instance;
			}
			private Connection getConnection() throws Exception{
			Context initCtx = new InitialContext();
			Context envCtx =(Context) initCtx.lookup("java:comp/env");
			DataSource ds = (DataSource) envCtx.lookup("jdbc/User");
			return ds.getConnection();
			}
			
			//결제
			public void Paymentinsert(Payment payment) {
				Connection con=null;
				PreparedStatement ps =null;
	
				try {
					con = getConnection();
					String sql = "insert into shoppingpayment values(payment_seq.nextval,?,?,?,?,?,?,?,?,?)";
					ps=con.prepareStatement(sql);
					ps.setString(1, payment.getUserid());
					ps.setInt(2, payment.getProductid());
					ps.setInt(3, payment.getNumbers());
					ps.setString(4, payment.getAddress());
					ps.setString(5, payment.getphone());
					ps.setString(6, payment.getCreditcardnumber());
					ps.setString(7, payment.getCreditcardpassword());
					ps.setInt(3, payment.getPrice());
					ps.setString(9, payment.getUploadfile());
					ps.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					closeConnection(con, ps);
				}	
			}
			
			//결제리스트
			public ArrayList<Payment> PaymentList(String userid) {
				Connection con =null;
				Statement st = null;
				ResultSet rs = null;
				ArrayList<Payment>arr = new ArrayList<>();
				try {
					con = getConnection();
					String sql = "select * from shoppingpayment where userid='"+userid+"'";
					System.out.println(sql);
					st = con.createStatement();
					rs = st.executeQuery(sql);
					while(rs.next()) {
						Payment dto = new Payment();
						dto.setPaymentid(rs.getInt("paymentid"));
						dto.setUserid(rs.getString("userid"));
						dto.setProductid(rs.getInt("productid"));
						dto.setNumbers(rs.getInt("numbers"));
						dto.setAddress(rs.getString("address"));
						dto.setphone(rs.getString("phone"));
						dto.setCreditcardnumber(rs.getString("creditcardnumber"));
						dto.setCreditcardpassword(rs.getString("creditcardpassword"));
						dto.setUploadfile(rs.getString("uploadfile"));
						dto.setPrice(rs.getInt("price"));
						arr.add(dto);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					closeConnection(con, st, rs);
				}
				return arr;
			}
			
			//닫기
			private void closeConnection(Connection con, Statement st , ResultSet rs) {
				try {
					if(rs!=null) rs.close();
					if(st!=null)  	st.close();
					if(con!=null ) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			private void closeConnection(Connection con, PreparedStatement ps) {
				try {
					if(ps!=null) ps.close();
					if(con!=null ) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
}
