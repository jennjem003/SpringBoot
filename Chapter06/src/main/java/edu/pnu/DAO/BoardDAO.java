package edu.pnu.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.pnu.domain.Board;

public class BoardDAO {
	private Connection con = null;

	public BoardDAO() {
		try {
			// JDBC 드라이버 로드
			Class.forName("org.h2.Driver");

			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Board> getboard() {
		Statement st = null;
		ResultSet rs = null;
		List<Board> list = new ArrayList<>();
		try {
			st = con.createStatement();
			rs = st.executeQuery("select * from board");
			List<Board> boradList = new ArrayList<Board>();
			while (rs.next()) {
				Board board = new Board();
				board.setSeq(rs.getLong(0));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("Writer"));
				board.setContent(rs.getString("Content"));
				board.setCreateDate(rs.getDate(0));
				board.setCnt(0L);
				boradList.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	
}
