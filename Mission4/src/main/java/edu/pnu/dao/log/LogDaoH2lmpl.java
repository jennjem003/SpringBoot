package edu.pnu.dao.log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class LogDaoH2lmpl implements LogDao {

	private Connection con;
	
	public LogDaoH2lmpl() {
        try {
            // JDBC 드라이버 로드
            Class.forName("org.h2.Driver");
    
            con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/springboot", "sa", "");
        }
        catch (Exception e) {            
            e.printStackTrace();
        }
	}
	//DBLog 넣고싶다.H2데이터 들고와야하는거겠지 어떻게 들고오냐

	@Override
	public void addLog(String string, String string2, Map<String, Object> map) {
		//주석처리는 교수님이 가르쳐주신 방법
		//Statement st;
		PreparedStatement psmt;
		try {
			/*
			st = con.createStatement();

			String sqlString = String.format("insert into dblog(f1, f2, ...) values ('%s','%s',%s)",
					string, string, map!=null?"true":"false");
			
			st.executeUpdate(sqlString);
			*/
			
			String sqlString = String.format("insert into dblog(method,sqlstring,success) values ('%s','%s',%s)",
					string, string2, map!=null?"true":"false");
			psmt = con.prepareStatement(sqlString);
			psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block+
			e.printStackTrace();
		}
	}
	

	
	
	
}
