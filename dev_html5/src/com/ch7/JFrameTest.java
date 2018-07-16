package com.ch7;

import javax.swing.JFrame;

public class JFrameTest extends JFrame {
	//선언부
	//생성자
	public void JFrameTest() {
		initDisPlay();
	}
	//화면처리부
	void initDisPlay() {
		//super - JFrame, 
		this.setSize(500,300);//this - JFrameTest this(); <<생성자 호출
		setVisible(true);
	}
	//메인메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrameTest jft = new JFrameTest(); //디폴트 생성자 호출


	}

}
