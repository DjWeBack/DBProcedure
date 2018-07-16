package com.ch8;

import com.test2.ChatServer;

public class ExceptionTest {
	ChatServer cs=null;
	ExceptionTest(){
		Exception();
		
	}
	
		public void Exception() {
	
		try {
			cs.SocketStart();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("에러 내용 : "+e.toString());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExceptionTest();
	}

}
