package edu.pnu.dao.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.pnu.domain.MemberVO;



public class MemberDaoListImpl implements MemberDao {

	private List<MemberVO> list;
	
	public MemberDaoListImpl() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
		for (int i = 1 ; i <= 5 ; i++) {
			list.add(new MemberVO(i, "1234", "이름"+i, new Date()));
		}
	}
	
	@Override
	public Map<String, Object> getMembers() {	
		return null;
	}

	@Override
	public Map<String, Object> getMember(Integer id) {
		for (MemberVO m : list) {
			if (m.getId() == id)
				return (Map<String, Object>) m;
		}
		return null;
	}

	@Override
	public Map<String, Object> addMember(MemberVO member) {
		member.setId(list.size() + 1);
		member.setRegidate(new Date());
		list.add(member);
		return (Map<String, Object>) member;
	}

	@Override
	public Map<String, Object> updateMember(MemberVO member) {
		for (MemberVO m : list) {
			if (m.getId() == member.getId()) {
				m.setName(member.getName());
				m.setPass(member.getPass());
				return (Map<String, Object>) m;
			}
		}
		return null;
	}

	@Override
	public boolean deleteMember(Integer id) {
		for (MemberVO m : list) {
			if (m.getId() == id) {
				list.remove(m);
				return m != null;
			}
		}
		//return null;
		return false;
	}

}
