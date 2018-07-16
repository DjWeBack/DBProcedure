package com.oracle.jdbc;

import java.sql.Connection;

public class DBConnerctionSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnection dbCon = new DBConnection();
		Connection con = dbCon.getConnetion();
		System.out.println("con : "+con);
//		EmpInsert empin = new EmpInsert();
//		EmpUpdate upd = new EmpUpdate();
//		EmpDelete edl = new EmpDelete();
//		edl.empDelete(9000);
		
	}

}
