<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 	
	
	String mem_id = request.getParameter("mem_id");
	//SELECT 1 FROM dual WHERE mem_id='?'
	//SELECT mem_name FROM 멤버 WHERE mem_id=? AND mem_pw=?
	String mem_pw = request.getParameter("mem_pw");
	//브라우저 출력하기 처리
	out.println(mem_id+","+mem_pw);
	
%>	