package edu.pnu.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.pnu.domain.Member;


public class MemberDAO {
	
	public Connection con;
	public PreparedStatement psmt;
	public ResultSet rs;
	
	//MemberDAO memberDAO = new MemberDAO();
	private List<Member> list;
	
	public MemberDAO() {
		try {
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/springboot","sa","");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}catch(SQLException e) {
			System.out.println("DB 연결 오류");
			e.printStackTrace();
			return;
		}
		
	}
	
	public List<Member> getMembers() {
		List<Member> list = new ArrayList<>();
		
		try {
			psmt = con.prepareStatement("select * from member");
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				Member member = new Member();
				
				member.setId(rs.getInt("id"));
				member.setPass((rs.getString("pass")));
				member.setName((rs.getString("name")));	
				member.setRegidate( (rs.getDate("REGIDATE")));
				
				list.add(member);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public Member getMember(Integer id) {
		
		Member member = new Member();
		
		try {
			psmt= con.prepareStatement("select * from member where id=?");
			psmt.setInt(1, id);
			rs = psmt.executeQuery();
			while(rs.next()){
				member.setId(rs.getInt("id"));
				member.setPass((rs.getString("pass")));
				member.setName((rs.getString("name")));	
				member.setRegidate( (rs.getDate("REGIDATE")));
			}
		} catch (Exception e) {
			// TODO: handle exception
			try {
				rs.close();
				psmt.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return member;
	}
	
	public Member addMember(Member member) {
		try {
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	/*
	public Member updateMember(Member member) {
		for (Member m : list) {
			if (m.getId() == member.getId()) {
				m.setName(member.getName());
				m.setPass(member.getPass());
				return m;
			}
		}
		return null;
	}

	public Member deleteMember(Integer id) {
		for (Member m : list) {
			if (m.getId() == id) {
				list.remove(m);
				return m;
			}
		}
		return null;
	}
	*/
}
