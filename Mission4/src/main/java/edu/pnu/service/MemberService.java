package edu.pnu.service;

import java.util.List;
import java.util.Map;

import edu.pnu.dao.log.LogDao;
import edu.pnu.dao.log.LogDaoH2lmpl;
import edu.pnu.dao.member.MemberDao;
import edu.pnu.dao.member.MemberDaoH2Impl;
import edu.pnu.domain.MemberVO;


public class MemberService {

	private MemberDao memberDao;
	private LogDao logDao;
	
	public MemberService() {
		memberDao = new MemberDaoH2Impl();
		//memberDao = new MemberDaoListImpl();
		
		logDao = new LogDaoH2lmpl();
	}
	
	@SuppressWarnings("unchecked")
	public List<MemberVO> getMembers() {
		Map<String, Object> map = memberDao.getMembers();
//		List<MemberVO> list = (List<MemberVO>) map.get("data");
//		if(list !=null) LogDAO.addLog("get", (String)map.get("sql"),true);
//		else			LogDAO.addLog("get", (String)map.get("sql"),false);
		if (map != null) {

			logDao.addLog("get", (String)map.get("sql"), map);
			return (List<MemberVO>) map.get("data");
		}
		return null;
	}

	public MemberVO getMember(Integer id) {
		Map<String, Object> map = memberDao.getMember(id);
		if (map != null) {
			logDao.addLog("get", (String)map.get("sql"), map);
			return (MemberVO) map.get("data");
		}
		return null;
	}

	public MemberVO addMember(MemberVO member) {
		Map<String, Object> map = memberDao.addMember(member);
		if(map != null) {
			logDao.addLog("get", (String)map.get("sql"), map);
			return (MemberVO) map.get("data");
	    }
		return null;
	}

	public MemberVO updateMember(MemberVO member) {
		Map<String, Object> map = memberDao.updateMember(member);
		if(map != null) {
			logDao.addLog("get", (String)map.get("sql"), map);
			return (MemberVO) map.get("data");
		}
		return null;
	}

	public boolean deleteMember(Integer id) {
		return memberDao.deleteMember(id);
	}

}
