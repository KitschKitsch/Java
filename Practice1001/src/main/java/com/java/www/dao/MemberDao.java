package com.java.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.www.dto.Member;

public class MemberDao {

	// 변수선언(private)
	private Context context;
	private DataSource dataSource;
	private Connection conn;
	private Member member;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private String id, pw, name, phone, gender, hobby;
	private String query;

	// 커넥션 연결 메소드(private)
	private Connection getConnection() {
		Connection connection = null;
		try {
			context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g"); // JNDI (Java Naming and
																						// DirectoryInterface)
			connection = dataSource.getConnection(); // 컨텍스트(Java 애플리케이션에서 서버 자원을 찾는 데 사용되는 API)의 주소
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}// getConnection()

	// 로그인 메소드
	public Member selectLogin(String userId, String userPw) {
		try {
			conn = getConnection();
			query = "SELECT * FROM MEMBER WHERE ID=? AND PW=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId); // 1번 물음표에 매개변수 userId
			pstmt.setString(2, userPw); // 2번 물음표에 매개변수 userPw
			rs = pstmt.executeQuery();

			while (rs.next()) {

				id = rs.getString("ID"); // ID 컬럼 데이터
				pw = rs.getString("PW");
				name = rs.getString("NAME");
				phone = rs.getString("PHONE");
				gender = rs.getString("GENDER");
				hobby = rs.getString("HOBBY");
				member = new Member(id, pw, name, phone, gender, hobby); // 멤버 객체에 담음
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 만약 아직 연결중이면
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
		return member;

	}// selectLogin()

}// MemberDao
