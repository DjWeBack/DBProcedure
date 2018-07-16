package com.ch7;
/*
 * 완결편
 * 부모클래스와 자식클래스 관계(상속)일때
 * 부모클래스는 부모클래스 내에 선언된 변수나 메소드만 누릴수 있다.
 * Parent p = new Child();<<이렇게 인스턴스화를 하게되면 아들껏도 누를수 있음.
 * 이 때 변수 p로 접근할 수 있는 자녀클래스의 methodB이다.
 * 이 때 부모클래스의 methodB는 쉐도우 메소드라고 한다.
 * Parent p = new Parent();
 * 부모클래스보다 자녀클래스가 누릴게 더 많다.
 * 상속받을때는 상위 클래스보다 하위 클래스를 받는 것이 더 누릴게 많다 <<import생각하면 될듯..? 더 많을듯함
 */
public class ParentChildSimulation {

	public static void main(String[] args) {
//		//아빠 메모리에 로딩하기
//		Parent p = new Parent();
//		System.out.println(p.i);
//
//		
//		Child c = new Child();
//		
//		System.out.println(c.i);
//		c.i=100;
//		//부모의 i는 변한다? 안변한다.
//		System.out.println(p.i);
//		System.out.println(c.i);
//		p.i=c.i;
//		p=c;
//		c = (Child)p;
//		System.out.println(p.i);
		
		Parent p1 = new Child();
		//j 는c에있는 변수
		//i 는p에있는 변수 
		p1.i=10;
		p1.MethodA();//자기자신 안에 있는 메소드 A호출
		p1.MethodB();//Child안에 메소드 B를 호출
		Parent p2 = new Parent();
		p2.MethodB();//그냥 무조건 아빠꺼
		Child c2 = new Child();
		c2.j=20;
		c2.MethodA();//<<상속관계에 있는 parent안에 메소드 A를 호출
		c2.MethodB();//자기자신에 있는 메소드b호출//오버라이드
		
		
	}

}
