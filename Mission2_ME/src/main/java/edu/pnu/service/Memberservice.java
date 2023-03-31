package edu.pnu.service;

import java.sql.DriverManager;
import java.util.List;

import edu.pnu.DAO.MemberDAO;
import edu.pnu.domain.Member;

public class Memberservice {
	MemberDAO memberDAO = new MemberDAO();
	/*
	public Memberservice() {
		Class.forname(null)
		DriverManager.getConnection(null;)
	}
	*/
	public List<Member> getMembers() {
		return memberDAO.getMembers();
	}
	public Member getMember(Integer id) {
		return memberDAO.getMember(id);
	}
	public Member addMember(Member member) {
		// TODO Auto-generated method stub
		return memberDAO.addMember(null);
	}

}
