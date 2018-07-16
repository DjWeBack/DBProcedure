package com.vo;
/*
 * 사원정보를 관리하는 테이블이 있다. emp
 * emp집합에는 8개의 컬럼이 있다.
 * 8개를 따로 받으려면 변수 8개를 선언해야 된다.
 * 그런데 VO를 사용하면 주소번지 하나에 8개 값을 모두 넘길 수 또는 받을 수 있다.
 */
public class EmpVO {
	private int	   empno	    = 0;
	private String ename	    = null;
	private String job		    = null;
	private int    mgr		    = 0;
	private String hiredate     = null;
	private double sal		    = 0;
	private double comm	        = 0;
	private int    deptno	    = 0;
	private String Command		= null;
	
	public int getEMPNO() {
		return empno;
	}
	public void setEMPNO(int empno) {
		this.empno = empno;
	}
	public String getENAME() {
		return ename;
	}
	public void setENAME(String ename) {
		this.ename = ename;
	}
	public String getJOB() {
		return job;
	}
	public void setJOB(String job) {
		this.job = job;
	}
	public int getMGR() {
		return mgr;
	}
	public void setMGR(int mgr) {
		this.mgr = mgr;
	}
	public String getHIREDATE() {
		return hiredate;
	}
	public void setHIREDATE(String hiredate) {
		this.hiredate = hiredate;
	}
	public double getSAL() {
		return sal;
	}
	public void setSAL(double sal) {
		this.sal = sal;
	}
	public double getCOMM() {
		return comm;
	}
	public void setCOMM(double comm) {
		this.comm = comm;
	}
	public int getDEPTNO() {
		return deptno;
	}
	public void setDEPTNO(int deptno) {
		this.deptno = deptno;
	}
	public String getCommand() {
		return Command;
	}
	public void setCommand(String command) {
		this.Command = command;
	}
	
	
}
