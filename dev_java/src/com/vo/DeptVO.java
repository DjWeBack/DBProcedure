package com.vo;
/*
 * 사원정보를 관리하는 테이블이 있다. emp
 * emp집합에는 8개의 컬럼이 있다.
 * 8개를 따로 받으려면 변수 8개를 선언해야 된다.
 * 그런데 VO를 사용하면 주소번지 하나에 8개 값을 모두 넘길 수 또는 받을 수 있다.
 */
public class DeptVO {
	private int	   deptno	    = 0;
	private String dname	    = null;
	private String loc		    = null;
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	

	
}
