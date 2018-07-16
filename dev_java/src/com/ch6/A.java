package com.ch6;

public class A {
	//
//	static C c =new C();
	C c =new C();
	public void MethodA() {
		System.out.println("MethodA호출 성공");
		c.MethodC();
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.c.MethodC();
	}


}
