<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%
	//한 문제당 배점을 담을 변수
	int perJumsu = 20;
	//맞힌 갯수
	int cnt = 0;
	//판정 하기
	boolean isPass = false;//true이면 합격, false이면 불합격.
	//합격 기준 점수
	int pass = 60;
	String daps[] = {"3","4","1","2","4"};
	String tests[] = new String[5];
	tests[0] = request.getParameter("htest1");
	tests[1] = request.getParameter("htest2");
	tests[2] = request.getParameter("htest3");
	tests[3] = request.getParameter("htest4");
	tests[4] = request.getParameter("htest5");
	for(int i=0;i<daps.length;i++){
		for(int j=0;j<daps.length;j++){
			if(daps[i].equals(tests[j])) {
				if(i==j) {
					cnt++;
				}
			}
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>문제 정답 확인</title>
</head>
<body>
맞힌 갯수 : <%out.print("맞힌 갯수:"+cnt); %> 개 입니다.
당신의 점수는 : <%out.print(perJumsu*cnt); %> 입니다.
<%
	if((perJumsu*cnt)>=pass){
	isPass = true;
	}
	else{
	isPass = false;
	}
	response.sendRedirect("account.ju");

	/* if((perJumsu*cnt)>=pass){
		isPass = true;
	}
	else{
		isPass = false;
	}
	response.sendRedirect("account.jsp?isPass="+isPass); */
%>
</body>
</html>