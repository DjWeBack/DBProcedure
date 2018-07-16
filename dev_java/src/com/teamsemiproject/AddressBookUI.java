package com.teamsemiproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.net.URL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableModel;

import com.oracle.jdbc.DBConnection;

public class AddressBookUI {
	//데이터베이스 연동
	
	
	final String _URL = "jdbc:oracle:thin:@192.168.0.218:1521:orcl11";
	final String _USER = "scott";
	final String _PW = "tiger";
	Connection 	con 		= 	null;
	CallableStatement cstmt = null;
	PreparedStatement pstmt = null;
	//	Statement cstmt = null;
	ResultSet rs = null;
	DBConnection dbCon = new DBConnection();
	
			JFrame 				jf_addr		= new JFrame();
			JMenuBar 			jmb 		= new JMenuBar();
			JMenu 				jm_edit 	= new JMenu("Edit");
			JMenu 				jm_file 	= new JMenu("File");
			JMenuItem		 	jmi_ins 	= new JMenuItem("입력");
			JMenuItem 			jmi_upd 	= new JMenuItem("수정");
			JMenuItem 			jmi_del 	= new JMenuItem("삭제");
			JMenuItem 			jmi_det 	= new JMenuItem("상세조회");
			JMenuItem 			jmi_all 	= new JMenuItem("전체조회");
			JMenuItem 			jmi_exit 	= new JMenuItem("종료");
			JPanel 				jp_topb		= new JPanel();
			JPanel 				jp_center	= new JPanel();
	static 	AddressBookUI		abook 		= null;
	//툴바 추가
			JToolBar			jtbar 		= new JToolBar();
			JButton				jbtn_ins	= new JButton();
			JButton				jbtn_upd	= new JButton();
			JButton				jbtn_del	= new JButton();
			JButton				jbtn_det	= new JButton();
			JButton				jbtn_all	= new JButton();
			String 				imgPath 	= "D:\\image\\";
			AddressEvent 		ade			= new AddressEvent(this);
			ImageIcon titleIcon = new ImageIcon(imgPath+"jodan.png");
	//테이블 추가
//			String col[] = {"번호","이름","성별","휴대전화","연락처","카테고리","생년월일","우편번호"};
			String col[] = {"번호","이름","휴대전화","생년월일"};
			DefaultTableModel 	dtm			= new DefaultTableModel(col,0);
			JTable				jtb			= new JTable(dtm);
			JScrollPane			jsp			= new JScrollPane(jtb);
		
