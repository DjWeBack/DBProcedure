package com.vo;

import java.util.List;

public class EmpController {
	final static String _INS = "insert";//int 타입
	final static String _UPD = "update";//int 타입
	final static String _DEL = "delete";//int 타입
	final static String _SEL = "select";//ResultSet
	EmpVO pevo = new EmpVO();
	EmpDao eDao = new EmpDao();//JDBC구현 클래스
	public int CUDEmp() {
	int result = 0;
	if(_INS.equals(pevo.getCommand())) {}
	else if(_UPD.equals(pevo.getCommand())) {}
	else if(_DEL.equals(pevo.getCommand())) {}
	else if(_SEL.equals(pevo.getCommand())) {
		
	}
	return result;
	}
	
	public List<EmpVO> getEmpList(EmpVO evo) {
	
		return null;
	}
}
