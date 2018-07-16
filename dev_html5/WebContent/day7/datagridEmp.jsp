<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>사원관리시스템</title>
	<link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../themes/icon.css?1">
	<link rel="stylesheet" type="text/css" href="../demo/demo.css">
	<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
	<script type="text/javascript">
	function getRowIndex(target){
	    var tr = $(target).closest('tr.datagrid-row');
	    return parseInt(tr.attr('datagrid-row-index'));
	}
	function editrow(target){
	    $('#dg_emp').datagrid('beginEdit', getRowIndex(target));
	}
	function deleterow(target){
	    $.messager.confirm('Confirm','Are you sure?',function(r){
	        if (r){
	            $('#dg_emp').datagrid('deleteRow', getRowIndex(target));
	        }
	    });
	}
	function saverow(target){
	    $('#dg_emp').datagrid('endEdit', getRowIndex(target));
	}
	function cancelrow(target){
	    $('#dg_emp').datagrid('cancelEdit', getRowIndex(target));
	}	
	</script>
</head>
<body>
<script type="text/javascript">
//이문서 전체를 받아주는 객체가 있다.- document - html - head[title태그]&body[table]
//ready - 브라우저가 해당하는 페이지를 요청 받아서(누가 ? - 사용자가 or 업무담당자가, 무엇을?- 페이지, 어디에?-브라우저[URL-도메인])
//서버(톰켓8.5)로 부터 응답을 받아서 결과를 출력한다.
//다운로드가 일어났다.(get방식-노출-보안취약함-인터셉트[서버까지 전달이 안됨],post방식)
//돔(document object model : html - head - body[트리구조])구성이 끝났다. - ready(실행문[function (){실행문;이벤트 처리, 속성추가}]);
//이벤트 처리하려면 태그이름 혹은 태그 아이디 혹은 속성값들 
		$(document).ready(function (){
		/* 데이터그리드 초기화 하기 */
		$("#dg_emp").datagrid({
		    //url:'../json/empJSON.json'
		    url:'./jsonEmpList.jsp'
		   ,singleSelect:true
		   ,columns:[[
				/* 테이블 헤더 초기화 [사원번호 사원명 JOB 입사일자 부서번호] */
				{field:'empno', title:'사원번호', width:100, align:'center', editor:'text'}
			   ,{field:'ename', title:'사원명', width:120, align:'center', editor:'text'}
			   ,{field:'job', title:'JOB', width:150, align:'center', editor:'text'}
			   ,{field:'hiredate', title:'입사일자', width:180, align:'center', editor:'text'}
			   ,{field:'dname', title:'부서명', width:100, align:'center', editor:'text', hidden:'true'}
			   ,{field:'deptno', title:'부서명', width:200, align:'center',  
				 editor:{
					 type:'combobox'
					,options:{
						valueField:'deptno'//실제 서버에 넘어가는 필드
					   ,textField:'dname'//화면에 출력되는 필드
					   ,url:'./jsonDeptList.jsp'
					   ,data:[{
						    "deptno":10,
						    "dname":"ACCOUNTING"
						},{
						    "deptno":20,
						    "dname":"RESEARCH"
						},{
						    "deptno":30,
						    "dname":"SALES"
						    //"selected":true
						},{
						    "deptno":40,
						    "dname":"OPERATIONS"
						}] 
					}
				 }/////////////end of editor
			   }///////////////end of field
			  ,{field:'action',title:'Action',width:80,align:'center',
	                formatter:function(value,row,index){
	                    if (row.editing){
	                        var s = '<a href="javascript:void(0)" onclick="saverow(this)">Save</a> ';
	                        var c = '<a href="javascript:void(0)" onclick="cancelrow(this)">Cancel</a>';
	                        return s+c;
	                    } else {
	                        var e = '<a href="javascript:void(0)" onclick="editrow(this)">Edit</a> ';
	                        var d = '<a href="javascript:void(0)" onclick="deleterow(this)">Delete</a>';
	                        return e+d;
	                    }
	                }
	            }//////////////end of action field
			]]/////////////////end of column
		//Event처리	
		,onSelect:function(index,row){
			//alert("index:"+index+", row:"+row+", row.empno:"+row.empno);
			$("#tb_empno").textbox('setValue',row.empno);
			$("#tb_deptno").textbox('setValue',row.dname);
		}
        ,onEndEdit:function(index,row){
            var ed = $(this).datagrid('getEditor', {
                index: index,
                field: 'productid'
            });
            row.productname = $(ed.target).combobox('getText');
        },
        onBeforeEdit:function(index,row){
            row.editing = true;
            $(this).datagrid('refreshRow', index);
        },
        onAfterEdit:function(index,row){
            row.editing = false;
            $(this).datagrid('refreshRow', index);
        },
        onCancelEdit:function(index,row){
            row.editing = false;
            $(this).datagrid('refreshRow', index);
        }
		});////////////////////end of datagrid
	});////////////////////////end of ready
</script>
	<table id="dg_emp"></table>
<!-- 요기에 텍스트박스 2개만 추가해주세요. -->
<input class="easyui-textbox" id="tb_empno" style="width:100px">	
<input class="easyui-textbox" id="tb_deptno" style="width:150px">	
</body>
</html>
