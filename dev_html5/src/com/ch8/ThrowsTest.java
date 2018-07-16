package com.ch8;

import com.semi.chat0615.MultiClient;

public class ThrowsTest {
	MultiClient mc = null;
	
	public void ThrowsT() throws NullPointerException {
		try {
			mc.action(null, null);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString()+"내부 실행");
		}
		throw new NullPointerException("널포인트익셉션 실행!");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsTest tt = new ThrowsTest();
		try {
			tt.ThrowsT();
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("익셉션 메세지 1 : " + e.getMessage());
			System.out.println("익셉션 메세지 2 : " + e.toString());
		}
		
	}

}
