package com.ch5;

import java.util.Scanner;

public class arraygame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		String sc[]= new String[8];
		int i=0;
		int j=0;
		for(j=0;j<8;j++) {
			System.out.print((j+1)+"번째 글자를 입력해 주세요 : \n");
			sc[j]=scn.nextLine();
			
		}
		System.out.print(sc[0]+sc[1]+sc[2]+sc[3]+sc[4]+sc[5]+sc[6]+sc[7]+"\n");
		for(j=sc.length-1;j>=0;j--)
		{
			System.out.print(sc[j]);	
		}
		System.out.println("");
		char chs[] = sc[6].toCharArray();
		for(i=chs.length-1;i>=0;i--)
		{
			System.out.print(chs[i]);
		}
		System.out.println("");
		//for(int i=0;i<card.length;i++) {
		//card[i]=scn.nextLine();
		//}
		
		
	}

}
