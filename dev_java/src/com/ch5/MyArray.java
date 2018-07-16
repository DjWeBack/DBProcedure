package com.ch5;
import java.util.*;

public class MyArray {
	int tot = 0;
	int hsum[]=new int[5];
	int scna[] = new int[hsum.length];
	public int hap(String user[]) {
		Scanner scn =  new Scanner(System.in);

		for(int sc=0;sc<hsum.length;sc++) {
			System.out.println("값을 입력 하세요 : ");
			scna[sc]=scn.nextInt();
		}
		for(int j=0;j<hsum.length;j++) {
			tot += scna[j];
		}

		return tot;


	}
	public double MyAvg(int tot,int inwon) {

		double avg = 0.0;
		inwon=scna.length;
		avg = tot/inwon;
		return avg;

	}
	//가장 먼저 실행된다.
	public static void main(String[] args) {
		MyArray ma = new MyArray();//생성자
		int tot = 0;
		double avg = 0.0;
		tot = ma.hap(args);
		//avg = ma.MyAvg(tot, args); 
		//ma.MyAvg(tot, args.length);
		if(args.length<5) {
			System.out.println("0부터 100가지의 정수 5개를 입력하세요");
		}
		System.out.println(tot);
		System.out.println();
	}
}

