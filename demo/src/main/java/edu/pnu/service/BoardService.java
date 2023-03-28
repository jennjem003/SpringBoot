package edu.pnu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import edu.pnu.domain.Person;

@Service
public class BoardService {
	
	private List<Person> list = new ArrayList<>();
	
	public BoardService() {
		System.out.println("===> BoardService 생성");
		
		list.add(new Person("고길동", 1000, "백수", "악플"));
		list.add(new Person("이길동", 3000, "백수", "바보"));
	}
	
	public List<Person> getPersons(){
		
		return list;
		
		//return BoardService
	}

	
}
