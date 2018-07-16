package com.ch15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.xml.ws.soap.MTOMFeature;

public class memo extends JFrame implements ActionListener{
	//선언부
	JFileChooser jfc = new JFileChooser();
	JMenuBar jmb = new JMenuBar();
	JMenu    jm_file = new JMenu("File");
	JMenu    jm_edit = new JMenu("Edit");
	JMenuItem jmi_new = new JMenuItem("New");
	JMenuItem jmi_open = new JMenuItem("Open");
	JMenuItem jmi_save = new JMenuItem("Save");
	JSeparator js_exit = new JSeparator();
	JMenuItem jmi_exit = new JMenuItem("Exit");
	JMenuItem jmi_copy = new JMenuItem("Copy");
	JMenuItem jmi_cut = new JMenuItem("Cut");
	JMenuItem jmi_paste = new JMenuItem("Paste");
	String filePath = "src//com//ch15//";
	final URL memoImg = getClass().getResource("memo.png");
	ImageIcon memoIC = new ImageIcon(memoImg);
	JTextArea jta_display = new JTextArea();
	JScrollPane jsp_display = new JScrollPane(jta_display);
	//생성자
	public memo() {
		initDisplay();
	}
	
	//화면 처리부
	public void initDisplay() {
		jmi_open.addActionListener(this);
		
		//JTextArea에 자동줄바꿈
		jta_display.setLineWrap(true);
		jm_file.setMnemonic('F');
		jm_edit.setMnemonic('E');
		jm_file.add(jmi_new);
		jm_file.add(jmi_open);
		jm_file.add(jmi_save);
		jm_file.add(js_exit);
		jm_file.add(jmi_exit);
		jm_edit.add(jmi_cut);
		jm_edit.add(jmi_copy);
		jm_edit.add(jmi_paste);	
		jmb.add(jm_file);
		jmb.add(jm_edit);
		this.setJMenuBar(jmb);
		this.setTitle("메모");
		this.setIconImage(memoIC.getImage());
		this.add("Center",jsp_display);
		this.setSize(500,300);
		this.setVisible(true);
	}
	//메인 메소드
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new memo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj == jmi_open) {
			int status = jfc.showOpenDialog(this);
			if(status == JFileChooser.APPROVE_OPTION) {
				try {
					String strLine = null;
					
					File myFile = jfc.getSelectedFile();
					//선택된 파일의 절대경로를 지정해서 BufferedReader객체[필터클래스-단독으로 사용불가.]생성
					BufferedReader myReader = new BufferedReader(new FileReader(myFile.getAbsolutePath()));
					FileReader fr = new FileReader(myFile.getAbsolutePath());
					jta_display.setText(myReader.readLine());
					while((strLine==myReader.readLine()!=null)) {
						jta_display.append(strLine);
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}

}
