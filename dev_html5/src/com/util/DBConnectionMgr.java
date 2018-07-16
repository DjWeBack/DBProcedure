package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnectionMgr {



	/*
	 * ��Ŭ������ ���������� �ʿ��� �ڵ带 ���ϴ� Ŭ���� ��.
	 * �ܵ����� ����Ǵ� Ŭ������ �ƴ�.
	 * main�޼ҵ�� ����.
	 */


	final String 			_URL 		= "jdbc:oracle:thin:@192.168.0.231:1521:orcl11";
	final String 			_USER 		= "scott";
	final String			_PW 		= "tiger";
	final String			_DRIVER		= "oracle.jdbc.driver.OracleDriver";
	Connection			 	con 		= 	null;
	PreparedStatement		pstmt 		=	null;
	ResultSet				rs			=	null;


	}
	public Connection getConnection() {
		try {
			con = DriverManager.getConnection(_URL, _USER, _PW);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		return con;
	}

	public Connection getConnetion() {
		try {
			Class.forName(_DRIVER);//Ŭ������ �޸𸮿� �ε� Ŭ���� �̸��� ��ã���� �����?
			con = DriverManager.getConnection(_URL, _USER, _PW);
		} catch (ClassCastException ce) {
			System.out.println("����̹� Ŭ������ ã�� �� �����ϴ�.");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			System.out.println("����Ŭ ������ �������� ���߽��ϴ�.");
		} 

		return con;
	}
	//����� �ڿ� �ݳ��ϱ�
	/*************************************************
	 * �ݵ�� ������ �������� �ݳ��� ��.
	 * 1. insert, update, delete �϶� 2����
	 * 2. select �϶� 3�� ��.
	 * !! ���԰� ���� ������ �����ϸ� �� ��
	 *************************************************/
	public void freeConnection(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			//pstmt�� null�� �ƴҶ�
			//����� �ڿ��� �ݾ��ֱ�.
			if(rs !=null)rs.close();
			if(pstmt !=null) pstmt.close();
			if(con !=null) con.close();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	}
}
