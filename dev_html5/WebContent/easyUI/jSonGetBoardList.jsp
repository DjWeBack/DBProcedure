<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>
<%@ page import="com.google.gson.Gson" %>
<% 
	List<HashMap<String,Object>> boardList = new ArrayList<HashMap<String,Object>>();
	HashMap<String,Object> map = new HashMap<String,Object>();
	
	map.put("code",5);
	map.put("b_title","게시판 연습");
	map.put("b_writer","이순신");
	boardList.add(map);
	map = new HashMap<String,Object>();
	map.put("code",4);
	map.put("b_title","게시판 연습2");
	map.put("b_writer","김유신");
	boardList.add(map);
	map = new HashMap<String,Object>();
	map.put("code",3);
	map.put("b_title","게시판 연습3");
	map.put("b_writer","이성계");
	boardList.add(map);
	map = new HashMap<String,Object>();
	Gson g = new Gson();
	String jsonboard = g.toJson(boardList);
	
	out.print(jsonboard);
	
%>