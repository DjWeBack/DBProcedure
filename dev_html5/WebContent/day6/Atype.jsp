<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!-- 
    	javascript코드는 html태그안에 어디든(head태그안,body태그) 올 수 있다.
    	head태그는 선언할 때 사용함.(변수-전역변수, 함수), (불러야 실행됨.)
    	body태그는 따로 부르지 않아도 실행이 됨.(주의사항-dom구성먼저)
    	:DOM구성한 정보는 브라우저가 알고 있다.
    	1)DOM구성이 완료되었을 때를 브라우저에 묻고 싶다. - ready()호출
    	2)함수의 파라미터 자리에도 코딩전개(구현) 가능 - 주의사항 {}
    	3)좌중괄호와 우중괄호안에는 속성추가, 이벤트 처리가 가능함.
     -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="../themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../themes/icon.css">

</head>
<body>
	<table border="1" width="500px" class="easyui-datagird" title="메신저">
		<thead>
			<tr>
				<th data-options="field:nickName,width:120">대화명</th>
				<th data-options="field:roomName,width:200">방이름</th>
				<th data-options="field:status,width:120">상태</th>
			</tr>

		</thead>
		<tbody>
			<tr>
				<td>001</td>
				<td>002</td>
				<td>003</td>
			</tr>
		</tbody>
	</table>
</body>
</html>