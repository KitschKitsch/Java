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
	<c:if test="${result == 1 }">
		<script>
			alert("게시글이 삭제되었습니다.");
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