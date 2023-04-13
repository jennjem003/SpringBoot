package edu.pnu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.pnu.domain.Board;
import edu.pnu.persistance.BoardRepository;

public class BoardServiceImpl {

	@Autowired
	private BoardRepository boardRepo;
	
	public List<Board> getBoardList(BoardServiceImpl boardServiceImpl){
		return (List<Board>) boardRepo.findAll();
	}
	
	
}
