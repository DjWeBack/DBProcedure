<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="com.ch11.EmpDao, com.vo.DeptVO" %>
<%@ page import="java.util.List" %>
<%@ page import="com.google.gson.Gson" %>
<%
	BoardDao eDao = new BoardDao();
	List<DeptVO> deptList = eDao.getDeptList(null);
	Gson gs = new Gson();
	String jsonDept = gs.toJson(deptList);
	out.print(jsonDept);
%>