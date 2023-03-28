package edu.pnu.Controller;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pnu.domain.MemberVO;
import edu.pnu.Service.Mission1Service;

@RestController
public class Mission1Controller {
	
	Mission1Service mission1Service = new Mission1Service();
	
	public 	Mission1Controller() {
		System.out.println("===> 	Mission1Controller 생성");
	}
	
	@GetMapping("/Member")
	public List<MemberVO> getMembers() {
		return mission1Service.getMembers();
	}
	
	/*
	@GetMapping("/member/{id}")
	public MemberVO getMember(@PathVariable Integer id) {

		return mission1Controller.getMember(id);
	}
	
	
	@PostMapping
	public MemberVO addMember(MemberVO memberVO) {
		
		return mission1Controller.addMember(memberVO);
	}
	
	@PutMapping
	public MemberVO updateMembers(MemberVO memberVO) {
		for(MemberVO m : list) {
			if(m.getId() == member.getId()) {
				m.setName(member.getName());
				m.setPass(member.getPass());
				return m;
			}
		}
		//return mission1Controller.updateMembers(memberVO);
	}
	
	@DeleteMapping
	public MemberVO deleteMember(@PathVariable Integer id) {
		for (MemberVO m : list) {
			if(m.getId() == id) {
				list.remove(m);
				return m;
			}
			
		}
		return null;
	}
	*/
}

