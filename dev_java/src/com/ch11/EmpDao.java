package com.ch11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.util.DBConnectionMgr;
import com.vo.EmpVO;
//DAO(Data Access Object):DB연동을 전담하는 클래스로 설계함.
//이유? 재사용성을 높이기 위한 클래스 설계임
//업무와 업무사이에는 관계가 있고 그 관계에 종속적이지 않은 상태로 클래스 설계를 해야
//관련 있는 업무 사잉에서 메소드를 공유할 수 있음.
//--> 결합도가 낮은 코드를 전개하는 것이 중요함.
//--> 결합도가 낮아야 단위테스트가 가능하고 통합테스트가 가능함.
//--> 프로젝트 진행과정
//분석 설계 -> 개발(코딩) -> 테스트 -> 시스템 이행 -> 끝
public class EmpDao {
	//선언부
	//객체주입 -> DI(dependency injection)
	DBConnectionMgr 	dbMgr = DBConnectionMgr.getInstance();
	Connection 			con   = null;
	PreparedStatement 	pstmt = null;
	ResultSet			rs	  = null;
	//입력처리
	
	//수정처리
	
	//삭제처리
	
	//조회처리 - 메소드 선언 - getEmpList(?):?
	public List<EmpVO> getEmpList(EmpVO pevo){
		List<EmpVO> empList = new ArrayList<EmpVO>();
		StringBuilder sql = new StringBuilder();//StringBuffer
		sql.append("SELECT empno, ename, job, mgr  ");
	    sql.append("     , hiredate,sal,comm,deptno");
	    sql.append("  FROM emp                     ");
		//DB연동은 오라클 서버에 접속하는 것이므로 예외처리 필수임.
		try {
			//자바에서 제공하는 인터페이스들 중 메소드 호출을 통해 객체주입되는 경우도 많음.
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			//커서가 맨 앞에 있다
			//System.out.println(rs.isFirst());
			//커서가 맨 뒤에 있다.
			//System.out.println(rs.isLast());
			EmpVO evo = null;
			while(rs.next()) {
			//while(rs.previous()) {	
		    //while(rs.absolute(4)) {
				evo = new EmpVO();
				evo.setEmpno(rs.getInt("empno"));
				evo.setEname(rs.getString("ename"));
				evo.setJob(rs.getString("job"));
				evo.setMgr(rs.getInt("mgr"));
				evo.setHiredate(rs.getString("hiredate"));
				evo.setSal(rs.getDouble("sal"));
				evo.setComm(rs.getDouble("comm"));
				evo.setDeptno(rs.getInt("deptno"));
				empList.add(evo);
			}
		} catch (SQLException se) {
			System.out.println("[[query]]"+sql.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}
}





