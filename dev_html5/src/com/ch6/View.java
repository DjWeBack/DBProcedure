package com.ch6;
import java.awt.GridLayout;

import javax.swing.*;

public class View {
	JFrame jf_view = new JFrame();
	JPanel jp_east = new JPanel();
	JPanel jp_center = new JPanel();
	Button bt = new Button();
	public void Viewer () {
		jf_view.add("East",jp_east);
		jf_view.add("Center",jp_center);
		jp_east.setLayout(new GridLayout(0,1,2,2));
		jf_view.setSize(500, 500);
		jf_view.setVisible(true);
		jp_center.add(bt.jbtn_new);
		jp_east.add(bt.jbtn_clear);
		jp_east.add(bt.jbtn_exit);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View vi = new View();
		vi.Viewer();
	}

}
