package com.ch4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BaseBallGame {
	//선언부 - 선언부에는 절대로 메소드를 호출하지 않는다.
	JFrame jf_ball = new JFrame();//전역변수
	JPanel jp_east = new JPanel();//동쪽에 붙일 속지
	JPanel jp_center = new JPanel();//JFrame의 중앙에 배치할 속지이다.
	//버튼 4개 추가해봐요 - 버튼에 대해서는 이벤트 처리도 해야되니깐 전역변수로 하자
	//이벤트처리는 따로 메소드를 꺼내서 처리한다.-전역변수
	JButton jbtn_new = new JButton("새게임");
	JButton jbtn_dap = new JButton("정답");
	JButton jbtn_clear = new JButton("지우기");
	JButton jbtn_exit = new JButton("종료");
	//화면처리부
	public void initDisplay() {
		//jp_center속지는 중앙에 JTextArea, 남쪽에 JTextField를 붙일 거니까
		//레이아웃은 BorderLayout으로 지정함.
		jp_center.setLayout(new BorderLayout());
		jp_center.setBackground(Color.YELLOW);
		//버튼 4개를 jp_east속지에 붙이기 위해서는 먼저 레이아웃(배치)지정해야 함.
		jp_east.setLayout(new GridLayout(4,1,2,2));
		//jp_east.setBackground(new Color(120,34,59));
		jp_east.setBackground(Color.pink);
		jp_east.add(jbtn_new);
		jp_east.add(jbtn_dap);
		jp_east.add(jbtn_clear);
		jp_east.add(jbtn_exit);
		//아직 화면에 속지가 보이지 않아요-메모리에는 로딩되어 있지만 jf_ball에 아직 붙이지 않음.
		jf_ball.add("East",jp_east);
		//jp_center속지를 JFrame붙이기
		jf_ball.add("Center", jp_center);
		jf_ball.setResizable(false);
		jf_ball.setTitle("야구숫자게임 Ver1.0");
		jf_ball.setSize(300, 400);//창의 가로와 세로 길이 지정
		jf_ball.setVisible(true);//창 활성화|비활성화
	}
	
	//게임 로직처리하는 메소드
	public String result(String userInput) {
		return "1스 0볼";
	}
	
	//메인메소드
	public static void main(String[] args) {
		//insert here - initDisplay()호출하기
		//내안에 있는 메소드는 인스턴스화 없이 사용할 수 있지. 그런데 non-static은 static영역에서 사용불가니까
		//인스턴스화 해야댐.
		BaseBallGame bbGame = new BaseBallGame();
		bbGame.initDisplay();
	}

}


