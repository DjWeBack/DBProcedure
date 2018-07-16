package com.semi.baseballgame3;

import java.util.Random;

import javax.swing.JOptionPane;

import com.semi2.BaseBallGameview;

public class BaseBallGameLogic {
	BaseBallGameView bbgv;
	//컴터가 채번한 값을 담을 배열
	int com[]  = new int[3];
	//사용자가 입력한 값을 담을 배열
	int user[] = new int[3];

	//힌트-판정-세자리 숫자를 맞추어가는 과정
	public String result(String userInput) {
		int sc = 0;
		int ball = 0;

		int temp=0;
		try {
			temp=Integer.parseInt(userInput);
		} catch (NumberFormatException ne) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(bbgv.jf_ball, "숫자만 입력하세요", "에러", 0);
		}
		catch (NullPointerException ne) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(bbgv.jf_ball, "숫자만 입력하세요", "에러", 0);
		}
		
		
		user[0] = temp/100;
		user[1] = (temp%100)/10;
		user[2] = temp%10;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(user[i]==com[j]) {
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
	//랜덤 수 채번 메소드-정답
	public void ranCom() {
		int nansu[] = new int[3];
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
