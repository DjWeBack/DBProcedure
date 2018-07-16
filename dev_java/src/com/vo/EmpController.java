package com.vo;

import java.util.ArrayList;
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
/**
 * 사원목록 조회 구현
 * @param evo - 사용자가 선택한 정보(조건 검색 할때)
 * @return List<EmpVO>
 * @작성일자 : 2018-07-05
 * @작성자   : 김훈태 
 */
	public List<EmpVO> getEmpList(EmpVO evo) {
		List<EmpVO> empList = new ArrayList<EmpVO>();
		return empList;
	}
}
