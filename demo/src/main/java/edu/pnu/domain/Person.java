package edu.pnu.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//lombok 설치하면 밑에 열심히 달던거 안달고 @만 하면 됌 (p.58)
//롬복은 해당 파일 우클릭-스프링-애드스타터-검색해서 깔아준다
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Person {
	
	public Person(String string, int i, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	private String name;
	private int year;
	private String job;
	private String hobby;
	
	/*
	 * public Person(String name, int year, String job, String hobby) { super();
	 * this.name = name; this.year = year; this.job = job; this.hobby = hobby; }
	 * 
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public int getYear() { return year; } public void
	 * setYear(int year) { this.year = year; } public String getJob() { return job;
	 * }
	 * 
	 * public void setJob(String job) { this.job = job; } public String getHobby() {
	 * return hobby; } public void setHobby(String hobby) { this.hobby = hobby; }
	 * 
	 * @Override public String toString() { return "Person [name=" + name +
	 * ", year=" + year + ", job=" + job + ", hobby=" + hobby + "]";
	 * 
	 * }
	 */
}
	