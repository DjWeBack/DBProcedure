package com.ch6;

import java.text.DecimalFormat;

public class SungJuk_Account {

	
	public void sugJuckAccount(String[][] datas) {
		SungJuk_InitData sji = new SungJuk_InitData();
		SungJuk_Hap sjh = new SungJuk_Hap();
		SungJuk_Avg sja = new SungJuk_Avg();
		SungJuk_Ranking sjr = new SungJuk_Ranking();
		DecimalFormat df = new DecimalFormat("0.#");
		float avg2[] = new float[3];
		datas = sji.initData();
		int[] haps = sjh.Hap(datas);//호출할땐 변수이름만,메소드 선언할 땐 타입도 같이 /리턴값 호출
		for(int i=0;i<haps.length;i++) {
			System.out.println(haps[i]);
			}
		double[] Avg = sja.Avg(haps);
		for(int i=0;i<Avg.length;i++) {
			System.out.println(Avg[i]);
			 datas[i][6] = String.valueOf(Avg[i]);
			 avg2[i] = Float.parseFloat(datas[i][6]);
			 datas[i][6] = String.valueOf(df.format(avg2[i]));
			}
		int[] ranks = sjr.ranking(Avg,haps);
		for(int i=0;i<Avg.length;i++) {
			for(int j=0;j<haps.length;j++) {
			}
			ranks[i]++;
			datas[i][7] =String.valueOf(ranks[i]);
//			System.out.println(ranks[i]);
			
			}
		
		System.out.println("sugJuckAccount 호출 성공");
				for(int i=0;i<datas.length;i++) {
			//for(int j=0;j<datas[i].length;j++) {
				System.out.printf("%3s %8s %5s %5s %5s %5s %5s %5s  %n", datas[i][0],datas[i][1],datas[i][2],datas[i][3],datas[i][4],datas[i][5],datas[i][6],datas[i][7]);
			//}
		}
				
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SungJuk_Account sjapp =  new SungJuk_Account();
		String[][] datas = new String[3][8];
		sjapp.sugJuckAccount(datas);
		
	}

}
