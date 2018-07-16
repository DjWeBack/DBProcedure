package com.ch7;

public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter outt = new Outter();
		outt.go();
		Outter.Inner inn = outt.new Inner();
//		Outter.Inner inn2 = new outt.Inner();
		inn.come();
	}

}
