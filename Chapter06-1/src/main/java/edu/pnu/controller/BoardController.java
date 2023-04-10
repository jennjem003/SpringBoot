package edu.pnu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.pnu.domain.DBoard;
import edu.pnu.service.BoardService;

@RestController
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@GetMapping("/Board")
	//public List<DBoard> getBoardList(Model model){
	public void getBoardList(Model model){
		
		List<DBoard> list = boardService.getBoardList();
		model.addAttribute("boardlist",list);
		//return boardService.getBoardList();
	}
	
	@GetMapping("/Board")
	public List<DBoard> getBoard(Long seq){
		if (seq == null) {
			System.out.println("getBoard : All");
			return boardService.getBoardList();
		}
		
		System.out.println("getBoard : "+ seq);
		
		//DBoard board = boardService.getBoard(seq);
		List<DBoard> list = new ArrayList<>();
		list.add(boardService.getBoard(seq));
		return list;
	}
	
//	public DBoard getBoard(Long seq){
//		return boardService.findById(seq);
//	}
	
	@GetMapping("/Board/{seq}")
	public DBoard getBoardbyPath(@PathVariable Long seq){
		return boardService.getBoard(seq);
	}
}
