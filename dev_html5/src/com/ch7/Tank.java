package com.ch7;

public class Tank extends Blood {
	public Tank() {
	this.move(350, 150);
	this.stop();
	this.changeMode();
}
	@Override
	void move(int x, int y) {
		System.out.println("===============탱크=============");
		x=150;
		y=150;
		System.out.println("블러드! 생성되자마자 "+x+","+y+"로 이동중");
	}
	@Override
	void stop() {
		System.out.println(x+","+y+"위치로 이동 완료 후 정지!!!");
	}
	@Override
	void changeMode() {
		System.out.println("시즈모드 전환!");
	}
}
