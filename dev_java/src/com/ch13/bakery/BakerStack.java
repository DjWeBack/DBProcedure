package com.ch13.bakery;

import java.util.Vector;

public class BakerStack {
	private Vector<String> vec = new Vector<String>(10);
	
	public synchronized String pop(String cbread) {
		String bread = null;
		//빵이 있을때
		if(vec.size()>0) {
			vec.remove(bread);
		}
		//빵이 없을때 - 기다림 wait,sleep
		else if(vec.size()==0) {
			try {
				System.out.println("기다려 새꺄");
				this.wait();
				//데드락 상태를 방지하는 코드 - 동기화 코드에서
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return bread;
	}
	//빵을 진열하는 메소드 필요
	public void push(String bread) {
		//Vec에 빵을 추가해야됨.(add)
		vec.add(bread);
		//잠자는 쓰레드 깨우기 - interrupt(),notify(),notifyAll()
		this.notify();
	}
}
