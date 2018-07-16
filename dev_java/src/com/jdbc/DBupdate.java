package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.DBConnectionMgr;

public class DBupdate {
	DBConnectionMgr		 dbmgr		 = null;
	Connection			 con		 = null;//DB연결 인터페이스
	PreparedStatement	 pstmt		 = null;//커서조작 인터페이스
	ResultSet			 rs			 = null;//쿼리문 실행 인터페이스
	StringBuilder		 sql		 = new StringBuilder();
	public void update() {
		sql.append("select empno, ename, sal from emp");
		dbmgr = DBConnectionMgr.getInstance();
		int result = 0;
		try {
			con = dbmgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("사원번호 :"+rs.getInt("empno")+", 사원명 : "+rs.getString("ename")+", 급여 : "+rs.getInt("sal"));
			}
			sql = new StringBuilder();
			sql.append("update emp set sal = sal+500");
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			System.out.println("처리 되었습니다.");
			sql = new StringBuilder();
			System.out.println("업데이트 된 데이터 조회");
			sql.append("select empno, ename, sal from emp");
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();			
			while(rs.next()) {
				System.out.println("사원번호 :"+rs.getInt("empno")+", 사원명 : "+rs.getString("ename")+", 급여 : "+rs.getInt("sal"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBupdate dbu = new DBupdate();
		dbu.update();
	}

}
