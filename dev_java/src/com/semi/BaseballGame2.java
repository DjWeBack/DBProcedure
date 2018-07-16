package com.semi;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.util.*;

public class BaseballGame2 implements ActionListener{
	//선언부
	JFrame jf_ball = new JFrame(); //전역변수
	JPanel jp_east = new JPanel();
	JPanel jp_center = new JPanel();
	JButton jbtns[] = new JButton[4]; //객체배열
	String btnn[]= {"새게임","정답","지우기","종료"};
	int nu=0;


	JTextArea jt_tarea = new JTextArea();
	JScrollPane jsp_display = new JScrollPane(jt_tarea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	JTextField jtf_input = new JTextField();
	Random ran = new Random();
	logictest2 logic = new logictest2();
	int user [] = new int[3];

	//이벤트처리는 따로 메소드를 꺼내서 처리한다. - 전역변수
	//화면처리부
	public void initDisplay() {



		for(int nu = 0; nu<jbtns.length; nu++)
		{
			jbtns[nu] = new JButton(btnn[nu]);
			jbtns[nu].addActionListener(this);

		}
		jf_ball.add("East",jp_east);
		jf_ball.add("Center",jp_center);
		jf_ball.setResizable(false);
		jf_ball.setTitle("야구 숫자 게임 ver1.0");
		jf_ball.setSize(400, 400);
		jf_ball.setVisible(true);
		jt_tarea.setBackground(Color.ORANGE);


		///////메인화면////////////
		jtf_input.addActionListener(this);
		//버튼 맵핑

		jp_center.setLayout(new BorderLayout());
		jp_center.setBackground(Color.YELLOW);
		jp_east.setLayout(new GridLayout(4,1,2,2));
		Random rc = new Random();
		
		
		jbtns[0].setBackground(new Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255)));
		jbtns[1].setBackground(new Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255)));
		jbtns[2].setBackground(new Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255)));
		jbtns[3].setBackground(new Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255)));
	
		for(int nu = 0;nu<jbtns.length;nu++)
		{
			jp_east.add(jbtns[nu]);
		}
		jp_center.add(BorderLayout.SOUTH,jtf_input);
		jp_center.add("Center",jsp_display);
		//사용자로부터 값을 입력 받음.
		jf_ball.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jt_tarea.append("야구 숫자 게임 !\n");
		jt_tarea.append("중복값이 존재 할경우 현재 배팅x3\n");
		jt_tarea.append("게임 시작을 위해 새게임을 눌러주세요.\n");
	}

	//게임 로직처리하는 메소드

	public String result(String userInput) {


		int sc = 0;
		int ball = 0;

		int temp=0;

		temp=Integer.parseInt(userInput);

		user[0] = temp/100;
		user[1] = (temp%100)/10;
		user[2] = temp%10;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(user[i]==logic.nansu[j]) {
					if(i==j) {
						sc++;
					}
					else {
						ball++;
					}
				}
			}
		}

		return +sc+"스트라이크"+""+ball+"볼";

	}

	public static void main(String[] args) {
		//insert here - initDispaly호출하기

		BaseballGame bbgame = new BaseballGame();
		bbgame.initDisplay();


	}


	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();//이벤트가 발생한 클래스의 주소번지
		String label = e.getActionCommand();
		String userNum = jtf_input.getText();
		if(obj==jtf_input) {
			jt_tarea.append(jtf_input.getText()+"\n");
			jtf_input.setText("");
			jt_tarea.append(result(userNum));



		}
		else if("새게임".equals(label)) {
			//사용자가 클릭한 버튼의 문제가 새게임? 주소번지(jbtn_new)가 가진 문자열 비교.
			logic.randoms();

		}
		else if("정답".equals(label)) {
			jt_tarea.append(logic.nansu[0]+""+logic.nansu[1]+""+logic.nansu[2]+"\n");
		}
		else if("지우기".equals(label))
		{
			jt_tarea.setText("야구 숫자 게임 !\n"+"중복값이 존재 할경우 현재 배팅x3\n");
			logic.randoms();
		}
		else if("종료".equals(label)) {
			System.exit(0);
		}
	}

}


