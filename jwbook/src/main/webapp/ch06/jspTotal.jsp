<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 종합 예제</title>
</head>
<body>
	<%-- 선언과 참조 --%>
	<%!String[] members = { "김길동", "홍길동", "김사랑", "박사랑" };
	int num1 = 10;

	int calc(int num2) {
		return num1 + num2;
	}%>

	<h3>
		1. JSP 주석
		<!-- HTML 주석은 소스보기로 볼 수 있지롱  -->
		<%-- JSP 주석은 소스보기로 볼 수 없지롱 --%>
	</h3>

	<h3>
		<%-- 스크립트릿으로 메서드 호출 --%>
		2. calc(10) 메서드 실행 결과:
		<%=calc(10)%>
	</h3>
	<hr>

	<h3>
		<%-- include 지시자로 파일 불러오기 --%>
		3. include: hello.jsp
	</h3>
	<%@ include file="../hello.jsp"%>

	<h3>
		<%-- 스크립트릿으로 for문 출력 --%>
		4. 스크립트(배열 데이터 출력)
	</h3>
	<ul>
		<%
		for (String name : members) {
		%>
		<li><%=name%></li>
		<%
		}
		%>
	</ul>

</body>
</html>