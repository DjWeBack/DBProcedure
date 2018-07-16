<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>판매관리</title>
<link rel="stylesheet" type="text/css" href="../css/boards.css">
<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
<script type="text/javascript">
	function createRequest(){
		try{
			request = null;
		}
		if(request==null){
			alert("Error creating XMLHttpRequest Object!!!!")
		}
	}
	function account(){
		createRequest();
		var url = "./boardAction.jsp?"+new Date().getTime();
		request.open("GET",url,true);
		request.onreadystatechange = process;
		request.send(null);
	}
	function process(){
		alert("상태값 : "+request.readyState);
		if(request.readyState==4){
			alert("서버에서 받은 응답상태값[예를 들면 200,404,405,500] : "+request.status);
			
			var newTotal = request.responseText;
			alert("새로 집계된 판매량 : "+new Total);
		}
	}
</script>
</head>
<body>
	<h2>웨이크 보드 판매현황</h2>
	<table border="1" width="300px" height="80px">
		<tr>
			<th width="130px">보드판매량</th>
			<td width="170px"><span id="board_sold">12</span></td>
		</tr>
		<tr>
			<th width="130px">소비자가</th>
			<td width="170px"><span id="price">3800000</span></td>
		</tr>
		<tr>
			<th width="130px">구매가</th>
			<td width="170px"><span id="cost">2500000</span></td>
		</tr>
	</table>
	<br>
	<input type="button" value="마진은?" onClick="account()" />
	<div id="d_margin">총 마진금액은 XXXXXXX입니다.</div>
</body>
</html>