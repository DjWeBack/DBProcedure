package com.ch13.bakery;

public class Baker extends Thread{
	private BakerStack bs = null;
	public Baker(BakerStack bs) {
		this.bs = bs;
	}
	
	public void run() {
		String bread = null;
		for(int i=0;i<3;i++) {
			bread = getBread();
			bs.push(bread);
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("동방예의지국에서 태어나 예의도 모르는 호로새끼");
			}
		}
		
	}
	
	public String getBread() {
		String bread = null;
		switch((int)Math.random()*3) {
		case  0:
			bread = "티라미스";
			break;
		case  1:
			bread = "크림치즈도넛";
			break;
		case  2:
			bread = "몬스터와퍼";
			break;
		}
		return bread;
	}
}
