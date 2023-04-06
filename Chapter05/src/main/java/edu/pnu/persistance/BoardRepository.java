package edu.pnu.persistance;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import edu.pnu.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {
//	List<Board> findByTitle(String searchKeyword);
//	List<Board> findByContentContaining(String title);
//	List<Board> findbyTitleOrContent(String title,int cnt);
	//List<Board> findbyTitleOrderBySeqDesc(String searchKeyword);
	
	@Query("Select b from Board b order by b.seq DESC")
	List<Board> queryAnnotationTest(Pageable paging);
}
