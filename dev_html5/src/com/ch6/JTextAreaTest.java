package com.ch6;

import java.awt.ScrollPane;

import javax.swing.*;
public class JTextAreaTest {
//선언부
	JFrame jf = new JFrame();
	JTextArea jta = new JTextArea("test",5,3);
	JScrollPane jsp = new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	JTextAreaTest jta_test = null;//반드시 null로 선언해야 하는 이유에 대해 말해보기.
	//아래처럼 인스턴스화를 하게되면 복제본을 사용하는거이기 때문에, 원본에 접근할수 없다.
//	JTextAreaTest jta_test2 = new JTextAreaTest();
//생성자
	public JTextAreaTest() {
		System.out.println("JTestAreaTest 디폴트 생성자 호출 성공");
		initDisplay();
		
		
	}
//화면처리메소드
	public void initDisplay() {
		System.out.println("JTestAreaTest 호출 성공");
		jf.add(jsp);
		jf.setSize(500, 400);
		jf.setVisible(true);
		
	}
	public void methodA(JTextAreaTest jta_test) {
		System.out.println("파라미터로 넘긴 주소번지"+jta_test);
		this.jta_test = jta_test;
		jta_test.jf.setSize(300, 500);
		jta_test.jf.setVisible(true);
		jta_test.initDisplay();
	}
	//메인메소드
	public static void main(String[] args) {
		//아래 경우 인스턴스에 대한 주소번지를 가지고 있으므로 파라미터로 넘겨서
		//다른 메소드에서 그 주소번지를 누릴 수 있다.
		//이때 전역변수로 선언하고 파라미터로 초기화를 시켜 주기만 하면 전역변수가
		//그 주소번지를 갖게 되어 파라미터 변수 임에도 불구하고 전역에서 사용가능해짐.
		JTextAreaTest jta_test = new JTextAreaTest(); //얘는 클래스를 인스턴스화 해서 생성자를 호출.
		//아래는 인스턴스 변수가 없으므로 그 원본을 다른 메소드나 생성자에서 사용할수 없다.
		new JTextAreaTest();//얘는 생성자를 호출
		jta_test.initDisplay();
	}

}
