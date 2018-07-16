package com.ch13;

public class ThreadTest extends Thread{
	int i=0;
	@Override
	public void run() {
		for(int i=1;i<100;i++) {
			System.out.println("run");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest t1 = new ThreadTest();
		t1.start();
		for(int i=1;i<100;i++) {
		System.out.println(t1.i);
		}
	}


}
