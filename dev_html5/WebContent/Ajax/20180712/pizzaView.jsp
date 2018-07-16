<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function getCustomerInfo(){
		alert("getCustomerInfo 호출 성공")
	}
</script>
</head>
<body>
<p>
Enter your phone number:
<input type="text" size="14" name="m_phone" onChange="getCustomerInfo()">
<div id="d_msg"></div>
</p>
<p>
Your name:
<input type="text" size="14" name="m_name" readonly>
</p>
<p>
Your order will be delivered to:<br>
<textarea id="m_addr" rows="4" cols="50" name="m_addr">
</textarea>
<br>Type your order in here:<br>
<textarea id="m_addr" rows="4" cols="50" name="m_order">
</textarea>
</p>
<input type="button" value="주문" onclick="myOrder()">
</body>
</html>