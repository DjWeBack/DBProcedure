package com.vo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EmpManager extends JFrame implements ActionListener {
	EmpController empCtrl = new EmpController();
	JButton jbtn_ins = new JButton("�Է�");
	JButton jbtn_del = new JButton("����");
	JButton jbtn_upd = new JButton("����");
	JButton jbtn_sel = new JButton("��ȸ");
	JPanel jp_view = new JPanel();
	JPanel jp_btns = new JPanel();
	public void initDisplay() {
		this.setTitle("���̺���ȸ");
		this.setSize(800, 800);
		this.setVisible(true);
//		this.setLayout(new BorderLayout());
		this.add("Center",jp_view);
		this.add("East",jp_view);
		jp_view.setLayout(new GridLayout(4,1,1,1));
		jp_view.add(jbtn_ins);
		jp_view.add(jbtn_del);
		jp_view.add(jbtn_upd);
		jp_view.add(jbtn_sel);
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpManager em = new EmpManager();
		em.initDisplay();
	}

}
