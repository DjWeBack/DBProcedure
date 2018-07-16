package com.ch4;

public class IfReturnTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// 다른클래스가 소유한 메소드를 호출할 때 - 인스턴스화!
		// 다른방법이 있다. static
		// 메소드 앞에 static이 있으면 인스턴스화 없이도 가능.
		args = new String[1];
		args[0] = "1";
		//int user = Integer.parseInt(args[0]);
		//버그의 위험이 있다.
		//String타입은 디폴트값이 null이므로 파스인트로 인한 형변환이 이루어지지 않음.
		//그러므로 에러가 발생.
		if(args==null) {
			return;//main메소드를 탈출함.
		}
		// 숫자를 입력한거니?
		int user = 0;
		if(args[0].length()==1) {
			char ch2 = args[0].charAt(0);
			if(ch2>=0&&ch2<9) {
				user = Integer.parseInt(args[0]);
			}
			else
			{
				System.out.println("한자리 숫자만 입력하세요.");
				return;
			}
		}
		System.out.println(args[0]);
		System.out.println((user+3));
		char ch = 1;
		System.out.println(ch>=0);
		System.out.println('C'>'B');
		System.out.println(Integer.parseInt("10"));
		//System.out.println(Integer.parseInt("true"));
		//System.out.println(Integer.parseInt("회식"));
		//System.out.println(Integer.parseInt(null));
	}

}
