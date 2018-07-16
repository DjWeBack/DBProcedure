package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.DBConnectionMgr;

public class CommitMode {
	DBConnectionMgr		 dbmger		 = null;
	Connection			 con		 = null;//DB연결 인터페이스
	PreparedStatement	 pstmt		 = null;//커서조작 인터페이스
	ResultSet			 rs			 = null;//쿼리문 실행 인터페이스
	StringBuilder		 sql		 = new StringBuilder();
	public void methodA() {
		sql.append("insert into emp(empno, ename) VALUES(?,?)");
		dbmger = DBConnectionMgr.getInstance();
		int result = 0;
		try {
			con = dbmger.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 9958);
			pstmt.setString(2, "이순신");
			result = pstmt.executeUpdate();
			if(result==1) {
				System.out.println("입력성공");
			}
			if(result==0) {
				System.out.println("입력실패");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
