package com.rubypaper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.QueryHint;
import javax.persistence.TypedQuery;

import com.rubypaper.domain.Board;
import com.rubypaper.domain.Board1;


public class JPAClient1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Chapter04");
		
		insertBoard(emf);//데이터를 입력
		//findBoardOne(emf,1L);//id가 1인 데이터를 출력
		//findBoardManyJPAQuery(emf);//입력된 전체 데이터를 출력(JPA Query)
		//findBoardManyNativeQuery(emf);//입력된 전체 데이터를 출력(NativeQuery)
		
		//updateBoard(emf, 1L);//id가 1인 데이터를 수정
		//findBoardOne(emf, 1L)//수정된 정보를 확인
		//deleteBoard(emf, 2L);//id가 1인 데이터를 수정
		//findBoardManyJPAQuery(emf);//삭제 결과를 확인
		
		emf.close();
	}


	private static void insertBoard(EntityManagerFactory emf) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			for (int i = 0; i < 10; i++) {
				Board board = Board.builder()
						.title("title" + i)
						.content("content" + i)
						.writer("writer")
//						.createDate(new Date())
						.build();
				em.persist(board);
			}
			tx.commit();
			
			tx.begin();
			
			for(int i = 1; i <= 10; i++) {
				Board1 board1 = Board1.builder()
						.title("title" + i)
						.content("content" + i)
						.writer("writer")
//						.createDate(new Date())
						.build();
				em.persist(board1);
			}
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tx.rollback();
		} finally {
			em.close();
		}

	}

	/*
	private static void findBoardOne(EntityManagerFactory emf, long seq) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		try {
			Board1 searchBoard = em.find(Board1.class, 1L);
			System.out.println("---->" + searchBoard.toString());
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			em.close();
			//emf.close();
		}
	}

	
	private static void findBoardManyJPAQuery(EntityManagerFactory emf) {
		// TODO Auto-generated method stub
		System.out.println("findBoardManyJPAQuery");
		EntityManager em = emf.createEntityManager();
		TypedQuery<Board1> result = em.createQuery("select b from Board b", Board1.class);
		List<Board1> list = result.getResultList();
		//List<Board> list = em.createQuery("select b from Board b", Board.class);
		for(Board1 b : list) {
			System.out.println(b);
		}
		System.out.println("=".repeat(80));
		
		em.close();
	}
	
	
	private static void findBoardManyNativeQuery(EntityManagerFactory emf) {
		// TODO Auto-generated method stub
		System.out.println("findBoardManyNativeQuery");
		EntityManager em = emf.createEntityManager();
		
		//방법 1
		List<?> list1 = em.createNativeQuery("select * from Board", Board1.class).getResultList();
		for(Object b : list1) {
			System.out.println(b);
		}
		System.out.println("-".repeat(60));
		
		//방법 2
		@SuppressWarnings("unchecked")
		List<Object[]> list2 = em.createNativeQuery("select * from Board").getResultList();
		for(Object[] b : list2) {
			for(int i = 0; i < b.length; i++) {
				if(i !=0) System.out.println(",");
				System.out.print(b[i]);
			}
			System.out.println();
		}
		
		System.out.println("=".repeat(80));
		em.close();
	}

	

	private static void updateBoard(EntityManagerFactory emf, long seq) {
		// TODO Auto-generated method stub
		System.out.println("updateBoard");
		
		EntityManager em= emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			
			Board1 board= em.find(Board1.class, 1L);
			board.setTitle("검색한 게시글의 제목 수정");
			
			tx.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			em.close();
		}
		
	}
	
	
	private static void deleteBoard(EntityManagerFactory emf, long seq) {
		// TODO Auto-generated method stub
		System.out.println("deleteBoard");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			Board1 board = em.find(Board1.class, 2L);
			board.setSeq(2L);
			em.remove(board);
			tx.commit();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tx.rollback();
		} finally {
			em.close();
		}
	}

*/

}
