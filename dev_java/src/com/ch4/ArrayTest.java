package com.ch4;

public class ArrayTest {
/*	번호	이름	JAVA	ORACLE	총점	평균	석차
	1	임덕수	85	80	165	82.5	2
	2	박의	70	75	145	72.5	3
	3	유재덕	90	95	185	92.5	1*/

	public static void main(String[] args) {
		String names[] = {"임덕수","박의","유재덕"};
		int jumsus[][] = {
							{85,80}
						   ,{70,75}
						   ,{90,95}
					     };
		for(int i=0;i<3;i++) {
			System.out.println("names["+i+"]="+names[i]);
		}
		for(int x=0;x<jumsus.length;x++) {//row의 수(3)만큼 반복하고
			for(int y=0;y<jumsus[x].length;y++) {//column의 수(2)만큼 반복함.
				System.out.println("jumsus["+x+"]["+y+"]="+jumsus[x][y]);
			}
		}
		int ranks[] = {1,1,1};
	}

}




