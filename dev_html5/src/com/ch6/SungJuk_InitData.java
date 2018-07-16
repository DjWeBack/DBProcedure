package com.ch6;

public class SungJuk_InitData {
	public String[][] initData() {//파라미터에 선언된 변수는 지역변수이고, 배열이므로 원본의 주소번지를 갖는다.
		//배열을 리턴값으로 지정한다.
		System.out.println("initData 호출 성공");
		String[][] datas = {
							 {"1","이순신","70","80","90","","",""}
							,{"2","김유신","55","72","89","","",""}
							,{"3","권율","66","88","99","","",""}
							};
		return datas;
	}


}
