package com.ch5;

import java.util.Scanner;

public class logicTest1 {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		int tot = 0;
		int hsum[]=new int[5];
		int scna[] = new int[hsum.length];
		for(int sc=0;sc<hsum.length;sc++) {
		System.out.println("값을 입력 하세요 : ");
		scna[sc]=scn.nextInt();
		}
		for(int j=0;j<hsum.length;j++) {
		tot += scna[j];
		}
		System.out.println(tot);

	}

}
