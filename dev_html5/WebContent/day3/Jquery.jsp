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
		//alert("ready ȣ�� ���� :"+$("mem_name").val());
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
	document.write("���̵� :"+u_id2+", ���: "+u_pw);
</script>
<input type="text" id="mem_name" value="����">
<!-- 
html�±״� block��ҿ� inLine��ҷ� ���� �� �ִ�.
�������:��ü ũ�⸦ ������. <h4>,<hr>,<div>,<p>
�ζ��ο��:<img>,<b>,<span>,<a>
 -->
<h4 class="tb_tit">����Ž�� - ���� �˰� ���� �װ�</h4>
<h4 class="tb_tit">JQuery - ũ�ν�����¡���񽺸� ������</h4>
<h4 class="tb_tit">$ - JQuery��� ����ϴ� Ư������</h4>
</body>
</html>