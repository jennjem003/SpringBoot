package edu.pnu.dao.member;

import java.util.List;
import java.util.Map;

import edu.pnu.domain.MemberVO;

public interface MemberDao {

	Map<String, Object> getMembers();

	Map<String, Object> getMember(Integer id);

	Map<String, Object> addMember(MemberVO member);

	Map<String, Object> updateMember(MemberVO member);

	boolean deleteMember(Integer id);

}