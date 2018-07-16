package com.ch7;

public class Dropship extends Blood{
	public Dropship() {
	this.move(350, 150);
	this.stop();
	this.load();
	this.unload();
}
	@Override
	void move(int x, int y) {
		
		x=350;
		y=150;
		System.out.println("===============드랍쉽=============");
		System.out.println("블러드! 생성되자마자 "+x+","+y+"로 이동중");
	}
	@Override
	void stop() {
		System.out.println(x+","+y+"위치로 이동 완료 후 정지!!!");
	}
	@Override
	void load() {
		System.out.println("유닛 태우기");
		
	}
	@Override
	void unload() {
		System.out.println("언덕시야에 내리기");
	}
}
