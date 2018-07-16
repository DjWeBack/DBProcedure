package com.oracle.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class EmpInsert {
	//토드에서 한건이 입력 되었을때 리턴값이 1이었다.
	public int empAdd(int empno,String ename, String job, String hiredate, double sal, double comm, int deptno, int mgr) {
		DBConnection dbcon = new DBConnection();
		Connection con = null;
		Statement stmt = null;
		int result = 0;
		String sql = "";
		sql += "Insert into emp(empno,ename,job,                       ";
		sql += "		mgr,hiredate,sal,                                 ";
		sql += "		comm,deptno) values("+empno+",'"+ename+"','"+job+"',"+mgr;
		sql += "				,'"+hiredate+"',"+sal+","+comm+","+deptno+")";                
		try {
			con = dbcon.getConnetion();
			stmt = con.createStatement();
			result =  stmt.executeUpdate(sql);
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

