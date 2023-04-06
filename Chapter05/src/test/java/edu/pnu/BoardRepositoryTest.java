package edu.pnu;

import java.util.Date;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.pnu.domain.Board;
import edu.pnu.persistance.BoardRepository;

@SpringBootTest
public class BoardRepositoryTest {

	@Autowired
	BoardRepository boardRepo;

//	@Test
//	public void BoardInsertTest() {
//		Board b = new Board();
//
//		for (int i = 0; i < 10; i++) {
//			b.setTitle("title");
//			b.setContent("content");
//			b.setWriter("writer");
//			b.setCreateDate(new Date());
//			b.setCnt(0L);
//
//			boardRepo.save(b);
//		}
//	}
//	 
	@Test
	public void testGetBoard() {
		Board board = boardRepo.findById(1L).get();
		System.out.println(board.toString());
	}

	@Test
	public void testUpdateBoard() {
		System.out.println("=== 1번 게시글 조회 ===");
		Board board = boardRepo.findById(1L).get();

		System.out.println("=== 1번 게시글 제목 수정 ===");
		board.setTitle("제목을 수정했습니다");
		boardRepo.save(board);
	}

	@Test
	public void testDeleteBoard() {
		boardRepo.deleteById(1L);
	}
	
	

}
