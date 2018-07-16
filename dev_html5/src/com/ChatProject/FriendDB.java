package com.ChatProject;

import java.sql.Connection;
import java.sql.DriverManager;

public class FriendDB {

	
	final String _URL = "jdbc:oracle:thin:@192.168.0.218:1521:orcl11";
	final String _USER = "scott";
	final String _PW = "tiger";
	Connection 	con 		= 	null;
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
	public static void main(String[] args) {
		FriendDB fdbcon = new FriendDB();
		Connection con = fdbcon.getConnetion();
		System.out.println("con : "+con);
			}
	

}
