<%@page import="java.util.ArrayList"%>
<%@page import="com.boardVO.*, java.util.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	BoardVO bvo = null;
	BoardDao bdao = new BoardDao();
	ArrayList<BoardVO> boardlist = new ArrayList<BoardVO>();
	String b_name 	= request.getParameter("b_name");
	String b_user 	= request.getParameter("b_user");
	String b_comm 	= request.getParameter("b_comm");
	
	bvo = new BoardVO();
	bvo.setB_name(b_name);
	bvo.setB_user(b_user);
	bvo.setB_comm(b_comm);
	
	boardlist.add(bvo);
	
	bdao.getBoardIns(boardlist);
	response.sendRedirect("./board.jsp");

%>