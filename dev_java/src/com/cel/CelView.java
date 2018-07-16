package com.cel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CelView  extends JFrame{
	CelEvent cle = new CelEvent(this);
	JFrame jf_cel = new JFrame();
	JTextField jtf_display = new JTextField(40);
	JPanel jp_center = new JPanel();
	JPanel jp_north = new JPanel();
	JScrollPane jsp = new JScrollPane();
	JButton jbtn_1 = new JButton("1");
	JButton jbtn_2 = new JButton("2");
	JButton jbtn_3 = new JButton("3");
	JButton jbtn_4 = new JButton("4");
	JButton jbtn_5 = new JButton("5");
	JButton jbtn_6 = new JButton("6");
	JButton jbtn_7 = new JButton("7");
	JButton jbtn_8 = new JButton("8");
	JButton jbtn_9 = new JButton("9");
	JButton jbtn_0 = new JButton("0");
	JButton jbtn_plus = new JButton("+");
	JButton jbtn_min = new JButton("-");
	JButton jbtn_ac = new JButton("ac");
	JButton jbtn_x = new JButton("x");
	JButton jbtn_bs = new JButton("back");
	JButton jbtn_equ = new JButton("=");
	JButton jbtn_avr = new JButton("/");
	public void initDisplay() {
		jtf_display.setHorizontalAlignment(SwingConstants.RIGHT);
		jf_cel.setSize(500, 500);
		jf_cel.setVisible(true);
		jf_cel.add("North",jp_north);
		jp_north.setBackground(Color.BLACK);
		jp_north.add("Center",jtf_display);
		jf_cel.add("Center", jp_center);
		jp_center.setLayout(new BorderLayout());
		jp_center.setBackground(Color.RED);
		jp_center.setLayout(new GridLayout(5,4));
		jp_center.add(jbtn_7);
		jp_center.add(jbtn_8);
		jp_center.add(jbtn_9);
		jp_center.add(jbtn_plus);
		jp_center.add(jbtn_4);
		jp_center.add(jbtn_5);
		jp_center.add(jbtn_6);
		jp_center.add(jbtn_min);
		jp_center.add(jbtn_1);
		jp_center.add(jbtn_2);
		jp_center.add(jbtn_3);
		jp_center.add(jbtn_x);
		jp_center.add(jbtn_0);
		jp_center.add(jbtn_equ);
		jp_center.add(jbtn_ac);
		jp_center.add(jbtn_avr);
		jp_center.add(jbtn_bs);
		jbtn_1.addActionListener(cle);
		jbtn_2.addActionListener(cle);
		jbtn_3.addActionListener(cle);
		jbtn_4.addActionListener(cle);
		jbtn_5.addActionListener(cle);
		jbtn_6.addActionListener(cle);
		jbtn_7.addActionListener(cle);
		jbtn_8.addActionListener(cle);
		jbtn_9.addActionListener(cle);
		jbtn_0.addActionListener(cle);
		jbtn_plus.addActionListener(cle);
		jbtn_min.addActionListener(cle);
		jbtn_x.addActionListener(cle);
		jbtn_equ.addActionListener(cle);
		jbtn_ac.addActionListener(cle);
		jbtn_avr.addActionListener(cle);
		jbtn_bs.addActionListener(cle);
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CelView clv = new CelView();
		clv.initDisplay();
		

	}

}
