package com.ch5;

import java.util.Random;

public class MyarrayTest2 {

	public static void main(String[] args) {
		Random rn = new Random();
		int ra[] = new int[100];
		int i=0;
		int j = 0;
		for(i=0;i<10;i++) {
			ra[i] = rn.nextInt(10);
			System.out.println(ra[i]+" ");
			for(j=0;j<90;j++) {
				ra[j] = rn.nextInt(10);
				System.out.print(ra[j] +" ");
				if(ra.length==9)
				{
					System.out.println(" ");
				}
				
				
			}
		}

	}

}
