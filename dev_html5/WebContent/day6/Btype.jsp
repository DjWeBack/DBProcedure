<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="../themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../themes/icon.css">
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script type="text/javascript">
function methoadA(){
	alert("11");
}
</script>
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
$(document).ready(function(){
	//alert: "11";
	//methoadA();
	$('#dg_chat').datagrid({
		url:'jsonChat.jsp',
		columns:[[
			{field:'code',title:'닉네임',width: '100'},
			{field:'name',title:'방이름',width: '100'},
			{field:'price',title:'상태',width: '100',align: 'right'}
		]]
	});
	
});
</script>
	<table id="dg_chat" class="easyui-datagrid">
		<tbody>
			<tr>
				<td>001</td>
				<td>name1</td>
				<td>234234</td>
			</tr>
		</tbody>
	</table>
</body>
</html>