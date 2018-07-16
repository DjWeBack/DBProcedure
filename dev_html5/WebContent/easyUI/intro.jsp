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
		    	//alert(menu);
	    		$('#p_content').panel({
	    		    width:750,
	    		    height:500,
	    		    href:'login.jsp',
	    		    title:'로그인'
	    		}); 		    	
	    	}else if(menu=='board'){
	    		//alert(menu);
	    		$('#p_content').panel({
	    		    width:750,
	    		    height:500,
	    		    href:'board.jsp',
	    		    title:'계층형게시판'
	    		}); 	    		
	    	}else if(menu=='email'){
	    		//alert(menu);
	    		$('#p_content').panel({
	    		    width:750,
	    		    height:500,
	    		    href:'email.jsp',
	    		    title:'이메일'
	    		}); 	    		
	    	}
		}
	</script>
</head>
<body>
<table border="1px" borderColor="gray" width="900px" height="500px">
	<tr>
		<td>
		<div class="easyui-layout" style="width:900px;height:500px;">
		<!-- West 시작 -->
		    <div region="west" split="true" title="Navigator" style="width:150px;">
		        <p style="padding:5px;margin:0;">Select language:</p>
		        <ul>
		            <li><a href="javascript:void(0)" onclick="showcontent('login')">로그인</a></li>
		            <li><a href="javascript:void(0)" onclick="showcontent('board')">계층형게시판</a></li>
		            <li><a href="javascript:void(0)" onclick="showcontent('email')">이메일</a></li>
		        </ul>
		    </div>
		<!-- West 끝   -->    
		<!-- Center 시작 -->
		    <div id="content" region="center" style="width:750px;padding:5px;">
		    <!-- Panel(easyui) 시작 -->	
		    	<div id="p_content" class="easyui-panel" title="계층형게시판"></div>
		    <!-- Panel(easyui) 끝   -->
		    </div>
		<!-- Center  끝 -->    
	    </div>
		</td>
	</tr>
</table>
</body>
</html>