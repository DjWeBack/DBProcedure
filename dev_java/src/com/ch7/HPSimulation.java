package com.ch7;

public class HPSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상클래스는 단독으로 인스턴스화 할 수 없다. - 구현체 클래스가 반드시 필요함.
		HP hp2 = new IPhone();//선언부와 생성부의 이름이 다르다. - 다형성이 가능하다.
		// IPhone클래스는 HP클래스(추상클래스)를 상속받은 클래스 이므로 생성부를 IPhone로 해주게되면 인스턴스화 가능
		hp2.call(); //추상메소드를 IPhone클래스에서 구현했다.
		hp2.view();//추상메소드를 IPhone클래스에서 구현했다.
		hp2.off();//일반 메소드를 소유할수 있다. - 추상클래스가
		
		hp2 = null;
		// 이 부분에서 Candidate상태로 빠짐. - IPhone - 즉시 삭제가 되는건 아님
		// 언제..? - garbage collector(System.gc())
//		hp2 = new Galaxy();



	}
}
