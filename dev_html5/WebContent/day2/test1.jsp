
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>문제 1</title> 
<script type="text/javascript">	
	function next(){
		if(document.f_test1.cb_1.checked ==1){ 
			alert("1번 체크"); 
			dap=1; 
			document.f_test1.htest1.value=1;
			} 
		else if(document.f_test1.cb_2.checked ==1){ 
			alert("2번 체크"); 
			dap=2; 
			document.f_test1.htest1.value=2;
			} 
		else if(document.f_test1.cb_3.checked ==1){ 
			alert("3번 체크"); 
			dap=3; 
			document.f_test1.htest1.value=3;
			} 				
		else if(document.f_test1.cb_4.checked ==1){ 
			alert("4번 체크"); 
			dap=4; 
			document.f_test1.htest1.value=4;
			}
		alert("사용자가 선택한 답안지 정보를:"+document.f_test1.htest1.value);
		for(var i=0;i<document.f_test1.elements.length;I++) {
			if(document.f_test1.cb[i].checked==1){
				document.f_test1.htest2.value = temp;
			}else{
				temp = temp+1;
				}
			}
			alert("2.사용자가 선택한 답안지 정보를:"+document.f_test1.htest2.value);
			document.f_test1.submit(); 
}
<!-- //전송된다(브라우저->서버[Tomcat-dev_html5]->목적지) -->
</script>
</head>
<body>
	a.html - 폼 태그에 가둔 컴퍼넌드에 value만 서버로 전송할 수 있다.<br>
	<form name="f_test1" method="get" action="./b.html">
		<input type="hidden" name="htest1"> <br> 
		<input type="hidden" name="htest2"> <br> 
		<input type="checkbox" name="cb_1">select<br> 
		<input type="checkbox" name="cb_2">insert<br> 
		<input type="checkbox" name="cb_3">update<br> 
		<input type="checkbox" name="cb_4">delete<br>
		<input type="button" value="다음" onClick="next()">
		<br>
		<input type="checkbox" name="cb">추상클래스<br> 
		<input type="checkbox" name="cb">인터페이스<br> 
		<input type="checkbox" name="cb">일반클래스<br> 
		<input type="checkbox" name="cb">메소드<br> 
		<input type="button" value="다음" onClick="next()">
	</form>
</body>
</html>