			public Connection getConnetion() {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");//클래스를 메모리에 로딩 클래스 이름을 못찾으면 어떡하지?
					con = DriverManager.getConnection(_URL, _USER, _PW);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.toString());
				}
				
				return con;
			}
			public AddressBookUI() {
		getConnetion();
		initDisplay();
		Select();
	}
			public AddressBookUI(int i) {
				
			}
			public void Select() {

				int test[] =jtb.getSelectedRows(); 
				try {
					String sql = "select * from ADDRESSBOOK";
					pstmt = con.prepareStatement(sql);
					System.out.println("pstmt : "+pstmt);
					rs = pstmt.executeQuery();
					System.out.println("rs : "+rs);
					while(rs.next()) {
						String num =rs.getString(1);
						String name =rs.getString(2);
//						String gen = rs.getString(3);
						String hp = rs.getString(4);
//						String tel = rs.getString(5);
//						String cat = rs.getString(6);
						String bi = rs.getString(7);
//						String post = rs.getString(8);
						//이름 성별 휴대전화 전화 카테고리 생년월일 우편번호
						Object data[]= {num,name,hp,bi};
						dtm.addRow(data);
					}

				}
					catch (Exception e) {
						System.out.println(e);
					}					
				while(dtm.getRowCount()>0) {//조회를 하게되면 자동으로 리프레쉬 하게됨.
						dtm.removeRow(0);
					}
				try {
					String sql = "select * from ADDRESSBOOK";
					pstmt = con.prepareStatement(sql);
					System.out.println("pstmt : "+pstmt);
					rs = pstmt.executeQuery();
					System.out.println("rs : "+rs);
					while(rs.next()) {
						String num =rs.getString(1);
						String name =rs.getString(2);
//						String gen = rs.getString(3);
						String hp = rs.getString(4);
//						String tel = rs.getString(5);
//						String cat = rs.getString(6);
						String bi = rs.getString(7);
//						String post = rs.getString(8);
						//이름 성별 휴대전화 전화 카테고리 생년월일 우편번호
						Object data[]= {num,name,hp,bi};
						dtm.addRow(data);
					}

				}
					catch (Exception e) {
						System.out.println(e);
					}
				}
			public void dataAll() {
				JFrame 				jf_addr		= new JFrame();
				JPanel 				jp_center	= new JPanel();
				String col[] = {"번호","이름","성별","휴대전화","연락처","카테고리","생년월일","우편번호"};
				DefaultTableModel 	dtm			= new DefaultTableModel(col,0);
				JTable				jtb			= new JTable(dtm);
				JScrollPane			jsp			= new JScrollPane(jtb);
				jf_addr.setSize(400, 600);
				jf_addr.setTitle("테이블 상세보기");
				jf_addr.setVisible(true);
				jf_addr.add("Center", jp_center);
				jp_center.add(jsp);
				
				try {
					String sql = "select * from ADDRESSBOOK";
					pstmt = con.prepareStatement(sql);
					System.out.println("pstmt : "+pstmt);
					rs = pstmt.executeQuery();
					System.out.println("rs : "+rs);
					while(rs.next()) {
						String num =rs.getString(1);
						String name =rs.getString(2);
						String gen = rs.getString(3);
						String hp = rs.getString(4);
						String tel = rs.getString(5);
						String cat = rs.getString(6);
						String bi = rs.getString(7);
						String post = rs.getString(8);
						//이름 성별 휴대전화 전화 카테고리 생년월일 우편번호
						Object data[]= {num,name,gen,hp,tel,cat,bi,post};
						dtm.addRow(data);
					}
				}
					catch (Exception e) {
						System.out.println(e);
					}
				
				}	
			
	public void initDisplay() {
		//버튼에 이미지 아이콘 추가하기
		jbtn_ins.setIcon(new ImageIcon(imgPath+"new.gif"));
		jbtn_upd.setIcon(new ImageIcon(imgPath+"update.gif"));
		jbtn_del.setIcon(new ImageIcon(imgPath+"delete.gif"));
		jbtn_det.setIcon(new ImageIcon(imgPath+"detail.gif"));
		jbtn_all.setIcon(new ImageIcon(imgPath+"detail.gif"));
		
		jmb.add(jm_file);
		jmb.add(jm_edit);
		jm_edit.add(jmi_ins);
		jm_edit.add(jmi_upd);
		jm_edit.add(jmi_del);
		jm_edit.add(jmi_det);
		jm_edit.add(jmi_all);
		jm_file.add(jmi_exit);
		jf_addr.setJMenuBar(jmb);
		//툴바에 버튼 추가하기
		jtbar.add(jbtn_ins);
		jtbar.add(jbtn_upd);
		jtbar.add(jbtn_del);
		jtbar.add(jbtn_det);
		jtbar.add(jbtn_all);
		jf_addr.setSize(500, 600);
		jf_addr.setTitle("생애 첫 나만의 주소록 Ver 1.0");
		jf_addr.setVisible(true);
		//툴바 북쪽에 배치하기
		jf_addr.add("North",jtbar);
		jbtn_ins.setToolTipText("입력");
		jbtn_upd.setToolTipText("수정");
		jbtn_del.setToolTipText("삭제");
		jbtn_det.setToolTipText("상세");
		jbtn_all.setToolTipText("전체보기");
		jp_center.add(jsp);
		jf_addr.add("Center", jp_center);
		
		jbtn_ins.addActionListener(ade);
		jbtn_upd.addActionListener(ade);
		jbtn_del.addActionListener(ade);
		jbtn_det.addActionListener(ade);
		jbtn_all.addActionListener(ade);
		jmi_exit.addActionListener(ade);
		jf_addr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//종료이벤트
		jf_addr.setIconImage(titleIcon.getImage());
		//현재 윈도우 화면의 크기
		Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension di2 = jf_addr.getSize();
		jf_addr.setLocation((int)di.getWidth()/2-(int)di2.getWidth()/2,(int)di.getHeight()/2-(int)di2.getHeight()/2);

	}


	public static void main(String[] args) {
//		JFrame.setDefaultLookAndFeelDecorated(true);
		abook = new AddressBookUI();
		
		
	}

}
