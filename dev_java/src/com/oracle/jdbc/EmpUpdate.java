package com.oracle.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class EmpUpdate {
	DBConnection dbcon = new DBConnection();
	Connection con = null;
	Statement stmt = null;
	public int empUpd(int empno, String ename, String job, String hiredate)
	{
		int result  = 0;//처리 결과 반환값 1:성공, 0:실패
		String sql = "";                            
		sql += 		"update emp ";
		sql +=		"set ename = '"+ename+"',";
		sql +=	    "job = '"+job+"',";
		sql +=	    "hiredate='"+hiredate+"' ";
		sql +=	    "where empno="+empno+"";
		 
		 
		                 
		try {
			con = dbcon.getConnetion();
			stmt = con.createStatement();
			result =  stmt.executeUpdate(sql);
			System.out.println("[[query]]"+sql);
			if(result==1) {
				System.out.println("데이터 입력에 성공했습니다.");
			}
			else {
				System.out.println("데이터 입력에 실패했습니다.");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}
}
