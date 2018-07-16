package com.oracle.jdbc;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import javax.swing.JOptionPane;
public class ProcedureExam1 {
	//선언부
	Scanner sc = new Scanner(System.in);
	JOptionPane jop = new JOptionPane();
	final String _URL = "jdbc:oracle:thin:@192.168.0.218:1521:orcl11";
	final String _USER = "scott";
	final String _PW = "tiger";
	Connection 	con 		= 	null;
	CallableStatement cstmt = null;
	//	Statement cstmt = null;
	ResultSet rs = null;
	DBConnection dbCon = new DBConnection();
	
	
	//생성자
	public ProcedureExam1() {
		int uinput=userInput();//empno <<
		String msg = salaryUpdate(uinput);// empno<<
		System.out.println("[[처리 결과]]"+msg+uinput);
		
		}
	//사용자 정의 메소드
	//사용자로부터 사원번호를 입력받는 메소드를 구현. - userinput
	public int userInput() {
		int empno = 0;
		String u_empno = jop.showInputDialog("사원정보를 입력해 주세요.");
		empno = Integer.parseInt(u_empno);
		return empno;
	}
	
	//입력받은 사원번호를 급여를 인상처리하는 메소드.
	public String salaryUpdate(int empno) {
		String msg = null;
		//empno=userInput();
		
		try {		
		con = dbCon.getConnetion();
		cstmt = con.prepareCall("{call proc_emp_sal_update(?,?)}");
		cstmt.setInt(1, empno);
		cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
		int result = cstmt.executeUpdate();
		msg = cstmt.getString(2);
		} catch (Exception e) {
			System.out.println(e.toString());
			// TODO: handle exception
			return msg;
			
		}
		
		
		
//		pempno = userInput();
//		System.out.println("xx사원의 사원번호는 : "+pempno+"입니다.");
		return msg;
	}
	//메인메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ProcedureExam1();
		
		

	}

}
