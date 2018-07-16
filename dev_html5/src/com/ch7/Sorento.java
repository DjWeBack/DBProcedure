package com.ch7;

public class Sorento extends Suv{
	String carColor = "Black";
	public void SpeedUp() {
		System.out.println("Sorento SpeedUp호출 성공");
	}
	public void SpeedDown() {
		System.out.println("Sorento SpeedDown호출 성공");
	}
	
	public static void main(String args[]) {
		Suv sv = new Sorento();
		sv.speed = 10;
		sv.wheelnum = 4;
		sv.SpeedUp();//오버 라이드 관계이므로 Sorento의 speedup메소드가 호출됨.
		sv.SpeedDown();//오버 라이드 관계이므로 Sorento의 speeddown메소드가 호출됨.
		Suv sv2 = new Suv();
		sv2.speed = 10;
		sv2.wheelnum = 4;
		sv2.SpeedUp();//단순히 부모 클래스(Suv)를 인스턴스화 했기때문에 Suv클래스 안에 있는 speedup메소드가 호출됨
		sv2.SpeedDown();//단순히 부모 클래스(Suv)를 인스턴스화 했기때문에 Suv클래스 안에 있는 speeddown메소드가 호출됨
	}
	
}