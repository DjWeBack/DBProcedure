<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="com.vo.EmpDao, com.vo.EmpVO" %>
<%@ page import="java.util.List" %>
<%@ page import="com.google.gson.Gson" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
int uempno = Integer.parseInt(request.getParameter("empno"));
EmpDao eDao = new EmpDao();
int result = 0;
result = eDao.empDelete(uempno);

%>
