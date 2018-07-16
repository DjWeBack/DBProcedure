package com.semi;

import java.util.Random;

public class logictest2 {
	int nansu[] = new int[3];

	public void randoms() {
		Random ran = new Random();
		int i=0;
		for(i=0;i<10;i++) {
		nansu[0] = ran.nextInt(10);
		do {
			nansu[1] = ran.nextInt(10);
		} while(nansu[0]==nansu[1]);
		do {
			nansu[2]=ran.nextInt(10);
		} while(nansu[2]==nansu[1]||nansu[2]==nansu[0]);
		
		}
		System.out.println(nansu[0]+""+nansu[1]+""+nansu[2]);
	}
	}


