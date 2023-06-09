package edu.pnu.domain;

import java.sql.Date;

/*import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;*/

/*@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
*/
public class MemberVO {

	private int id;	
	private String pass;
	private String name;
	private Date regidate;


	public MemberVO(int id, String pass, String name, Date regidate) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.regidate = regidate;
	}


	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pass=" + pass + ", name=" + name + ", regidate=" + regidate + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getRegidate() {
		return regidate;
	}


	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}


	public MemberVO(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {

	}

}
