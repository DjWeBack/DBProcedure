package com.ch8;

import java.util.Random;
import java.util.Scanner;

public class Throw {
/******************************************************
 * 2018.06.18
 *  Throw
 *    - 위치는? 실행문 다음에 (try catch)
 *    - 언제? 예외처리가 일어나면.... > 예외이름
 *    - why? throw 다음에 이름에서 처리할 코드가 있으면.
 *   
 *  Throws
 *    - 메소드 뒤에
 *    - 예외처리를 미룬다
 *    - 그 예외가 사용자 정의로 처리할수 없을때.
 * finally (무조건 처리가 되야할때.)
 ******************************************************/
	public void Throwtest() {
		System.out.println("0부터 9사이의 숫자를 입력하세요.");
		Scanner scn = new Scanner(System.in);
		String val = scn.nextLine();
		int val2 = 0;
		val2 = Integer.parseInt(val);
		try {
			 
			if(val.length()>1) {
				throw new Exception("한자리만 입력하세요");
			}
			if(val==null||val.equals("")) {
				throw new NumberFormatException();
			}
			System.out.println((int)val.charAt(0));
	
			
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}	
		
		
			// TODO: handle exception
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throw th = new Throw();
		th.Throwtest();
			
	}

}
