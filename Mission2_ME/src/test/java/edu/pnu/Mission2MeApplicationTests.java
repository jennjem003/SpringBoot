package edu.pnu;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.pnu.DAO.MemberDAO;
import edu.pnu.domain.Member;


@SpringBootTest
class Mission2MeApplicationTests {
	@Autowired
	MemberDAO memberDao;

	//@Test
	void contextLoads() {
		System.out.println("이것은 테스트입니다.");
	}
	
	@Test
	void testMememberDAO() {
		System.out.println("이것은 MemberDAO를 테스트입니다.");
		MemberDAO memberDao = new MemberDAO();
		
		//List<Member> list = memberDao.getMembers();
		//for(Member m : list) {
		//	System.out.println(m);
		//}
	}


}
