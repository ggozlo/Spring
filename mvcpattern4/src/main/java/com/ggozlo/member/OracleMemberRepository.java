package com.ggozlo.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OracleMemberRepository {
	private final DataSource dataSource;
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet res;
	
	@Autowired
	public OracleMemberRepository(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void memberSave(Member member) {
		try {
			conn = dataSource.getConnection();
			String sql = "INSERT INTO MEMBER VALUES (?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getName());
			psmt.setString(2, member.getTel());
			psmt.setString(3, member.getEmail());
			psmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
				try {
					if(conn != null)conn.close();
					if(psmt != null)psmt.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
	public List<Member> memberList() {
		List<Member> list = new ArrayList<Member>();
		try {
			conn = dataSource.getConnection();
			String sql = "SELECT * FROM MEMBER";
			psmt = conn.prepareStatement(sql);
			res = psmt.executeQuery();
			if(res.isBeforeFirst()) {
				while(res.next()) {
					list.add(new Member(
							res.getString(1), 
							res.getString(2), 
							res.getString(3)));
				}
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
				try {
					if(conn != null)conn.close();
					if(psmt != null)psmt.close();
					if(res != null) res.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return list;
	}
	
}
