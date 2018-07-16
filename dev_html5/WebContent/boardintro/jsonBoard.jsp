<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="com.boardVO.*" %>
<%@ page import="java.util.List" %>
<%@ page import="com.google.gson.Gson" %>
<%
	BoardDao bdao = new BoardDao();
	List<BoardVO> boardlist = bdao.getBoardList(null);
	Gson gs = new Gson();
	String jsonboard = gs.toJson(boardlist);
	out.print(jsonboard);
%>