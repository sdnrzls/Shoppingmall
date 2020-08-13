package com.basket.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.member.model.User;
import com.product.model.Product;
import com.product.model.ProductDAO;

public class BasketDAO {
	
	//��� ����
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
			
			
			//��ٱ��� ���
			public void Basketinsert(Basket basket) {
				Connection con=null;
				PreparedStatement ps =null;
				
				try {
					con = getConnection();
					String sql = "insert into shoppingbasket values(Basket_seq.nextval,?,?,?,?,?)";
					ps=con.prepareStatement(sql);
					ps.setString(1, basket.getUserid());
					ps.setInt(2, basket.getProductid());
					ps.setInt(3,basket.getNumbers());
					ps.setString(4, basket.getUploadfile());
					ps.setInt(5, basket.getPrice());
					ps.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					closeConnection(con, ps);
				}	
			}
			
			//��ٱ��� ����Ʈ
			public ArrayList<Basket> BasketList(String userid) {
				Connection con =null;
				Statement st = null;
				ResultSet rs = null;
				ArrayList<Basket>arr = new ArrayList<>();
				try {
					con = getConnection();
					String sql = "select * from shoppingbasket where userid='"+userid+"'";
					System.out.println(sql);
					st = con.createStatement();
					rs = st.executeQuery(sql);
					while(rs.next()) {
						Basket dto = new Basket();
						dto.setBasketid(rs.getInt("basketid"));
						dto.setUserid(rs.getString("userid"));
						dto.setProductid(rs.getInt("productid"));
						dto.setNumbers(rs.getInt("numbers"));
						arr.add(dto);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					closeConnection(con, st, rs);
				}
				return arr;
			}
			
			//�ݱ�
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
