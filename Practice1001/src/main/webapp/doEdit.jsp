<%@page import="com.java.www.dao.BoardDao"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>doWrite</title>
</head>
<body>
	<% // 이제 BWriteService에서 구현함!(자바코드는 자바클래스파일에서만!)
	/* // < 파일 >을 받으려면 경로&크기 설정하고
	String uploadpath = "C:/upload";
	int size = 10 * 1024 * 1024;
	
	// 멀티파트 리퀘스트 객체선언 후 MultipartRequest multi = new
	MultipartRequest(request, uploadpath, size, "utf-8", new DefaultFileRenamePolicy());
	String userId = (String) session.getAttribute("sessionId"); // 멀티파트로 받기 String userBtitle =
	multi.getParameter("btitle");
	String userBcontent = multi.getParameter("bcontent");
	String userBfile = multi.getParameter("bfile");
	BoardDao bdao = new BoardDao();
	int result = bdao.insertOne(userId, userBtitle, userBcontent, userBfile); */
	%>
	<c:if test="${result == 1 }">
		<script>
			alert("게시글이 수정되었습니다.");
			location.href = "list.do";
		</script>
	</c:if>
	<c:if test="${result == 0 }">
		<script>
			alert("작업을 수행하지 못했습니다.");
			history.back();
		</script>
	</c:if>
</body>
</html>