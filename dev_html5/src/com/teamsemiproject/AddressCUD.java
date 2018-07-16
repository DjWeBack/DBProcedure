package com.teamsemiproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddressCUD  implements ActionListener{
	JDialog				jdi_cud		 	= new JDialog();
	boolean				isView		 	= false;
	String 				title		 	= "";
	AddressBookUI 		abook			= null;
	JLabel				jlb_name	 	= new JLabel("이름 : ");
	JLabel				jlb_hp		 	= new JLabel("HP : ");
	JTextField			jtf_name	 	= new JTextField(20);
	JTextField			jtf_hp		 	= new JTextField(20);
	JLabel				jlb_tel		 	= new JLabel("전화 : ");
	JTextField			jtf_tel		 	= new JTextField(20);
	JLabel				jlb_be		 	= new JLabel("생일 : ");
	JTextField			jtf_be		 	= new JTextField(20);
	JLabel				jlb_post	 	= new JLabel("Post : ");
	JTextField			jtf_post	 	= new JTextField(20);
	JLabel				jlb_gender	 	= new JLabel("성별 : ");
	String				genderList[] 	= {"남자","여자"};
	JLabel				jlb_bigo 		= new JLabel("비고 : ");
	JTextArea			jta_bigo		= new JTextArea(3,20);
	JScrollPane			jsp_bigo		= new JScrollPane(jta_bigo);
	JPanel				jp_center		= new JPanel();
	JFrame				jf_back			= new JFrame();
	JComboBox			jcb_gender		= new JComboBox(genderList);
	JButton				jbtn_up			= new JButton();
	JButton				jbtn_can		= new JButton();
	JButton				jbtn_in			= new JButton("입력");
	JPanel				jp_down			= new JPanel();
	final String _URL = "jdbc:oracle:thin:@192.168.0.218:1521:orcl11";
	final String _USER = "scott";
	final String _PW = "tiger";
	Connection 	con 		= 	null;

	//자식창에 타이틀을 담기
	public AddressCUD() {

	}

	//파라미터를 갖는 생성자가 하나라도 있으면 디폴트 생성자는 제공안됨.
	public AddressCUD(boolean isView) {
		this.isView = isView;
	}
	public void set(String title, boolean isView, AddressBookUI abook) {
		this.title = title;
		this.isView = isView;
		this.abook = abook;
		initDisplayUpdate();
	}

	//이름 o, 성별 o, 휴대폰o, 전화o, 생일o, 카테고리, 우편번호
	public void initDisplayUpdate () {
		jf_back.add("Center",jp_center);
		jp_center.setLayout(null);
		//		jp_center.setLayout(new BorderLayout());
		jlb_name.setBounds(20, 20, 100, 20);
		jtf_name.setBounds(60, 20, 170, 20);
		jtf_name.setText("예시)홍길동");
		jlb_gender.setBounds(20, 50, 100, 20);
		jcb_gender.setBounds(60, 50, 170, 20);
		jp_center.add(jlb_name);
		jp_center.add(jtf_name);
		jp_center.add(jlb_hp);
		jp_center.add(jtf_hp);
		jlb_hp.setBounds(20, 80, 100, 20);
		jtf_hp.setBounds(60, 80, 170, 20);
		jp_center.add(jlb_tel);
		jp_center.add(jtf_tel);
		jlb_tel.setBounds(20, 110, 50, 20);
		jtf_tel.setBounds(60, 110, 170, 20);
		jp_center.add(jlb_be);
		jp_center.add(jtf_be);
		jlb_be.setBounds(20, 140, 50, 20);
		jtf_be.setBounds(60, 140, 170, 20);
		jp_center.add(jlb_post);
		jp_center.add(jtf_post);
		jlb_post.setBounds(20, 170, 50, 20);
		jtf_post.setBounds(60, 170, 170, 20);
		jp_center.add(jlb_gender);
		jp_center.add(jcb_gender);
		jlb_bigo.setBounds(20, 200, 100, 20);
		jsp_bigo.setBounds(60, 200, 170, 100);
		jp_center.add(jlb_bigo);
		jp_center.add(jsp_bigo);
		jdi_cud.add("Center",jp_center);
		jdi_cud.setTitle(title);
		jdi_cud.setSize(350,500);
		jdi_cud.setVisible(isView);
		jp_center.add(jbtn_up);
		jbtn_up.setBounds(10, 320, 60, 40);
		jp_center.add(jbtn_can);
		jbtn_can.setBounds(90, 320, 60, 40);
		jp_center.add(jbtn_in);
		jbtn_in.setBounds(170, 320, 60, 40);
		jbtn_up.addActionListener(this);
		jbtn_can.addActionListener(this);
		jbtn_in.addActionListener(this);
		jbtn_up.setLabel("수정");
		jbtn_can.setLabel("취소");
		jbtn_in.setLabel("입력");
		String del="";
		String u_name = "";
		String u_hp="";
		String u_be="";
		
		for(int i=0;i<abook.jtb.getRowCount();i++) {
			if(abook.jtb.isRowSelected(i)) {
				del = (String)abook.dtm.getValueAt(i, 0);
				u_name = (String)abook.dtm.getValueAt(i, 1);
				u_hp = (String)abook.dtm.getValueAt(i, 2);
				u_be = (String)abook.dtm.getValueAt(i, 3);

			}
		}
		setName(u_name);
		setHp(u_hp);
		setBe(u_be);

	}
	//각 컬럼의 값들을 설정하거나 읽어오는 getter/setter메소드 추가하기.
	public String getName() {
		return jtf_name.getText();
	}
	public void setName(String name) {
		jtf_name.setText(name);			
	}
	public String getHp() {
		return jtf_hp.getText();
	}
	public void setHp(String hp) {
		jtf_hp.setText(hp);			
	}
	public String getTel() {
		return jtf_tel.getText();
	}
	public void setTel(String tel) {
		jtf_tel.setText(tel);			
	}
	public String getBe() {
		return jtf_be.getText();
	}
	public void setBe(String be) {
		jtf_be.setText(be);			
	}
	public String getPost() {
		return jtf_post.getText();
	}
	public void setPost(String post) {
		jtf_post.setText(post);			
	}
	public String getBigo() {
		return jta_bigo.getText();
	}
	public void setBigo(String bigo) {
		jta_bigo.setText(bigo);			
	}
	public String getGender() {
		if("남자".equals(jcb_gender.getSelectedItem())) return "1";
		else return "0";
	}
	public void setGender(String Gender) {
		if("1".equals(Gender)) {
			jcb_gender.setSelectedItem("남자");				
		}
		else jcb_gender.setSelectedItem("여자");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jbtn_up) {
			Update(getName(),getHp(),getTel(),getBe(),getPost(),getBigo(),getGender());

		}
		else if(obj == jbtn_can) {
			System.exit(0);
		}
		else if (obj==jbtn_in) {
			Insert(getName(),getHp(),getTel(),getBe(),getPost(),getBigo(),getGender(),jbtn_in.getLabel());
		}
	}
	public String Delete(AddressBookUI abook) {

		String del = "";;
		System.out.println(abook);
		for(int i=0;i<abook.jtb.getRowCount();i++) {
			if(abook.jtb.isRowSelected(i)) {
				del = (String)abook.dtm.getValueAt(i, 0);

			}



		}
		
		String msg = "";
		try {		
			abook.con = abook.dbCon.getConnetion();
			abook.cstmt = abook.con.prepareCall("{call proc_addr_delete(?,?)}");
			abook.cstmt.setString(1, del);
			abook.cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
			int result = abook.cstmt.executeUpdate();
			msg = abook.cstmt.getString(2);

			abook.Select();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());



		}	abook.Select();


		return "";
	}

	public String Insert(String u_name, String u_hp, String u_tel, String u_be, String u_post, String u_bigo, String u_gen,String u_innup)
	{
		u_name = getName();
		u_hp = getHp();
		u_tel = getTel();
		u_be = getBe();
		u_post = getPost();
		u_bigo = getBigo();
		u_gen = getGender();
		if(getGender()=="1") {
			u_gen = "남자";				
		}
		else {u_gen = "여자";}
		u_innup = jbtn_in.getLabel();

		System.out.println("수정되었습니다.");
		String msg = null;

		//empno=userInput();

		try {		
			abook.con = abook.dbCon.getConnetion();
			abook.cstmt = abook.con.prepareCall("{call proc_addr_update(?,?,?,?,?,?,?,?,?)}");
			abook.cstmt.setString(1, u_name);
			abook.cstmt.setString(2, u_hp);
			abook.cstmt.setString(3, u_tel);
			abook.cstmt.setString(4, u_bigo);
			abook.cstmt.setString(5, u_be);
			abook.cstmt.setString(6, u_post);
			abook.cstmt.setString(7, u_innup);
			abook.cstmt.setString(8, u_gen);
			abook.cstmt.registerOutParameter(9, java.sql.Types.VARCHAR);
			int result = abook.cstmt.executeUpdate();
			msg = abook.cstmt.getString(9);

			abook.Select();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
			// TODO: handle exception

		}
		System.out.println("입력되었습니다.");
		return"";
	}	

	public String Update(String u_name, String u_hp, String u_tel, String u_be, String u_post, String u_bigo, String u_gen) {
		
		u_name = getName();
		u_hp = getHp();
		u_tel = getTel();
		u_be = getBe();
		u_post = getPost();
		u_bigo = getBigo();
		u_gen = getGender();
		if(getGender()=="1") {
			u_gen = "남자";				
		}
		else {u_gen = "여자";}
		String u_innup = "";
		u_innup = jbtn_up.getLabel();

		System.out.println("수정되었습니다.");
		String msg = null;

		//empno=userInput();

		try {		
			abook.con = abook.dbCon.getConnetion();
			abook.cstmt = abook.con.prepareCall("{call proc_addr_update(?,?,?,?,?,?,?,?,?)}");
			abook.cstmt.setString(1, u_name);
			abook.cstmt.setString(2, u_hp);
			abook.cstmt.setString(3, u_tel);
			abook.cstmt.setString(4, u_bigo);
			abook.cstmt.setString(5, u_be);
			abook.cstmt.setString(6, u_post);
			abook.cstmt.setString(7, u_innup);
			abook.cstmt.setString(8, u_gen);
			abook.cstmt.registerOutParameter(9, java.sql.Types.VARCHAR);
			int result = abook.cstmt.executeUpdate();
			msg = abook.cstmt.getString(9);

			abook.Select();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
			// TODO: handle exception
			return msg;

		}

		return msg;
	}
	public static void main(String args[]) {

		AddressCUD acud = new AddressCUD(true);
		acud.initDisplayUpdate();
		acud.set("수정", true, new AddressBookUI(1));
		System.out.println(acud.getGender());
		//			acud.setName("김훈태");
		//			System.out.println(acud.getName());
		//			acud.setBigo("test테스트");
		//			acud.setGender("1");
		//			acud.setHp("010-0000-0000");
		//			acud.setBe("1992-01-07");
		//			acud.setPost("427-060");
		//			acud.setTel("02-502-0000");

	}
}
