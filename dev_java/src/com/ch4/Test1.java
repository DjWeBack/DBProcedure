package com.ch4;
import java.util.*;
import javax.swing.*;
public class Test1 {

	public static void main(String[] args) {
		/* 연습문제
		 * 1부터 100사이의 숫자를 채번해서 5의 배수이면 5의 배수입니다 라고 출력하고.
		 * 7로 나눈 나머지가 0이면 7의 배수 입니다. 라고 출력하고.
		 * 5로 나눈 나머지가 0이고 7로 나눈 나머지도 0이면 5와 7의 공배수라고 출력하는
		 * 프로그램을 작성하시오.
		 */
		JFrame jf = new JFrame();
		Random ran = new Random();
		int r = ran.nextInt(10000);
		
		int Jumsu = 0;
		String Jum = "";
		Jum = JOptionPane.showInputDialog("수를 넣어보세요");
		Jumsu = Integer.parseInt(Jum);

		
		/* if (Jumsu%5==0 && Jumsu%7==0)
		{
			JOptionPane.showMessageDialog(jf, Jumsu+"는 5와7의 배수 입니다.", "배수확인", 1);	
		}
		else if (Jumsu%5 == 0)
		{
			JOptionPane.showMessageDialog(jf, Jumsu+"는 5의 배수 입니다.", "배수확인", 1);	
		}
		else if (Jumsu%7==0)
		{
			JOptionPane.showMessageDialog(jf, Jumsu+"는 7의 배수 입니다.", "배수확인", 1);
		}
		else if (r%7==0 && r%5==0)
		{
			JOptionPane.showMessageDialog(jf, r+"는 5와7의 배수 입니다.", "배수확인", 1);
		}
		else
		{
			{
				JOptionPane.showMessageDialog(jf, Jumsu+"는 5와7의 배수가 아닙니다..", "배수확인", 1);
			} */
	if (r%5==0)
		{
			JOptionPane.showMessageDialog(jf, r+"는 5의 배수 입니다.", "배수확인", 1);
		}
		else if (r%7==0)
		{
			JOptionPane.showMessageDialog(jf, r+"는 7의 배수 입니다.", "배수확인", 1);
		}
		else if (r%5!=0 && r%7!=0)
		{
			JOptionPane.showMessageDialog(jf, r+"는 5와7의 배수가 아닙니다..", "배수확인", 1);
		}
		
		else
		{
			
				JOptionPane.showMessageDialog(jf, r+"는 5와7의 배수가 아닙니다..", "배수확인", 1);
			}
	System.exit(0);
		}
	
		}
	
	


