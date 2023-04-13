package edu.pnu.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seq;
	private String title;
	
	@Column(updatable = false)
	private String content;
	private String writer;
	
	@Column(insertable = false,updatable = false,columnDefinition = "date default now()")
	private Date createdate;
	
	private Long cnt;
	
}
