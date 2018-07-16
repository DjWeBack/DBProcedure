package com.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnectionMgr {



	/*
	 * 이클래스는 공통적으로 필요한 코드를 추가하는 클래스 임.
	 * 단독으로 실행되는 클래스가 아님.
	 * main메소드는 버림.
	 */


	final String 			_URL 		= "jdbc:oracle:thin:@192.168.0.231:1521:orcl11";
	final String 			_USER 		= "scott";
	final String			_PW 		= "tiger";
	final String			_DRIVER		= "oracle.jdbc.driver.OracleDriver";
	static DBConnectionMgr	dbmgr		=	null;
	Connection			 	con 		= 	null;
	PreparedStatement		pstmt 		=	null;
	ResultSet				rs			=	null;

	public static DBConnectionMgr getInstance() {
		if(dbmgr==null) {
			dbmgr = new DBConnectionMgr();
		}
		return dbmgr;
	}
	public Connection getConnection() {
		try {
			Class.forName(_DRIVER);//클래스를 메모리에 로딩 클래스 이름을 못찾으면 어떡하지?
			con = DriverManager.getConnection(_URL, _USER, _PW);
		} catch (ClassCastException ce) {
			System.out.println("드라이버 클래스를 찾을 수 없습니다.");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			System.out.println("오라클 서버에 연결하지 못했습니다.");
		} 

		return con;
	}


	//사용한 자원 반납하기
	/*************************************************
	 * 반드시 생성한 역순으로 반납할 것.
	 * 1. insert, update, delete 일때 2개만
	 * 2. select 일때 3개 다.
	 * !! 옷입고 벗는 순서를 생각하면 됨 ㅋ
	 *************************************************/
	public void freeConnection(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			//pstmt가 null이 아닐때
			//사용한 자원은 닫아주기.
			if(rs !=null)rs.close();
			if(pstmt !=null) pstmt.close();
			if(con !=null) con.close();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void freeConnection(Connection con, CallableStatement cstmt) {
		try {
			if(cstmt !=null) pstmt.close();
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
