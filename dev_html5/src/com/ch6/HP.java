package com.ch6;
//annotation
public class HP extends Object{
	//같은 이름의 메소드를 3개 정의해 보세요
	//why?
	/*
	 * 무조건 파라미터의 타입이나 갯수가 달라야함.
	 * 접근제한자가 있고 없고는 영향이 없음.
	 * 이턴타입이 있고 없고도 영향이 없음.
	 * 예외를 던지고 안던지고도 영향 없음.
	 */

	public void call() {
		
	}
	public void call(int a) {
		
	}
	public void call(String phonenumber) {
		
	}
	public int call(String phonenumber, double b) {//에러발생 같은메소드로 인식
		return 0;
		
	}
	public void call(String phonenumber, String name) {
		
	}
	public void call(String phonenumber, String name, int a) 
	throws Exception
	{
		
	}
	@Override
	public String toString() {
		return "안녕";
		
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HP hp = new HP();//변수 hp는 지역변수
//		System.out.println(hp.toString());
	}

}
