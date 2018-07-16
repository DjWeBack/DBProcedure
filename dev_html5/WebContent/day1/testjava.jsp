<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	//스크립틀릿 - 자바 땅
	String myName = "이순신";
	//아래print 메소드는 어디에 출력을 내보내는 걸까요? - 브라우저
	out.print("<b>"+myName+"</b>"+"님 환영합니다.");
	

%>
</body>
</html>