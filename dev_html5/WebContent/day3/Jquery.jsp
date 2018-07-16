<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.12.0.js">
</script>
<style type="text/css">
	.from0{color:orange}
	.from1{color:red}
	.from2{color:pink}
</style>
</head>
<body>>
<input type = "text" id="mem_id">
<script type = "text/javascript">
	function sonata() {
		
	}
	$(document).ready(function (){
		//alert("ready 호출 성공 :"+$("mem_name").val());
		$("h4").each(forEach);
		$("h4").click(whenClick);
	});
	function forEach(){
		$(this).attr("class","from"+i);
		i++;
	}
	function whenClick(){
		$(this).append("+");
		$(this).prepend("#");
	}
	var u_id = document.getElementById("mem_id").value;
	var u_id2 = $("#mem_id").val();
	var u_pw = $("#mem_pw").val();
	document.write("아이디 :"+u_id2+", 비번: "+u_pw);
</script>
<input type="text" id="mem_name" value="박의">
<!-- 
html태그는 block요소와 inLine요소로 나눌 수 있다.
블럭요소:자체 크기를 가진다. <h4>,<hr>,<div>,<p>
인라인요소:<img>,<b>,<span>,<a>
 -->
<h4 class="tb_tit">맛집탐방 - 나만 알고 싶은 그곳</h4>
<h4 class="tb_tit">JQuery - 크로스브라우징서비스를 제공함</h4>
<h4 class="tb_tit">$ - JQuery대신 사용하는 특수문자</h4>
</body>
</html>