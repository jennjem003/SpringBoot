package edu.pnu.service;

import java.util.List;

import edu.pnu.DAO.BoardDAO;
import edu.pnu.domain.Board;

public class BoardService {

private BoardDAO boardDao;
	
	public BoardService() {
		this.boardDao = new BoardDAO();
	}
	
	public List<Board> getboard() {
		return boardDao.getboard();
	}


}
