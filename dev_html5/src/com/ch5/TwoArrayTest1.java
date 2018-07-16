package com.ch5;

public class TwoArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int is[][]= new int[3][2];
		for(int i=0;i<is.length;i++) //is.length는 얼마니?
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("["+i+"]["+j+"]="+is[i][j]);
			}
		}
		int is2[][]= {
				{10,11,12}
				,{13,14,15}
				,{16,17,18}
		};
		int is3[][] = new int[2][];
		is3[0] = new int[3];
		is3[0][0] = 1;
		is3[0][1] = 2;
		is3[0][2] = 3;
		 
		is3[1] = new int[4];
		is3[1][0] = 10;
		is3[1][1] = 20;
		is3[1][2] = 30;
		is3[1][3] = 40;
		
	}

}
