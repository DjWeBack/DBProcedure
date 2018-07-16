<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function send(){
		//document.n_form.submit();
	var u_id=document.getElementById("mem_id").value;
		alert(":"+u_id);
		document.getElementById("i_form").submit();
	}
</script>
</head>
<body>
<!--

 -->
<form name="n_form" id="i_form"method="get"
	action="./FormTestAction.jsp">
	 :<input type="text" id="mem_id" name="mem_id" size="15"><br>
	: <input type="text" id="mem_pw" name="mem_pw" size="15"><br>
	: <input type="teL" id="mem_tel" name="mem_tel" size="15"><br>
	: <input type="number" id="mem_age" name="mem_tel" size="15"><br>
	: <input type="date"><br>
	: <input type="email"><br>
	: <input type="radio"> :<input type="radio"><br>
	: <input type="checkbox"><br>
	: <input type="image" src="#"><br>
	hidden: <input type="hidden" value="haha"><br>
	: <input type="file"><br>
	
	<input type="button" value="전송" onClick="send()">
	<br>
</form>
</body>
</html>