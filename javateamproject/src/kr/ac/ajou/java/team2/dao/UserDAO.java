package kr.ac.ajou.java.team2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import kr.ac.ajou.java.team2.Model.User;
import kr.ac.ajou.java.team2.db.DBConnection;

public class UserDAO {

	public void addUser(User user) throws SQLException{
		Connection conn = DBConnection.getConnection();
		String sql =""+
					"insert into user"+
					"(name,password,realname)"+
					"values("+
					"?,?,?)";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setString(1, user.getName());
		ptmt.setString(2, user.getPassword());
		ptmt.setString(3, user.getRealname());
		ptmt.execute();
		
			
	}
	
	public void updateUser(User user) throws SQLException{
		Connection conn = DBConnection.getConnection();
		String sql =""+
					"update  user"+
					"(set name=?,password=?,realname=?)"+
					"where id = ?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setString(1, user.getName());
		ptmt.setString(2, user.getPassword());
		ptmt.setString(3, user.getRealname());
		ptmt.setInt(4, user.getId());
		ptmt.execute();
		
		
	}
	
	public void delUser(Integer id) throws SQLException{
		Connection conn = DBConnection.getConnection();
		String sql =""+
					"delete from user"+
					"where id = ?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setInt(1, id);
		ptmt.execute();
		
	}
	
	public User getUser(Integer id) throws SQLException{
		Connection conn = DBConnection.getConnection();
		User user = null;
		String sql =""+
					" select * from user "+
					" where id = ? ";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setInt(1, id);
		ResultSet rs = ptmt.executeQuery();
		while(rs.next()){
			user = new User();
			
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
			user.setRealname(rs.getString("realname"));
			user.setScoreA(rs.getInt("scoreA"));
			user.setScoreB(rs.getInt("scoreB"));
			
		}
		
		
		return user;
	}
	
	public List<User> queryUser() throws Exception{
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs= stmt.executeQuery("select id,name,password from user");
		
		List<User> users = new ArrayList<User>();
		User user = null;
		
		while(rs.next()){
			user = new User();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));	
			
			users.add(user);	
		}
		return users;
	}
	
}
