package com.ch6;

public class SungJuk_Hap {

	public int[] Hap(String[][] datas) {
		SungJuk_Avg sav = new SungJuk_Avg();
//		SungJuk_InitData sjin = new SungJuk_InitData();
		System.out.println("Hap 호출 성공");
		int[] haps = new int[3];
			for(int i=0;i<datas.length;i++) {//datas[i].length - 컬럼수
				haps[i] = Integer.parseInt(datas[i][2]) + Integer.parseInt(datas[i][3]) +Integer.parseInt(datas[i][4]);
				datas[i][5] = String.valueOf(haps[i]);
							}
			
			return haps;
	}
}
