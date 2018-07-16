<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>
<%@ page import="com.google.gson.Gson" %>
<% 
	List<HashMap<String,Object>> boardList = new ArrayList<HashMap<String,Object>>();
	HashMap<String,Object> map = new HashMap<String,Object>();
	for(int i=1;i<30;i++){
	map.put("price",i);
	map.put("name","게시판 연습"+i);
	map.put("code","김"+i);
	boardList.add(map);
	map = new HashMap<String,Object>();
		}
	map = new HashMap<String,Object>();
	Gson g = new Gson();
	String jsonboard = g.toJson(boardList);
		out.print(jsonboard);

%>