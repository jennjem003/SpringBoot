package edu.pnu;


import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import edu.pnu.domain.Board;
import edu.pnu.persistance.BoardRepository;

@SpringBootTest
public class BoardQueryMethodTest {

	@Autowired
	BoardRepository boardRepo;
	
	@Test
	public void dataPrepare() {
		for (int i = 0; i <=100; i++) {
			Board b = new Board();
			int n =(int)(Math.random()*100);
			b.setTitle("title" + i);
			b.setContent("content" + i);
			b.setWriter("writer" + i);
			b.setCreateDate(new Date());
			b.setCnt((long)n);

			boardRepo.save(b);
		}
	}
	
	/*
	@Test
	public void testByTitle() {
		List<Board> boardList = boardRepo.findByContentContaining("1");
		System.out.println("검색결과");
		for(Board board : boardList) {
			System.out.println("--->" + board.toString());
		}
	}
	
	@Test
	public void testByTestOrCnt() {
		List<Board> boardList = boardRepo.findbyTitleOrContent("1",50);
		System.out.println("검색결과");
		for(Board board : boardList) {
			System.out.println("--->" + board.toString());
		}
	}
	
	//@Test
	//public void 
	
	
	*/
	@Test
	public void Test() {
		Pageable paging = PageRequest.of(0, 3);
		List<Board> list = boardRepo.queryAnnotationTest(paging);
		
		for(Board b : list)
			System.out.println(b);
	}
}
