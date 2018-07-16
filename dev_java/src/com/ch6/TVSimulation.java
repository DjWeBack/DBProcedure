package com.ch6;

public class TVSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myRoom = new TV(10, 20, 30, 40);
		System.out.println(myRoom.channel+", "+myRoom.volume+", "+myRoom.height+", "+myRoom.width);
		TV parentRoom = new TV(10,70,60,10);
		parentRoom.PowerOff(false);
		System.out.println(parentRoom.channel+", "+parentRoom.volume+", "+parentRoom.height+", "+parentRoom.width);
		TV herRoom = new TV(10,100,true);
		TV yourRoom = new TV(false,50,700);
	}
	

}
