package edu.pnu.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.pnu.domain.MemberVO;

@Service
public class Mission1Service {

	private List<MemberVO> list = new ArrayList<>();
	Mission1Service mission1Service = new Mission1Service();
	
	public Mission1Service() {
		System.out.println("===> BoardService 생성");
		
		list.add(new MemberVO("1","1234","홍길동","2023-03-22"));
		list.add(new MemberVO("2","1234","고길동","2023-03-21"));
	}
	
	public List<MemberVO> getMembers(){
		
		return list;
		
		//return BoardService
	}


}
