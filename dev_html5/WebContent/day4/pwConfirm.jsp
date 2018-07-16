<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>암호 확인하기</title>
<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
<script type="text/javascript">
	function dmsgInit(){
		//alert("go호출성공");
		//keyup이벤트가 감지 되면 메세지를 지운다.
		$("#txtPw").keyup(function(){
			$("#d_msg").text("");
		});
		$("#txtPw2").keyup(function(){
			if($("#txtPw").val() != $("#txtPw2").val()){
				$("#d_msg").html("<font color='red'>암호가 틀립니다.</font>");
			}else{
				$("#d_msg").html("<font color='blue'>암호가 일치합니다.</font>");
			}
		});
	}
</script>
</head>
<body>
<script type="text/javascript">
	$(document).ready(function(){
		dmsgInit();
	});
</script>
<table style="border:lpx solid skyblue">  
  <tr>
	<td>암호 : </td><td><input type="password" id="txtPw" size="10"></td>
  </tr>
  <tr>	
  	<td>암호 확인 : </td><td><input type="password" id="txtPw2" size="10"></td>
  </tr>
</table> 		
<div id="d_msg">암호를 입력하시오.</div>
암호 : <textarea rows= "1" cols="40"></textarea><br>
암호 확인 : <textarea rows= "1" cols="40"></textarea><br>
<input type="button" value="확인" onClick="confirm()"> 
</body>
</html>