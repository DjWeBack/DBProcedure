<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	//1번 문제에서 넘어온 답안지를 출력해 볼까?
	String test1 = request.getParameter("htest1");
	out.print("1번 문제 답안- "+test1);
			
%>
<!-- //체크박스의 경우 멀티 선택을 지정하는 속성이 제공되지 않으므로 사용자가 만들어서 제공한다.
//체크박스에 onChange이벤트를 추가하여 체크박스에 변화가 발생되면 브라우저가 감지하게 되고
//그 때 test함수가 호출됨.
//이때 파라미터로 0,1,2,3을 받아서 그 값을 cb배열의 인덱스값과 같은지를 비교한다.
//만일 같으면 체크박스에 체크를 해주고 나머지는 0을 대입하여 체크가 해제 되도록 한다. -->
<html><!-- //변수 pcb에는 0,1,2,3 중 하나씩 값이 들어온다. -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title></title>
<script type="text/javascript">
	function test(pcb){//변수 pcb에는 0,1,2,3 중 하나씩 값이 들어온다.
		for(var i=0;i<document.f_test1.cb.length;i++){
			if(pcb==i){
				document.f_test1.cb[i].checked=1;
			}else{
				document.f_test1.cb[i].checked=0;
			}
		}	
	}
	function 

</script>
</head>
<body>
<form name="f_test1" method="get" action="testForm2.html">
<input type="hidden" name="htest1">
문제1. 다음 중 DML구문이 아닌 것을 고르시오.<br>
<input type="checkbox" name="cb" onChange="test(0)">select<br>
<input type="checkbox" name="cb" onChange="test(1)">insert<br>
<input type="checkbox" name="cb" onChange="test(2)">create<br>
<input type="checkbox" name="cb" onChange="test(3)">delete<br>
<br>
<input type="button" value=""onClick="next()">
</form>
</body>
</html>