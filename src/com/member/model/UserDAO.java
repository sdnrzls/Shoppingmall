package com.member.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserDAO {

	//��� ����
	private static  UserDAO instance  = new UserDAO();
	public static UserDAO  getInstance() {
		return instance;
	}
	private Connection getConnection() throws Exception{
	Context initCtx = new InitialContext();
	Context envCtx =(Context) initCtx.lookup("java:comp/env");
	DataSource ds = (DataSource) envCtx.lookup("jdbc/User");
	return ds.getConnection();
	}
	
	//ȸ������
	public void userjoin(User user) {
		Connection con=null;
		PreparedStatement ps =null;
		
		try {
			con = getConnection();
			String sql = "insert into shoppinguser values(?,?,?,?,?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, user.getUserid());
			ps.setInt(2, user.getUsertype());
			ps.setString(3, user.getUsername());
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getBirthdate());
			ps.setString(6, user.getGender());
			ps.setString(7, user.getEmail());
			ps.setString(8, user.getPhone());
			ps.setString(9, user.getAddress());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, ps);
		}
		
	}
	
	//�α���
	public User Userlogin(String userid, String password) {
    	Connection con = null;
    	Statement st = null;
    	ResultSet rs = null;
    	User user=null;
   // 	user.setUsertype(-1);  // -1 ȸ���ƴ�, 0 �Ϲ�ȸ��, 1 ������, 2 �������
    	try {
			con = getConnection();
			String sql = "select  * from shoppinguser where userid='"+userid+"'";        
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) { //id�� ����(ȸ������)
				user = new User();
				if(rs.getString("password").equals(password)) { //�������
					user.setUserid(rs.getString("userid"));
					user.setUsername(rs.getString("username"));
				     user.setUsertype(rs.getInt("usertype")); //usertype�� 1:������ 0:�Ϲ�ȸ��
				}else { // ���Ʋ��
					user.setUsertype(2);
				}
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, st, rs);
		}
    	return user;
    }
	
	//���̵� üũ
	public String idCheck(String userid) {
		Connection con = null;
		Statement st= null;
		ResultSet rs = null;
		String flag = "yes"; // ��밡��
		try {
			con = getConnection();
			String sql = "select * from shoppinguser where userid ='"+userid+"'";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				flag = "no"; //���Ұ���
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, st, rs);
		}
		return flag;
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
