package com.ch7;

import com.base.Sonata;

public class ReturnTest {
	public Sonata getMyCar() {
		//insert here
		Sonata myCar = new Sonata();
		return myCar;
	}
	public HP getMyHp() {
		HP myHp = new IPhone();
		return myHp;
	}
	public Duck getMyDuck() {
		Duck myDuck = new Duck();
		return myDuck;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTest rt = new ReturnTest();
		rt.getMyCar();
		
	}

}
