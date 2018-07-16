package com.ch6;

public class Sonata {
	String nb = "";
	String carColor = null;
	int speed = 0;
	int wheelNum = 0;
	public Sonata(String carColor, int speed, int wheelNum){
		this.carColor = carColor;
		this.speed = speed;
		this.wheelNum = wheelNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sonata myCar = new Sonata("white", 0,4);
		System.out.println(myCar.carColor+", "+myCar.speed+", "+myCar.wheelNum);
		}

}
