package com.product.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



public class ProductDAO {

	//디비 연결
		private static  ProductDAO instance  = new ProductDAO();
		public static ProductDAO  getInstance() {
			return instance;
		}
		private Connection getConnection() throws Exception{
		Context initCtx = new InitialContext();
		Context envCtx =(Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) envCtx.lookup("jdbc/User");
		return ds.getConnection();
		}
	
		//상품등록
		public void Productregister(Product product) {
			Connection con=null;
			PreparedStatement ps =null;
			
			try {
				con = getConnection();
				String sql = "insert into shoppingproduct values(product_seq.nextval,?,?,?,?,?)";
				ps=con.prepareStatement(sql);
				ps.setInt(1, product.getProducttype());
				ps.setString(2, product.getProductname());
				ps.setString(3, product.getExplanation());
				ps.setInt(4, product.getPrice());
				ps.setInt(5, product.getInventory());
				ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				closeConnection(con, ps);
			}	
		}
		
		//상품 리스트
		public ArrayList<Product> ProductList() {
			Connection con =null;
			Statement st = null;
			ResultSet rs = null;
			ArrayList<Product>arr = new ArrayList<>();
			try {
				con = getConnection();
				String sql = "select * from shoppingproduct";
				st = con.createStatement();
				rs = st.executeQuery(sql);
				while(rs.next()) {
					Product dto = new Product();
					dto.setProductid(rs.getString("productid"));
					dto.setProducttype(rs.getInt("producttype"));
					dto.setProductname(rs.getString("productname"));
					dto.setExplanation(rs.getString("explanation"));
					dto.setPrice(rs.getInt("price"));
					dto.setInventory(rs.getInt("inventory"));
					arr.add(dto);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				closeConnection(con, st, rs);
			}
			return arr;
		}
		
		//상품 목록 리스트
		public ArrayList<Product> ProductList(int producttype) {
			Connection con =null;
			Statement st = null;
			ResultSet rs = null;
			ArrayList<Product>arr = new ArrayList<>();
			try {
				con = getConnection();
				String sql = "select * from shoppingproduct where producttype="+producttype;
				st = con.createStatement();
				rs = st.executeQuery(sql);
				while(rs.next()) {
					Product dto = new Product();
					dto.setProductid(rs.getString("productid"));
					dto.setProducttype(rs.getInt("producttype"));
					dto.setProductname(rs.getString("productname"));
					dto.setExplanation(rs.getString("explanation"));
					dto.setPrice(rs.getInt("price"));
					dto.setInventory(rs.getInt("inventory"));
					arr.add(dto);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				closeConnection(con, st, rs);
			}
			return arr;
		}
		
		
		//상품리스트 검색
		public ArrayList<Product>ProductSearch(String field, String word){
			Connection con = null;
			Statement st = null;
			ResultSet rs = null;
			ArrayList<Product> arr = new ArrayList<>();
			try {
				con = getConnection();
				String sql ="select * from shoppingproduct "+field+" like '%"+word+"%'";
				st = con.createStatement();
				rs = st.executeQuery(sql);
				while(rs.next()) {
					Product dto = new Product();
					dto.setProductid(rs.getString("productid"));
					dto.setProducttype(rs.getInt("producttype"));
					dto.setProductname(rs.getString("productname"));
					dto.setExplanation(rs.getString("explanation"));
					dto.setPrice(rs.getInt("price"));
					dto.setInventory(rs.getInt("inventory"));
					arr.add(dto);
				}
			} catch (Exception e) {
					e.printStackTrace();
			}finally {
				closeConnection(con, st, rs);
			}
			return arr;
		}
		
		//상품 갯수
		public int ProductCount(String field, String word) {
			Connection con=null;
			Statement st =null;
			ResultSet rs =null;
			int count =0;
			String sql="";
			try {
				con = getConnection();
				st =con.createStatement();
				if(word.equals("")) {
					sql = "select count(*) from shoppingproduct";
				}else {
					sql = "select count(*) from shoppingproduct where "+field+" like '%"+word+"%'";
				}
				rs = st.executeQuery(sql);
				if(rs.next()){
					count=rs.getInt(1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				closeConnection(con, st, rs);
			}return count;
		}
		
		//관리자 상세보기
		public Product ProductDetail(int productid) {
			Connection con = null;
			Statement st = null;
			ResultSet rs = null;
			Product dto= null;
			
			try {
				con = getConnection();
				String sql = "select * from shoppingproduct where productid="+productid;
				st = con.createStatement();
				rs = st.executeQuery(sql);
				if(rs.next()) {
					dto =new Product();			
					dto.setProductid(rs.getString("productid"));
					dto.setProducttype(rs.getInt("producttype"));
					dto.setProductname(rs.getString("productname"));
					dto.setExplanation(rs.getString("explanation"));
					dto.setPrice(rs.getInt("price"));
					dto.setInventory(rs.getInt("inventory"));
				}
			} catch (Exception e) {
					e.printStackTrace();
			}finally {
				closeConnection(con, st, rs);
			}
			return dto;
		}
		
		//업데이트
		public void ProductUpdate(Product product) {
			Connection con = null;
			PreparedStatement ps =null;
			try {
				con =getConnection();
				String sql = "update shoppingproduct"
						+ " set producttype=?, productname=?, explanation=?, price=?, inventory=?"
						+ " where productid=? "; 
				ps = con.prepareStatement(sql);
				ps.setInt(1, product.getProducttype());
				ps.setString(2, product.getProductname());
				ps.setString(3, product.getExplanation());
				ps.setInt(4, product.getPrice());
				ps.setInt(5, product.getInventory());
				ps.setString(6, product.getProductid());
				ps.executeUpdate();
			} catch (Exception e) {
					e.printStackTrace();
			}finally {
				closeConnection(con, ps);
			}
		}
		
		//삭제
		public void ProductDelete(int productid) {
			Connection con = null;
			Statement st =null;
			
			try {
				con = getConnection();
				String sql = "delete from shoppingproduct where productid="+productid;
				st = con.createStatement();
				st.executeUpdate(sql);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				closeConnection(con, st, null);
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
