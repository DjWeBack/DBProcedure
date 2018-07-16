package com.ch6;

public class SungJuk_Avg {
	public double[] Avg(int[] haps) {
		
		System.out.println("Avg 호출 성공");
		double[] Avg = new double[3];
		
		for(int i=0;i<haps.length;i++) {
			Avg[i] = haps[i]/3.0;
					
		}
		return Avg;
	}

}
