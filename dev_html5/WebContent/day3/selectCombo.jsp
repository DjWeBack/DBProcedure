<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>selectCombo</title>
</head>
<body>
<script type="text/javascript">
  $(document).ready(function(){
	  $("#subject").change(function (){
		  var selectedText = $("#subject option:selected").text();
		  $("#choice").val(selectedText);
	  });
  	  $("#food").change(function(){
  		  var selectedText = "";
  		  $("#food option:selected").each(function(){
  			  selectedText+=$(this).text()+" ";
  		  $("#f_choice").val(selectedText);
  });
  	  });
  });
</script>
문제 1. 다음 중에서 재덕이가 좋아하는 과목을 선택하세요?<br>
<br>
<select id="subject">
	<option>html</option>
	<option>javascript</option>
	<option>java</option>
	<option>oracle</option>
</select><br>
<br>
<input type="text" id="choice"><!-- 재덕이가 선택한 과목명을 출력하시오 .--><br>
문제 2. 다음 중에서 은비가 좋아하는 간식을 두 개 선택하세요?<br>
<br>
<select id="food" multiple="multiple">
	<option>삼겹살</option>
	<option selected="selected">꽃등심</option>
	<option>차돌박이</option>
	<option>스테이크</option>
</select><br>
<input type="text" id="f_choice"><br>
문제 3. 다음 중에서 보현이가 좋아하는 하체운동은 무엇인가요?<br>
<br>
<select id="train">
	<input type="checkbox" id="train1" values="스쿼트">스쿼트
	<input type="checkbox" id="train2" values="런지">런지
	<input type="checkbox" id="train3" values="V스쿼트">V스쿼트
	<input type="checkbox" id="train4" values="스미스머신">스미스머신
</select><br>
<input type="text" id="t_choice">

</body>
</html>