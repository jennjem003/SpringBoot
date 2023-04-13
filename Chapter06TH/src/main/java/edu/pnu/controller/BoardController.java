package edu.pnu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pnu.domain.Board;
import edu.pnu.service.BoardServiceImpl;

public class BoardController {
	@Autowired
	private BoardServiceImpl boardServiceImpl;

	@GetMapping("/hello")
	public void hello(Model model) {
		model.addAttribute("greeting","Hi Thymeleaf");
		//return "/hello.html";이름이 같다면 void로 써줘도 된다!
	}
	@RequestMapping("/getBoardList")
	public String getBoardList(Model model){
		List<Board> boardlist = boardServiceImpl.getBoardList(boardServiceImpl);
		
		model.addAttribute("boardlist", boardlist);
		return "getBoardList";
	}
}
