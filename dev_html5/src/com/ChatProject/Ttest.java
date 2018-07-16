package com.ChatProject;

public class Ttest extends Thread{
	Ttest(){
		for(int i=0;i<10;i++) {
		System.out.println("생성자에서 실행된 시스템 출력"+i);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ttest tt = new Ttest();
		tt.start();
	}
	@Override
	//메인메소드 처럼 사용가능....
	public synchronized void run() {
		try {
			for(int i=0;i<10;i++) {
			System.out.println("쓰레드에서 실행된 시스템 출력."+i);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			for(int i=0;i<10;i++) {
				System.out.println("쓰레드에서 실행된 시스템 출력2. : "+i);
				}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
