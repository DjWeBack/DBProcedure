package com.semi;
import java.util.*;
public class logictest {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scn = new Scanner(System.in);
		int nansu[] = {0,0,0};
		int user[] = {0,0,0};
		int i=0;
		int sc=0;
		int ball=0;
		System.out.print("첫번째수 입력 : ");
		user[i] = scn.nextInt();//i=0
		i++;
		System.out.print("두번째수 입력 : ");
		user[i] = scn.nextInt();//i=1
		i++;
		System.out.print("세번째수 입력 : ");
		user[i] = scn.nextInt();//i=2

		for(i=0;i<3;i++) { //랜덤수 3개를 채번
			nansu[i]=ran.nextInt(3);
			System.out.print(nansu[i]);
		}
		for(i=0;i<3;i++) {
			if(nansu[i]==user[i])
			{
				sc=0;
				sc++;
				if(nansu[1]==user[1])
				{
					sc++;
					if(nansu[2]==user[2]) {
						sc++;
					}
				}
			}
			else
			{
				ball=0;
				ball++;
				if(nansu[1]!=user[1]){
					ball++;
					if(nansu[2]!=user[2]) {
						ball++;
					}
				}
			}


		}

		System.out.println("\n"+sc+"스트라이크"+" "+ball+"볼");
		if(ball>=3) {
			System.out.println("GameOver");
		}
	}

}
