<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
	<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
	<link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../themes/icon.css">
	<script type="text/javascript">
		function showcontent(menu){
			if(menu=='login'){
				$('#p_content').panel({
				    title:'로그인',
				    href:'login.jsp'
				}); 
			}
			else if(menu=='board'){
				$('#p_content').panel({
				    title:'계층형게시판',
				    href:'board.jsp'
				}); 				
			}
			else if(menu=='email'){
				$('#p_content').panel({
				    title:'이메일',
				    href:'email.jsp'
				}); 			
			}
		}
	</script>
</head>
<body>
<script type="text/javascript">
	$(document).ready(function (){
		$('#p_content').show();
	});
</script>
	<table border="1" borderColor="gray">
		<tr>
			<td>
			<div class="easyui-layout" style="width:900px;height:500px;">
				<div region="west" split="true" title="Navigator" style="width:150px;">
					<p style="padding:5px;margin:0;">Select language:</p>
					<ul>
						<li><a href="javascript:void(0)" onclick="showcontent('login')">로그인</a></li>
						<li><a href="javascript:void(0)" onclick="showcontent('board')">계층형게시판</a></li>
						<li><a href="javascript:void(0)" onclick="showcontent('email')">이메일</a></li>
					</ul>
				</div>
				<div id="content" region="center" style="width:750px;padding:5px;">
					<div id="p_content" title="내용" class="easyui-panel"></div>
				</div>
			</div>			
			</td>
		</tr>
	</table>
</body>
</html>