package com.ch7;

public class  Marine extends Blood{
	public Marine() {
		this.move(350, 150);
		this.stop();
		this.stimPack();
	}
	@Override
	void move(int x, int y) {
		System.out.println("===============마린=============");
		x=500;
		y=150;
		System.out.println("블러드! 생성되자마자 "+x+","+y+"로 이동중");
	}
	@Override
	void stop() {
		System.out.println(x+","+y+"위치로 이동 완료 후 정지!!!");
	}
	@Override
	void stimPack() {
		System.out.println("적을 만났다 공격할때 스팀팩 시전!");
	}

}
