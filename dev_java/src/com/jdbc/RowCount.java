package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.DBConnectionMgr;

public class RowCount {
	//insert here
	DBConnectionMgr		 dbmger		 = null;
	Connection			 con		 = null;//DB연결 인터페이스
	PreparedStatement	 pstmt		 = null;//커서조작 인터페이스
	ResultSet			 rs			 = null;//쿼리문 실행 인터페이스
	StringBuilder		 sql		 = new StringBuilder();	
		
	// 쿼리문을 담을 객체 생성(StringBuffer of StringBuilder)
	// String대신 StringBuilder를 사용하는 이유에 대해 말해보세요.
	


	public int getRowCount() {
		int result = 0;
		sql.append("select empno from emp");
		dbmger = DBConnectionMgr.getInstance();
		try {
			con = dbmger.getConnection();
			pstmt = con.prepareStatement(sql.toString(),
										 ResultSet.TYPE_SCROLL_SENSITIVE,
										 ResultSet.CONCUR_UPDATABLE);
			/**
			 * TPYE_FORWARK_ONLY - 순차적으로만 커서를 이동
			 * TPYE_SCROLL_INSENSITIVE - 비순차적으로 커서를 이동(동시성 유지 안됨)
			 * TYPE_SCROLL_SENSITIVE - 순차적으로 커서 이동(동시성 유지)
			 * CONCUR_UPDATABLE
			 * CONCUR_READ_ONLY
			 */
			rs = pstmt.executeQuery();
			rs.last();
			result = rs.getRow();
			rs.beforeFirst();
			
			System.out.println("Total row : " +result);
					}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			dbmger.freeConnection(con, pstmt, rs);
		}
		return result;
	}
	public static void main(String[] args) {
		RowCount rc = new RowCount();
		rc.getRowCount();
	}
}
