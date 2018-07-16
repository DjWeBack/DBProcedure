package com.ch4;

public class FizBuzzGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * FizBuzzGame구현해 보기
		 * 1 2 3 4 fizz 6 buzz 8 9 fizz 11 12 13 buzz fizz 16 17 18 19 fizz buzz
		 */

		int i = 0;
		String fi= "Fizz";
		String bu= "buzz";
		 for(i=0;i<=100;i++)
		{
			if(i%5==0 && i%7==0) {
				System.out.println(fi+bu);
			}
			else if(i%5==0)
			{
				System.out.println(fi);
			}
			else if(i%7==0) {
				System.out.println(bu);
			}
			else {
				System.out.println(i);
				
			}
		}

		
		while (i<=100) {
			
			if(i%5==0 && i%7==0) {
				System.out.println(fi+bu);
			}
			else if (i==1)
			{
				System.out.println("========");
			}
			else if(i%5==0)
			{
				System.out.println(fi);
			}
			else if(i%7==0) {
				System.out.println(bu);
			}
			else {
				System.out.println(i);
			}
			i++;
		}
	}

	}

