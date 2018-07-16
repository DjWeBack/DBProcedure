package com.semi2;

import java.util.Random;

public class BaseBallGameLogic {
	
		int nansu[] = new int[3];
		BaseBallGameview bbg = new BaseBallGameview();
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
		public String result(String userInput) {


			int sc = 0;
			int ball = 0;

			int temp=0;

			temp=Integer.parseInt(userInput);

			bbg.user[0] = temp/100;
			bbg.user[1] = (temp%100)/10;
			bbg.user[2] = temp%10;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(bbg.user[i]==nansu[j]) {
						if(i==j) {
							sc++;
						}
						else {
							ball++;
						}
					}
				}
			}

			return +sc+"스트라이크"+""+ball+"볼";

		}
}

