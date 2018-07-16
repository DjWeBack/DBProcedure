package com.ch5;

/*
 * 배열의 선언과 초기화
 */
 // public -접근제한자 >protected >friendly >private
public class ArrayTest2 {

	String names[]=null; //전역변수
	void namesInit() {
		names = new String[3];
		names[0] = "이길한";
		names[1] = "박의";
		names[2] = "유재덕";
	}
	void test22() {
		namesInit();
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTest2 at2 = new ArrayTest2();
		//문제
		//이길한, 박의, 유재덕 세친구의 이름을 출력하는 메소드를 구현해 보세요.
		at2.names = new String[3]; //생성해줌.
		at2.namesInit();
		
		at2.test22();
		
		at2.names[0] = "노은비";
		at2.names[1] = "이정렬";
		at2.names[2] = "원영식";
		at2.test22();
		

		int is[]=null; //지역변수
		is = new int[3]; 
		//non-static 변수 names를 static영역안에서 사용할수 있다.
	}
}



