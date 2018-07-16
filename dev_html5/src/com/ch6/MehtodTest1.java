package com.ch6;

public class MehtodTest1 {
	MehtodTest1 mt2 = new MehtodTest1();
	public static void mehtodA() {}
	public final void mehtodB() {}
	public void mehtodC() {}
	public static int mehtod1() {return 0;}
	public final String mehtodB1() {return "안녕";}
	public double mehtodC1() {double d=0.5; return d;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mehtodA();
		MehtodTest1 mt1 = new MehtodTest1();
		mt1.mehtodB();
		mt1.mehtodC();
		mt2.mehtodA();
		//전역변수 mt2는 main메소드에서 접근할 수 없다.
		//mt2는 non-static타입이기때문에 불가능
		//클래스 앞에 static를 붙이면 사용가능
		//하지만 스태틱을 붙이게되면 공유가 되므로 복제본사용이아닌 원본을 공유하게됨,
		mt1.mt2.toString();
		//mt2변수를 non-static으로 선언해서 접근 하고싶다면. 주소번지를 두번사용하면 호출 가능.
		//mt1은 지역변수로 메모리에 로딩을 시켜줘서 클래스를 복제하게됨.
		//복제된 mt1클래스 안에 있는 mt2를 사용할수 있음.
		mt1.mt2.mehtodA();
		mt1.mehtodC();
		

	}

}
