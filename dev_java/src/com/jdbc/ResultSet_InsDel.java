package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.DBConnectionMgr;

public class ResultSet_InsDel {
	//선언부
	DBConnectionMgr		 dbmger		 = null;
	Connection			 con		 = null;//DB연결 인터페이스
	PreparedStatement	 pstmt1		 = null;//커서조작 인터페이스
	PreparedStatement	 pstmt2		 = null;//커서조작 인터페이스
	ResultSet			 rs			 = null;//쿼리문 실행 인터페이스
	StringBuilder		 sql		 = new StringBuilder();	

	public void methodA() {
		// 데이터 추가
		int result = 0;
		dbmger = DBConnectionMgr.getInstance();
		sql.append("select empno, ename from emp");
		try {
			con = dbmger.getConnection();
			pstmt1 = con.prepareStatement(sql.toString(),
										 ResultSet.TYPE_SCROLL_INSENSITIVE,
										 ResultSet.CONCUR_UPDATABLE);
			rs = pstmt1.executeQuery();
			/*rs.moveToInsertRow();
			rs.updateInt(1, 9950);
			rs.updateString(2, "김훈태");
			rs.insertRow();
			rs.moveToCurrentRow();
			rs.updateInt(1, 9952);
			rs.updateString(2, "김위백");
			rs.insertRow();
			rs.close();*/
			System.out.println("데이터 추가 후 테이블 리스트");
			while(rs.next()) {
				System.out.println("사원번호 : " + rs.getInt("empno")+", 사원명 : " + rs.getString("ename"));
			}
			if(!rs.isBeforeFirst()) {//커서가 맨 마지막에 위치하는지 체크
				rs.beforeFirst();//커서를 맨 앞으로 이동.
				}
			while(rs.next()) {
				if(rs.getInt("empno")==9950) {
					rs.deleteRow();
				}
				if(rs.getInt("empno")==9952) {
					rs.deleteRow();
				}
			}
			}
		
		catch (SQLException se) {
			System.out.println(se.toString());
		}
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			dbmger.freeConnection(con, pstmt1, rs);
			try {
				if(pstmt2!=null) pstmt2.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		// 데이터 조회
		
		// 데이터 삭제
		
	}

	//생성자
	
	//메인메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResultSet_InsDel ri = new ResultSet_InsDel();
		ri.methodA();
	}

}
