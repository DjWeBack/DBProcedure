package com.ch6;

public class B {
	/*
	 * 클래스안에서 선언된 인스턴스 변수는 전역 인스턴스 변수이지만 역시나 스테틱 안에서는 사용이 불가능함.
	 * 
	 */
	A a = new A();//전역변수


	void MethodB() {
		System.out.println("MethodB출 성공");
		a.MethodA();//스태틱이 아니므로 선언부에서 선언한 전역변수 호출가능
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B Ma = new B();
	
		int a = 0;
		Ma.MethodB();
		

	}

}
