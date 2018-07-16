package com.ch7;

public class Outter {
	int i =10;
	public void go() {
		System.out.println("Outter go메소드 호출 성공");
	}
	class Inner {
		Inner(){
			System.out.println("Inner생성자 호출 성공");
		}
		public void come() {
			System.out.println("Inner클래스 come메소드 호출 성공");
		}
	}
}
