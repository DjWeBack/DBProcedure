package com.semi2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class test {

	public static void main(String[] args) {
		JFrame jf_ball = new JFrame(); //전역변수
		JPanel jp_east = new JPanel();
		JPanel jp_center = new JPanel();
		JButton jbtns[] = new JButton[4]; //객체배열
		String btnn[]= {"새게임","정답","지우기","종료"};
		int nu=0;
		JTextArea jt_tarea = new JTextArea();
		JScrollPane jsp_display = new JScrollPane(jt_tarea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		JTextField jtf_input = new JTextField();
		BaseBallGameEvent gameE = new BaseBallGameEvent(); 
		int user [] = new int[3];

//		for(int nu = 0; nu<jbtns.length; nu++)
//		{
//			jbtns[nu] = new JButton(btnn[nu]);
//			jbtns[nu].addActionListener(this);
//			//addActionListener(this);
//
//		}
		jf_ball.add("East",jp_east);
		jf_ball.add("Center",jp_center);
		jf_ball.setResizable(false);
		jf_ball.setTitle("야구 숫자 게임 ver1.0");
		jf_ball.setSize(400, 400);
		jf_ball.setVisible(true);
		jt_tarea.setBackground(Color.ORANGE);


		///////메인화면////////////
//		jtf_input.addActionListener(this);
		//버튼 맵핑

		jp_center.setLayout(new BorderLayout());
		jp_center.setBackground(Color.YELLOW);
		jp_east.setLayout(new GridLayout(4,1,2,2));
		Random rc = new Random();
		
		
		jbtns[0].setBackground(new Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255)));
		jbtns[1].setBackground(new Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255)));
		jbtns[2].setBackground(new Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255)));
		jbtns[3].setBackground(new Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255)));
	
		for(int unu = 0;nu<jbtns.length;nu++)
		{
			jp_east.add(jbtns[unu]);
		}
		jp_center.add(BorderLayout.SOUTH,jtf_input);
		jp_center.add("Center",jsp_display);
		//사용자로부터 값을 입력 받음.
		jf_ball.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jt_tarea.append("야구 숫자 게임 !\n");
		jt_tarea.append("중복값이 존재 할경우 현재 배팅x3\n");
		jt_tarea.append("게임 시작을 위해 새게임을 눌러주세요.\n");

	}

}
