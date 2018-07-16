package com.ch6;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class SungJukView {
	//선언부
	//JF_sungjuk - 인스턴스변수
	//역활 - 메소드 및 변수를 사용할때
	JFrame jf_sungjuk = new JFrame();
	String header[] = {"번호","이름","JAVA","ORACLE","HTML","총점","평균","석차"};
	String datas[][] = new String[5][8];
	DefaultTableModel dtm_sunjuk = new DefaultTableModel(datas, header);
	JTable jtb_sungjuk = new JTable(dtm_sunjuk);
	//메소드 선언하기
	//화면처리부
	public void initDisplay() {
		jf_sungjuk.add("Center", jtb_sungjuk);
		jf_sungjuk.setVisible(true);
		jf_sungjuk.setSize(600, 400);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SungJukView sjView = new SungJukView();
		sjView.initDisplay();
	}

}
