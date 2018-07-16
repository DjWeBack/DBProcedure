package com.vo;

import java.util.List;

public class EmpDaoSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDao eDao = new EmpDao();
		List<EmpVO> empList = eDao.getEmpList(null);
		System.out.println(empList.size());

	}

}
