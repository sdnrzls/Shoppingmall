package com.basket.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.product.model.Product;
import com.product.model.ProductDAO;

public class BasketDAO {
	
	//디비 연결
			private static  BasketDAO instance  = new BasketDAO();
			public static BasketDAO  getInstance() {
				return instance;
			}
			private Connection getConnection() throws Exception{
			Context initCtx = new InitialContext();
			Context envCtx =(Context) initCtx.lookup("java:comp/env");
			DataSource ds = (DataSource) envCtx.lookup("jdbc/User");
			return ds.getConnection();
			}
			
			
			//장바구니 담기
			public void Basketinsert(Basket basket) {
				Connection con=null;
				PreparedStatement ps =null;
				
				try {
					con = getConnection();
					String sql = "insert into shoppingbasket values(Basket_seq.nextval,?,?,?,1)";
					ps=con.prepareStatement(sql);
					ps.setString(1, basket.getUserid());
					ps.setString(2, basket.getProductid());
					ps.setInt(3,basket.getNumbers());
					ps.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					closeConnection(con, ps);
				}	
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
