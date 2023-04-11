package edu.pnu.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.pnu.domain.Board;
import edu.pnu.service.BoardService;

//@RestController 작동되는지 확인하는거~~
@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	@RequestMapping("/getBoardList")//(value = "/getBoardList", method = RequestMethod.GET)
	public String getBoardList(Model model, Board board) {
	//public List<Board> getBoardList(Model model) {
		List<Board> boardList= boardService.getBoardList(board);
		
		model.addAttribute("boardList", boardList);
		return "getboardlist";


		/*
		List<Board> boardlist = new ArrayList<>();
		for(long i = 1; i <= 10L; i++) {
			Board board = new Board();
			board.setSeq(i);
			board.setTitle("게시판 프로그램 테스트");
			board.setWriter("도우너");
			board.setContent("게시판 프로그램 테스트입니다...");
			board.setCreateDate(new Date());
			board.setCnt(0L);
			boardlist.add(board);
		}
		model.addAttribute("boardlist",boardlist);
		//return "/WEB-INF/getboardlist.jsp";
		return "getboardlist";//어플리케이션 프로퍼티에 추가하면 생략 가능
		//return boardlist;
		 */
		
	}
	
	@GetMapping("/insertBoard")
	public String insertBoardView() {
		return "insertBoard";
	}
	
	@PostMapping("/insertBoard")
	public String insertBoard(Board board) {
		boardService.insertBoard(board);
		return "redirect:getBoardList";
	}
	
	@GetMapping("/getBoard")
	public String getBoard(Board board, Model model) {
		model.addAttribute("board", boardService.getBoard(board));
		return "getBoard";
	}
}
