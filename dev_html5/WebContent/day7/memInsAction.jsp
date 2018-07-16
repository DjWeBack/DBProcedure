<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String mem_id 		= request.getParameter("mem_id");
	out.print("아이디:"+mem_id);
	String mem_name 	= request.getParameter("mem_name");
	out.print("이름:"+mem_name);
	String mem_gender 	= request.getParameter("mem_gender");
	out.print("성별:"+mem_gender);
	String mem_hp 		= request.getParameter("mem_hp");
	out.print("HP:"+mem_hp);
%>