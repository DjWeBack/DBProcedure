<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<!-- 공통코드 영역 -->
	<link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../themes/icon.css?1">
	<link rel="stylesheet" type="text/css" href="../demo/demo.css">
	<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
	<script type="text/javascript">
	    function myformatter(date){
	        var y = date.getFullYear();
	        var m = date.getMonth()+1;
	        var d = date.getDate();
	        return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
	    }
	    function myparser(s){
	        if (!s) return new Date();
	        var ss = (s.split('-'));
	        var y = parseInt(ss[0],10);
	        var m = parseInt(ss[1],10);
	        var d = parseInt(ss[2],10);
	        if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
	            return new Date(y,m-1,d);
	        } else {
	            return new Date();
	        }
	    }	
		function idSearch(){
			alert("검색");
		}
		//행추가
		function addRow(){
			$('#dg_member').datagrid('appendRow',{
				mem_id: '',
				mem_name: '',
				mem_gender: '',
				mem_hp:''
			});
		}
		//행삭제
		function delRow(index){
			//alert("삭제할 로우의 index:"+index);
			$('#dg_member').datagrid('deleteRow',index);//화면상에서만 삭제. DB에서 삭제되는 건 아님.			
		}
		//조회 처리
		function search1(){
			//alert("조회 호출 성공");//document.write();//문서 전체 초기화
			$("#dg_member").datagrid({
				url:"./jsonBoard.jsp",
			});
		}
		//등록화면 열기 처리
		function add(){
			//alert("등록 호출 성공");
			$('#dlg_boardadd').dialog('open');
		}
		//수정처리
		function pencil(){
			alert("수정 호출 성공");
		}
		//삭제처리
		function cut(){
			//너 삭제하고 싶은 로우 선택한거야?
			//선택한 로우 정보를 가져올 때
			var row = $("#dg_member").datagrid('getSelected');//오브젝트
			if(row==null){
				return;//cut함수 탈출
			}
			//만일 선택한 로우의 인덱스 정보를 알 수 있다면 좋을텐데........
			var sindex = $("#dg_member").datagrid('getRowIndex',row);
			delRow(sindex);
			//alert(row);//Object....
			//alert(row.mem_id+", index정보는? "+sindex);
		}
		//저장
		function save(){
			alert("저장호출 성공");
		}
		function order2(){
			alert("정렬호출 성공");
		}
		//등록화면에서 저장버튼 구현
		function boardIns(){//실제 오라클서버연동 INSERT처리
			//alert("DB서버에 접속하여 INSERT처리");
			$("#f_memIns").attr("method","get");
			$("#f_memIns").attr("action","./boardIns.jsp");//memInsAction.jsp에서 DB에 INSERT처리할 것임.
			$("#f_memIns").submit();//이 때 사용자PC에서 톰캣서버로 전송이 일어남.		
			$('#dlg_boardadd').dialog('close');
		}
		</script>
</head>
<body>
<script type="text/javascript">
	$("document").ready(function(){
		$("#dg_member").datagrid({
			width:600,
			height:450,
			title:"회원관리",
			toolbar:"#tb_member",
			singleSelect:true,
			selectOnCheck:false,/* checkbox 추가시 주의할 것.-API 예제 소스마다 차이있음. */
			//url:"../json/memberJSON.json",
/* 		    columns:[[
		        {field:'mem_ck',title:'선택',checkbox:'true',width:50},
		        {field:'mem_id',title:'아이디',width:100, sortable:'true'},
		        {field:'mem_name',title:'이름',width:150},
		        {field:'mem_gender',title:'성별',width:50,align:'right'},
		        {field:'mem_hp',title:'HP',width:120,align:'center'}
		    ]], */
		    onLoadSuccess:function(){
		    	//alert("ok");
		    },
		    onLoadError:function(){
		    	alert("fail");
		    },
		    onDblClickRow:function(index,row){
		    	//alert("더블클릭");
		    	//document.write("index:"+index+", row:"+row);
		    	//alert("index:"+index+", row:"+row+", 이름:"+row.mem_name+", hp:"+row.mem_hp);
		    },
		    onCheck:function(index,row){
		    	}
		    });
		    	
		//////////////////////end of datagrid
		$("#pn_member").pagination({
			pageSize:10,
			total:300,
			//태그내 속성보다 스크립트로 추가한 속성이 우선함.
			pageList:[10,15,20,25]
		});
	});
