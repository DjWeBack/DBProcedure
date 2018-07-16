package com.ch7;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Popup extends JFrame implements ActionListener{
	JButton jbtn_id = new JButton("ID중복 체크");
	JButton jbtn_zipcode = new JButton("우편번호 검색");
	JPanel jp = new JPanel();
	// 부모창에 대한 화면처리 메소드를 디폴트 생성자에서 호출하고 있어요
	// 상속관계에 있는 클래스가 있는 경우 자식클래스 생성자 호출전에 먼저 부모 생성자가 먼저 호출 됨.
	// 왜냐하면.. 그래야 자식클래스의 메소드가 오버라이딩 관계인지 파악해야됨
	// 아래코드[이벤트 처리]에서 인스턴스화가 두번 일어남.
	// 이건 부모창에 대한 디폴트 생성자가 두번 호출이 되는 거임.
	// 메인메소드에서 한번 창이 열리고 이벤트가 일어나면 부모창이 두번 열리는 건 이것때문임.
	// 그럼 이 문제를 해결해 보세요.  - 생성자를 이용해서 해결해 볼것.
	public Popup() {
//		initDisplay();
	}
	public Popup(String str) {
		System.out.println("Popup(String str) 호출완료");
		initDisplay();
		}
	

		public void dialogView(String title, int width, int heigth) {
			System.out.println("dialogView호출완료");
		}
		public void initDisplay() {
			jbtn_id.addActionListener(this);
			jbtn_zipcode.addActionListener(this);
			this.setSize(500,400);
			this.setVisible(true);
			this.add("North",jbtn_id);
			this.add("South",jbtn_zipcode);
			
			
		}
	public static void main(String[] args) {
		new Popup("");

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 자바는 선언부와 생성부에 오는 클래스가 다를 수 있다.
		// 자바는 생성부에 사용한 클래스가 실제 메모리에 로딩이 됨.
		// 그렇다면 선언부에 오는 변수 타입과 생성부 타입중 같은 메소드이름이 호출 되었을때
		// 누가 호출되는거임??
		String label = e.getActionCommand();
		Popup pop = null;
//		if(label.equals("ID중복 체크")) {}
		if("ID중복 체크".equals(label)) {
			IDCheck			idc = new IDCheck();
//			pop			 		= new IDCheck();
			idc.dialogView("ID중복체크", 200, 100);
//			pop.dialogView("ID중복체크2",300, 200);
		}
		else if("우편번호 검색".equals(label)) {
			ZipCodeSearch 	zip = new ZipCodeSearch();
			pop					= new ZipCodeSearch();
		}
		
	}

}
