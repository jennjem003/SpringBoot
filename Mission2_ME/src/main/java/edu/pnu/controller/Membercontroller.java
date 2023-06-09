package edu.pnu.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pnu.DAO.MemberDAO;
import edu.pnu.domain.Member;
import edu.pnu.service.Memberservice;


@RestController
public class Membercontroller {
	private Memberservice memberservice;
	
	private static final Logger log = LoggerFactory.getLogger(Membercontroller.class);
	
	public Membercontroller(Memberservice memberservice) {
		log.info("Membercontroller 생성자 호출");
		
		log.error("Error Message입니다.");
		log.warn("Warn Message입니다.");
		log.error("Error Message입니다.");
		log.debug("debug Message입니다.");
		log.trace("trace Message입니다.");
	}
	
	public Membercontroller() {
		memberservice = new Memberservice();
	}
	
	@GetMapping("/member")
	public List<Member> getMembers() {
		return memberservice.getMembers();
	}

	@GetMapping("/member/{id}")
	public Member getMember(@PathVariable Integer id) {
		log.info("getMember()");
		return memberservice.getMember(id);
	}
	
	@PostMapping("/member")
	public Member addMember(Member member) {
		log.info("addMember()");
		return memberservice.addMember(member);
	}
	/*
	@PutMapping("/member")
	public Member updateMember(Member member) {
		log.info("updateMember()");
		return memberservice.updateMember(member);
	}
	
	@DeleteMapping("/member/{id}")
	public MemberVO deleteMember(@PathVariable Integer id) {
		log.info("deleteMember()");
		return memberService.deleteMember(id);
	}
	*/
}
