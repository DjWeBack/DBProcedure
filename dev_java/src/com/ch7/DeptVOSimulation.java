package com.ch7;

public class DeptVOSimulation {
	public void methodA(DeptVO dvo) {//dvo - 지역 변수(파라미터로 넘어오므로 선택권 없음.)
		System.out.println("부서번호 : "+dvo.getDeptno()+", 부서명 : "+dvo.getDname());
//		dvo = null;
//		dvo = new DeptVO();
		dvo.deptno = 20;//원본이 바뀐다.
		//insert here - 원본이 바뀌지 않도록 코드를 수정해 보세요.
		dvo.setDname("총무부");
		dvo = null;
		dvo = new DeptVO();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeptVOSimulation dsim = new DeptVOSimulation();
		DeptVO dvo = new DeptVO();
		dvo.deptno = 10;//public
//		dvo.dname = "영업부"; //private으로 선언했으므로 직접 접근 불가.
		dvo.setDname("영업부");
		dsim.methodA(dvo);
		System.out.println("main - 부서번호 : "+dvo.getDeptno()+", 부서명 : "+dvo.getDname());
	}

}