</script>
	<!--============================= 툴바 시작 ==============================-->
	<div id="tb_member">
	<table>
	<!-- 검색기능 추가하기 시작 -->
		<tr><!-- 아이디 검색 and 달력컴포넌트 추가 2층 -->
			<td>
			<input id="ss" class="easyui-searchbox" style="width:200px"
        			data-options="searcher:idSearch,prompt:'아이디입력'"></input>
        	<!-- 등록일 추가 -->
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;등록일	
        	<input class="easyui-datebox" labelPosition="top" data-options="formatter:myformatter,parser:myparser" style="width:150;">
			</td>
		</tr>
	<!-- 검색기능 추가하기  끝   -->
	<!--============================= 버튼 추가 시작 ============================-->
		<tr><!-- 버튼 추가 1층 -->
			<td>	
	    <a href="#" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="javascript:search1()">조회</a>
	    <a href="#" onclick="javascript:addRow()">행추가</a>
	    <a href="#" onclick="javascript:delRow(0)">행삭제</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="javascript:add()">등록</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="javascript:pencil()">수정</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-cut" plain="true" onclick="javascript:cut()">삭제</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="javascript:save()">저장</a>
	    <a href="#" class="easyui-linkbutton" iconCls="icon-order2" plain="true" onclick="javascript:order2()">정렬</a>
			</td>
		</tr>
	<!--============================= 버튼 추가 끝  =============================-->			
	</table>		
	</div>
	<!--============================= 툴바 끝 =================================-->
	<!-- 회원 목록 시작 -->
	<table id="dg_member" class="easyui-datagrid" url="./jsonBoard.jsp">
	        <thead>
            <tr>
                <th field="mem_ck" checkbox="true"></th>
                <th field="b_no" width="120">글번호</th>
                <th field="b_name" width="150">글제목</th>
                <th field="b_user" width="150">작성자</th>
                <th field="b_date" width="80">작성일자</th>
                <th field="b_view" width="170">조회수</th>
            </tr>
        </thead>
	</table>
	<div id="pn_member" class="easyui-pagination" style="width:600px;background:#efefef;border:1px solid #ccc;"
        data-options="total:100,pageSize:10,pageList: [5,10,15,20]">
    </div>
	<!-- 회원 목록 끝   -->
	<!-- 등록화면 시작 -->
	<div id="dlg_boardadd" class="easyui-dialog" title="회원등록" data-options="iconCls:'icon-save',closed:'false',modal:'true',buttons:'#btn_dlg_boardadd'" style="width:400px;height:280px;padding:10px">
        <form id="f_memIns">
        <table>
        	<tr>
        		<td width="150px">글제목</td>
        		<td width="250px"><input class="easyui-textbox" id="b_name" name="b_name" size="12" required="true"></td>
        	</tr>
        	<tr>
        		<td width="150px">작성자</td>
        		<td width="250px"><input class="easyui-textbox" id="b_user" name="b_user" size="15" required="true"></td>
        	</tr>
        	<tr>
        		<td width="150px">내용</td>
        		<td width="250px"><input class="easyui-textbox"  id="b_comm" name="b_comm" size="40"></td>
        	</tr>
        	        </table>  </form>
    </div>
    <!-- 등록화면에 버튼 추가하기 시작 -->
    <div id="btn_dlg_boardadd">
		<a href="javascript:boardIns()" class="easyui-linkbutton">저장</a>
		<a href="javascript:$('#dlg_boardadd').dialog('close');" class="easyui-linkbutton">닫기</a>
	</div>
    <!-- 등록화면에 버튼 추가하기  끝   -->
	<!-- 등록화면  끝   -->
</body>
</html>















