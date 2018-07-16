
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>¹®Á¦ 1</title>
<script type="text/javascript">
	funtion next() {
		var temp=1;
		for(document.f_test1.cb[i].checked==1){
			document.f_test1.htest.value = temp;
		}else{
			temp = temp + 1;
		}
		document.f_test1.submit();
	}
</script>
</head>
<body>
<form name="f_test1" method="get" action="testForm2.html">
<input type="hidden" name="htest1">
¹®Á¦ 1. ´ÙÀ½ Áß DML±¸¹®ÀÌ ¾Æ´Ñ °ÍÀ» °í¸£½Ã¿À.<br>
<input type="checkbox" name="cb">select<br>
<input type="checkbox" name="cb">insert<br>
<input type="checkbox" name="cb">create<br>
<input type="checkbox" name="cb">delete<br>
<br>
<input type="button" value="´ÙÀ½¹®Á¦"onClick="next()">
</form>
</body>
</html>