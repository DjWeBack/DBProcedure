package com.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListEmpVO {
	List<EmpVO> empList = new ArrayList<EmpVO>();
	List<Map<String, Object>> empList2 = new ArrayList<Map<String, Object>>();
	public void setList() {
		//VO패턴에는 한번에 한개 로우값만 담을 수 있다.
		//두번을 담게 되면 마지막에 담긴 값만 저장됨.
		EmpVO evo = new EmpVO();
		evo.setENAME("이순신");
		evo.setENAME("이성계");
		empList.add(evo);
		
	}
	public void setlist2() {
		if(empList.get(0) instanceof EmpVO) {}
		if(empList.get(0) instanceof Map) {}
	}
	public int empInsert(int empno, String ename, String job, String hiredate, double sal, double comm,int mgr, int deptno) {
		int result = 0;
		return result;
	}
	public int empInsert(EmpVO pevo) {
		
		int result = 0;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListEmpVO lev = new ListEmpVO();
		System.out.println(lev.empList.size());
		lev.setList();
		//사원번호의 초기값을 출력해 보기
		System.out.println(lev.empList.get(0).getEMPNO());
		System.out.println(lev.empList.get(0).getENAME());
		System.out.println(lev.empList.get(1).getENAME());
	}

}
