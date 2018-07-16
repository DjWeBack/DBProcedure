package com.ch6;

import javax.swing.*;

public class Button {

	JButton jbtn[] = new JButton[3];
	JFrame jf_view = new JFrame();
	JButton jbtn_new = new JButton("새게임");
	JButton jbtn_clear = new JButton("지우기");
	JButton jbtn_exit = new JButton("종료");
//	JButton jbtn[] = new JButton[3];
	public void Butt () {
		jbtn[0] = jbtn_new;
		jbtn[1] = jbtn_clear;
		jbtn[2] = jbtn_exit;
		
	}
}
