package com.ch4;
import java.util.*;
import javax.swing.*;
public class HakJum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		JFrame jf =new JFrame();
		String juc = "";
		juc = JOptionPane.showInputDialog("점수를 입력하세요 ");
		int jucs = 0;
		jucs = Integer.parseInt(juc);
		String i= "";
		if ((jucs>=90)&&(jucs<=100)) {
			System.out.println("당신의 점수 : " +jucs);
			System.out.println("A학점입니다.");
			JOptionPane.showMessageDialog(jf, "당신의 점수 : " +jucs+"\n A학점 입니다.", "학점", 1);
			i = "A";
			
			
		}
		else if (jucs>=80&&(jucs<=89))
		{
			System.out.println("당신의 점수 : " +jucs);
			System.out.println("B학점입니다.");
			JOptionPane.showMessageDialog(jf, "당신의 점수 : " +jucs+"\n B학점 입니다.", "학점", 1);
			System.exit(0);
			i = "B";
		}
		else if (jucs>=70&&(jucs<=79))
		{
			System.out.println("당신의 점수 : " +jucs);
			System.out.println("B학점입니다.");
			JOptionPane.showMessageDialog(jf, "당신의 점수 : " +jucs+"\n C학점 입니다.", "학점", 1);
			System.exit(0);
			i = "C";
		}
		else if (jucs>=60&&(jucs<=69))
		{
			System.out.println("당신의 점수 : " +jucs);
			System.out.println("B학점입니다.");
			JOptionPane.showMessageDialog(jf, "당신의 점수 : " +jucs+"\n D학점 입니다.", "학점", 2);
			System.exit(0);
			i = "D";
		}
		else
		{
			System.out.println("당신의 점수 : " +jucs);
			System.out.println("B학점입니다.");
			JOptionPane.showMessageDialog(jf, "당신의 점수 : " +jucs+"\n F학점 입니다.", "학점", 0);
			System.exit(0);
			i = "F";
		}
		
/*		int j=0;
		j = jucs;
		String  k ="" ;
		switch (j/10) {
		case 10:
		case 9:
			k="A";
			break;
		case 8:
			k="B";
			break;
		case 7:
			k="C";
			break;
		case 6:
			k="D";
			break;
		default : 
			k="F";
			break;
		
		}
		System.out.println("당신의 학점은 : " +k+"입니다.\n" + "당신의 점수는 : " +jucs+"입니다.");
		System.exit(0);*/
		
	}
	
	}
	
	