package com.ch7;

public abstract class Blood {
	int x,y;

	void move(int x, int y) {
		x=0;
		y=0;
		System.out.println("블러드! 생성되자마자 "+x+","+y+"로 이동중");
	}
	void stop() {

	}
	void stimPack() {
			}
	void changeMode() {
	
	}
	void load() {
	
	}
	void unload() {
		
	}
}
