package com.java.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.www.dto.Board;

public class BoardDao {

	// DB 연결 변수
	private Context context;
	private DataSource dataSource;
	private Connection conn;

	// 쿼리문 실행 변수
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String query;
	private int result;

	// Board 변수
	private Board board;
	private int bno, bhit, bgroup, bstep, bindent;
	private String id, btitle, bcontent, bfile;
	private Date bdate;

	// 커넥션 연결 메소드
	private Connection getConnection() {
		Connection connection = null;
		try {
			context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
			connection = dataSource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	// 게시글 전체 조회 메소드
	public ArrayList<Board> selectAll() {
		ArrayList<Board> list = new ArrayList<>();
		try {
			conn = getConnection(); // 커넥션(DB) 연결
			query = "SELECT * FROM BOARD ORDER BY BGROUP DESC, BSTEP ASC"; // 쿼리문 입력
			pstmt = conn.prepareStatement(query); // 쿼리문 실행
			rs = pstmt.executeQuery(); // 쿼리문 결과

			// "컬럼이름"에서 결과값 가져오기
			while (rs.next()) {
				bno = rs.getInt("BNO");
				bhit = rs.getInt("BHIT");
				bgroup = rs.getInt("BGROUP");
				bstep = rs.getInt("BSTEP");
				bindent = rs.getInt("BINDENT");
				id = rs.getString("ID");
				btitle = rs.getString("BTITLE");
				bcontent = rs.getString("BCONTENT");
				bfile = rs.getString("BFILE");
				bdate = rs.getDate("BDATE");

				// 리스트에 1 객체씩 담기 (list는 add!)
				list.add(new Board(bno, id, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent, bfile));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}// selectAll()

	// 게시글 1개 조회 메소드
	public Board selectOne(int boardNo) {

		try {
			conn = getConnection();
			query = "SELECT * FROM BOARD WHERE BNO = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();

			// "컬럼이름"에서 결과값 가져오기
			while (rs.next()) {
				bno = rs.getInt("BNO");
				bhit = rs.getInt("BHIT");
				bgroup = rs.getInt("BGROUP");
				bstep = rs.getInt("BSTEP");
				bindent = rs.getInt("BINDENT");
				id = rs.getString("ID");
				btitle = rs.getString("BTITLE");
				bcontent = rs.getString("BCONTENT");
				bfile = rs.getString("BFILE");
				bdate = rs.getDate("BDATE");

				// 객체에 담기
				board = new Board(bno, id, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent, bfile);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return board;
	}// selectOne()

	// 조회수 증가 메소드
	public int updateHit(int bno) {
		
		try {
			conn = getConnection();
			query = "UPDATE BOARD SET BHIT = BHIT+1 WHERE BNO = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bno);
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if (pstmt!=null) pstmt.close();
				if (conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}// updateHit()
	
	// 게시글 작성 메소드
	public int insertOne(String userId, String userBtitle, String userBcontent, String userBfile) {

		try {
			conn = getConnection();
			query = "INSERT INTO BOARD VALUES (BOARD_SEQ.NEXTVAL, ?, ?, ?, SYSDATE, 0, BOARD_SEQ.CURRVAL, 0, 0, ?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setString(2, userBtitle);
			pstmt.setString(3, userBcontent);
			pstmt.setString(4, userBfile);
			result = pstmt.executeUpdate();// executeUpdate는 0 or 1

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}// insertOne()
	
	// 게시글 수정 메소드
	public int updateOne(int userBno, String userBtitle, String userBcontent, String userBfile) {
		
		try {
			conn = getConnection();
			query = "UPDATE BOARD SET BTITLE=?, BCONTENT=?, BFILE=? WHERE BNO=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userBtitle);
			pstmt.setString(2, userBcontent);
			pstmt.setString(3, userBfile);
			pstmt.setInt(4, userBno);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if (pstmt!=null) pstmt.close();
				if (conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}// updateOne()

	public int deleteOne(int userBno) {
		
		try {
			conn = getConnection();
			query = "DELETE BOARD WHERE BNO=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userBno);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if (pstmt!=null) pstmt.close();
				if (conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}// deleteOne()

}
