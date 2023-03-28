package edu.pnu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pnu.domain.Person;
import edu.pnu.service.BoardService;


//@Slf4j
@RestController
public class BoardController {

	BoardService boardService = new BoardService();

	public BoardController() {
		System.out.println("===> BoardController 생성");
		// log.info("===> BoardController 생성");//@Slf4j 쓸때에 윗줄 대신 쓸 수 있는거
	}

	@GetMapping("/hello")
	public String hello(String name) {
		return "Hello : " + name;
	}

	@PostMapping("/hello")
	public String hello1(String name) {
		return "Hello Post : " + name;
	}

	@GetMapping("/getPerson")
	public Person getPerson() {
		return new Person("홍길동", 2000, "백수", "선플");
	}

	/*
	 * @GetMapping("/getPersons") public List<Person> getPersons() { List<Person>
	 * list = new ArrayList<>(); list.add(new Person("고길동", 1000, "백수", "악플"));
	 * list.add(new Person("이길동", 3000, "백수", "바보")); return list;
	 * 
	 * //return BoardService }
	 */
	//@GetMapping("/getPersons")
	//public List<Person> getPersons() {
		//return boardController.getPersons();
	//}

}
