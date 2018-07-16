package com.semiproject;
import javax.swing.*;
import java.awt.*;
public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf_back = new JFrame();
		JButton jbtn[] = new JButton[5];
		String jtnn[] = {"메인","추가","삭제","상세","검색"};
		JPanel jp_topb = new JPanel();
		JPanel jp_center = new JPanel();
		jf_back.setSize(400, 600);
		jf_back.setTitle("생애 첫 나만의 주소록 Ver 1.0");
		jf_back.setVisible(true);
		jf_back.setLayout(new BorderLayout());
		jf_back.setBackground(Color.BLACK);
		for(int i=0;i<jbtn.length;i++) {
			jbtn[i] = new JButton(jtnn[i]);
		}

		jp_topb.setBackground(Color.PINK);
		jp_topb.setLayout(new GridLayout(1,5,1,1));
		jp_center.setLayout(new BorderLayout());
		jp_center.setBackground(Color.BLUE);
		for(int i=0;i<jbtn.length;i++) {
			jp_topb.add(jbtn[i]);
		}
		

		
	}

}
