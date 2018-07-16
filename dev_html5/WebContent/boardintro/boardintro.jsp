<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="keywords" content="jquery,ui,easy,easyui,web">
	<meta name="description" content="easyui help you build your web page easily!">
	<title>Build border layout for web pages - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../themes/icon.css">
	<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
	<script type="text/javascript">
		function showcontent(menu){
			$('#content').html('선택하신 메뉴는' + menu + ' 입니다.');
			if(menu=='board'){
				$("#content").panel({
				href:"./board.jsp"
				
				});
				
			}
		}
		$(function(){
			showcontent(' 초기화면');
		});
	</script>
	</head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

<body>
	<h2>계층형 게시판 구현</h2>
	
	<div class="easyui-layout" style="width:900px;height:500px;">
		<div region="west" split="true" title="Navigator" style="width:150px;">
			<p style="padding:5px;margin:0;">업무관리</p>
			<ul>
				<li><a href="javascript:void(0)" onclick="showcontent('login')">로그인</a></li>
				<li><a href="javascript:void(0)" onclick="showcontent('board')">계층형게시판</a></li>
				<li><a href="javascript:void(0)" onclick="showcontent('email')">이메일</a></li>
							
							</ul>
		</div>
		<div id="content" region="center" title="내용" style="padding:5px;">
		</div>
	</div>
	<div id="p_content" class="easyui-panel" title="계층형게시판"></div>


</body>
</html>