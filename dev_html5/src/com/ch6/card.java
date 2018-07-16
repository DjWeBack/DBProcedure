package com.ch6;
/*
 * 나는 생성자를 선언할 수 있다.
 * 나는 내가 필요한 생성자를 호출할 수 있다.
 */
public class card {
	int i; 
	card(){
		System.out.println("디폴트 생성자");
	}
	card(double a){
		System.out.println("파라미터가 더블인 생성자");
		
	}

	card(int i){//복사됨.
		this.i=i; //this는 자기자신 클래스를 가르킬 때 사용하는 예약어
		System.out.println("k:"+i);
		System.out.println("i:"+i);
		System.out.println("파라미터가 인트인 생성자");
	}
	card(int k,String w){
		System.out.println("파라미터가 인트와 스트링인 생성자");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		card c = new card(10);//인스턴스화. 호출하기.
		new card(10);
		new card(c.i);
		new card(10,"weback"); //생성자 호출
		new card(8.8);
		System.out.println(c.i);
		 
		
	}

}
