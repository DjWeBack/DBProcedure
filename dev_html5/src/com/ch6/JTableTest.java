package com.ch6;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class JTableTest {
	String[][] datas = new String[10][1];
	String[] cols = {"대화명","성별","나이"};
	JFrame jf = new JFrame();
	DefaultTableModel dtm = new DefaultTableModel(datas,cols);
	JTable jt = new JTable(dtm);
	JScrollPane jsp = new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	
	public JTableTest() {
		jf.add("Center",jt);
		jf.setSize(500,500);
		jf.setVisible(true);
//		jf.add(jsp);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		JTableTest jtbt = new JTableTest();
		new JTableTest();

	}

}
