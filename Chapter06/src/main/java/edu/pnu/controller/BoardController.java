package edu.pnu.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.pnu.domain.Board;
import edu.pnu.service.BoardService;

@Controller
@Lazy
public class BoardController {
private BoardService boardService;

//	@RequestMapping("/getBoardList")
//	public String getBoardList(Model model) {
//		List<Board> boradList = new ArrayList<Board>();
//		for (int i = 1; i <= 10; i ++) {
//			Board board = new Board();
//			board.setSeq(new Long(i));
//			board.setTitle("타이틀");
//			board.setWriter("Writer");
//			board.setContent("테스트입니다");
//			board.setCreateDate(new Date(i));
//			board.setCnt(0L);
//			boradList.add(board);
//		}
//		model.addAttribute("boradList",boradList);
//		return "getBoardList";
//	}
	
	public BoardController(BoardController boardController) {
		this.boardService = boardService;
	}
	
	@GetMapping("/getboard")
	public List<Board> getboard() {	
		return boardService.getboard();
	}
}

