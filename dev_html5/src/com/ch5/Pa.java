package com.ch5;

public class Pa  extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0; //지역변수는 무조건 초기화를 해줘야됨.
		Audio au[] = new Audio[3];
		//au[0]= x; //타입이 다르니까 급이 다르니까(클래스>원시형)
		Object obj[] = new Object[3];
		x=10;
		obj[0] = x;
		System.out.println(obj[0]);
	}

}
