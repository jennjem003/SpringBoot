package edu.pnu;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.pnu.domain.Board;
import edu.pnu.persistance.BoardRepository;

@SpringBootTest
class Chapter06ThApplicationTests {
	@Autowired
	BoardRepository boardRepository;
	
	//@Test
	void insertdb() {
//		List<Board> board = new ArrayList<>();
//		for(long i=0; i<=10L; i++) {
//			Board.board = new Board();
//			//BoardRepository.boardRepository = new BoardRepository();
//			board.set;
//			board.
//		}
		for(int i = 0; i <10; i++) {
			Board b = new Board();
			b.setCnt(0L);
			b.setContent("content" + i);
			b.setCreatedate(new Date());
			b.setTitle("title"+i);
			b.setWriter("writer");
			boardRepository.save(b);
		}
	}
	
	@Test
	void testdb() {
		boardRepository.findAll();
		System.out.println(boardRepository);
		
		List<Board> list = (List<Board>) boardRepository.findAll();
		for(Board b : list)
			System.out.println(b);
		//System.out.println(list);
		//System.out.println();
//		Board board = new Board();
//		List<Board> list = board.;
//		for(Board b : list) {
//			System.out.println(b);
		
	}
}
