<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>온라인 시험</title>
<script type="text/javascript">
	function conform() {
		 //이름으로 값을 가져오기
		/* var v_testno = document.f_test.test_no.value;
		var v_testname = document.f_test.test_name.value;
		alert("수험번호:"+v_testno+",이름:"+v_testname);
		//아이디로 값을 가져오기
		var v_testno = document.getElementById("test_no").value;
		var v_testname = document.getElementById("test_name").value;
		alert("수험번호2:"+v_testno+",이름2:"+v_testname);  */
		document.f_test.submit();
	}
</script>
</head>
<body>
<table align="center" border="1" width="900px" height="600px">
	<tr>
		<td valign="middle">
<!-- 수험생 검증화면 시작 -->
	<form name="f_test" method="get" action="./OnlineConform.jsp">		
		<table width="250px" height="60px" align="center">
			<tr><td height="25px">수험번호 : <input type="text" name="test_no"size="15"></td></tr>
			<tr><td height="25px">이&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;름 : <input type="text" name="test_name"size="15"></td></tr>
			<tr><td>남 : <input type="radio"> 여: <input type="radio">
			<tr><td height="30px"align="center">
				<input type="button" value="확인" onClick="conform()">
			</td></tr>
		</table>
	</form>	
<!-- 수험생 검증 화면 끝 -->		
		</td>
	</tr>
</table>
</body>
</html>