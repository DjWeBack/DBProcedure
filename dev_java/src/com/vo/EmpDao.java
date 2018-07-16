package com.vo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.oracle.jdbc.DBConnection;

public class EmpDao {
	DBConnection dbcon = null;
	Connection	 con   = null;
	ResultSet	 rs	   = null;
	PreparedStatement pstmt = null;
	List<EmpVO> evo;
	StringBuilder sql = new StringBuilder();
	
	//입력처리

	//수정처리

	//삭제처리

	//조회처리 -메소드를 선언 getEmpList(?):?
	//DAO(Data Access Object):DB연동을 전담하는 클래스로 설계함.
	//이유? 재사용성을 높이기 위한 클래스 설계임
	//업무와 업무사이에는 관계가 있고 그 관계에 종속적이지 않은 상태로 클래스 설계를 해야
	//관련 있는 업무 사이에서 메소드를 공유할 수 있음.
	// --> 결합도가 낮은 코드를 전개하는 것이 중요함.
	//--> 결합도가 낮아야 단위테스트가 가능하고 통합테스트가 가능함.
	//--> 프로젝트 진행과정
	//분석 설계 -> 개발(코딩) -> 테스트 -> 시스템 이행 -> 끝
	public List<EmpVO> getEmpList(EmpVO pevo)
	{
		List<EmpVO> empList = new ArrayList<EmpVO>();
		sql.append("select empno,ename, ");
		sql.append("job,mgr,hiredate,   ");
		sql.append("sal,comm,deptno     ");
		sql.append("from emp            ");
		try {
			
			dbcon = new DBConnection();
			con = dbcon.getConnetion();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			EmpVO evo= null;
			while(rs.next()) {
			evo = new EmpVO();
				evo.setEMPNO(rs.getInt(1));
				evo.setENAME(rs.getString(2));
				evo.setJOB(rs.getString(3));
				evo.setMGR(rs.getInt(4));
				evo.setHIREDATE(rs.getString(5));
				evo.setSAL(rs.getDouble(6));
				evo.setCOMM(rs.getDouble(7));
				evo.setDEPTNO(rs.getInt(8));
				empList.add(evo);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			
		}
		

		return empList;
	}

	public List<DeptVO> getDeptList(DeptVO pevo)
	{
		List<DeptVO> deptList = new ArrayList<DeptVO>();
		StringBuilder sql = new StringBuilder();
		sql.append("select deptno,dname,loc ");
		sql.append("from dept            ");
		try {
			
			dbcon = new DBConnection();
			con = dbcon.getConnetion();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			
			DeptVO dvo = null;
			while(rs.next()) {
				dvo = new DeptVO();
				dvo.setDeptno(rs.getInt(1));
				dvo.setDname(rs.getString(2));
				dvo.setLoc(rs.getString(3));
				deptList.add(dvo);				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			
		}
		

		return deptList;
	}
}
