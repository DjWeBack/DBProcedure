package com.ch7;
// 메소드, 변수앞에 올수 있다. 
// 클래스 앞에는 올수가 없다.
public class StaticTest {
	static int i = 10; //공유, 한개 (원본), 우선순위 높다.
	static {
		System.out.println("Static 블럭");
	}
	//main - main thread(우선순위가 높다 - 순서,시간조절,경합) - entry point
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main메소드");
	}

}
