package com.test;

public class ChatClientThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep((int)(Math.random() * 1000));
			//쓰레드가 동시에 일을 하는것이 아니라 순간적으로 처리하기때문에 동시에 처리하는것 처럼보임 그걸 부군하기 위하여 시간을 줌
		} catch (Exception e) {
			// TODO: handle exception\
			  e.printStackTrace();

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
