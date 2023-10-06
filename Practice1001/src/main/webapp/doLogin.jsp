<%@page import="com.java.www.dto.Member"%>
<%@page import="com.java.www.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>doLogin</title>
</head>
<body>
	<%
	String userId = request.getParameter("id");
	String userPw = request.getParameter("pw");

	// 객체선언 후
	MemberDao mdao = new MemberDao();
	// 메소드 호출
	Member member = mdao.selectLogin(userId, userPw);

	if (member != null) {
		session.setAttribute("sessionId", member.getId());
		session.setAttribute("sessionName", member.getName());
	%>
	<script>
		alert("로그인 되었습니다.");
		location.href = "main.jsp";
	</script>
	<%
	} else {
	%>
	<script>
		alert("아이디 또는 비밀번호가 일치하지 않습니다.");
		history.back();
	</script>
	<%
	}
	%>
</body>
</html>