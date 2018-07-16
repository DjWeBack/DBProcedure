package com.oracle.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EmpManager {
	Scanner sc = new Scanner(System.in);
	EmpVO evo;
	EmpManager(){
		empInsert(evo);
		
	}
	public int empInsert(EmpVO evo) {
		this.evo = evo;
		int result = 0;
		int empno = 0;
		String ename = null;
		String job = null;
		String hiredate = null;
		double sal = 0;
		double comm = 0;
		int deptno = 0;
		int mgr = 0;
		System.out.println("사원번호를 입력하세요.");
		try {
			empno = sc.nextInt();
		}
		catch (NullPointerException ne) {
			// TODO: handle exception
			System.out.println("조회하실 회원번호를 입력해 주세요.");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자만 입력해 주세요.");
		}
				result = empAdd(evo);
//		result = empin.empAdd(empno, ename, job, hiredate, sal, comm, deptno, mgr)
				return result;
	}
	
	public static void main(String[] args) {
		EmpManager em = new EmpManager();
		em.empInsert(em.evo);

		
		
	}
	public void jusuck() {
	// TODO Auto-generated method stub
			/*final String _URL = "jdbc:oracle:thin:@192.168.0.218:1521:orcl11";
			final String _USER = "scott";
			final String _PW = "tiger";
			Connection 	con 		= 	null;
			Statement	stmt	 	= 	null;
			ResultSet 	rs	 		=	null;
			String sql = "select ename, sal, to_CHAR(hiredate,'YYYY-MM-DD') from emp";
			try {
				// 1단계 : DB서버 제품의 드라이버 클래스를 메모리에 로딩한다. - decode지원되니?
				Class.forName("oracle.jdbc.driver.OracleDriver");//제조사, 기능

				// 2단계 : 물리적으로 떨어져 있는 DB서버에 접속하기.(커낵션 맺기)
				con = DriverManager.getConnection(_URL, _USER, _PW);

				// 3단계 : 오라클 서버에 내가 작성한 select문을 보내고 처리해 줄래? 부탁함. - 객체로딩 - 인스턴스화.
				stmt = con.createStatement();

				// 요청 : 자바가 오라클에게 SQL에 들어있는 select문
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.println(rs.getDouble(""));
					System.out.println(rs.getString("ename"));
					System.out.println(rs.getString("sal"));
					System.out.println(rs.getString("to_CHAR(hiredate,'YYYY-MM-DD')"));
				}
			} catch (Exception e) {
				//			System.out.println((rs.getString("ename"));
				// TODO: handle exception
			}
			System.out.println("여기~~~~~~~~~~~~~~~~~~~");*/
	//토드에서 한건이 입력 되었을때 리턴값이 1이었다.
	/*	public int empAdd(int empno,String ename, String job, String hiredate, double sal, double comm, int deptno, int mgr) {
			DBConnection dbcon = new DBConnection();
			Connection con = null;
			Statement stmt = null;
			int result = 0;
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO EMP(empno, ename, job		");
			sql.append("					,mgr,hiredate,sal		");
			sql.append("					,comm,deptno)			");
			sql.append("					VALUES("+evo.getEmpno()+",'"+evo.getEname()+"','"+evo.getJob()+	"',"+evo.getMgr());
			sql.append(",'"+evo.getHiredate()+"',"+evo.getSal()+","+evo.getComm()+","+evo.getDeptno()+")");              
			try {
				con = dbcon.getConnetion();
				stmt = con.createStatement();
				result =  stmt.executeUpdate(sql.toString());
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

		}*/
	}

	public int empAdd(EmpVO evo) {
		DBConnection dbcon = new DBConnection();
		Connection con = null;
		Statement stmt = null;

		int result = 0;
		StringBuilder sql = new StringBuilder();                     
		sql.append("INSERT INTO EMP(empno, ename, job		");
		sql.append("					,mgr,hiredate,sal		");
		sql.append("					,comm,deptno)			");
		sql.append("					VALUES("+evo.getEmpno()+",'"+evo.getEname()+"','"+evo.getJob()+	"',"+evo.getMgr());
		sql.append(",'"+evo.getHiredate()+"',"+evo.getSal()+","+evo.getComm()+","+evo.getDeptno()+")");

		try {
			con = dbcon.getConnetion();
			stmt = con.createStatement();
			result =  stmt.executeUpdate(sql.toString());
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
