package com.ch7;
//클래스에 대한 라이프 사이클에 대해 생각해 보기
//생성 - 활용 - 소멸
public class DeptVO {
	public int deptno = 0;
	private String dname = null;
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname (String dname) {
		this.dname = dname;
	}
}
