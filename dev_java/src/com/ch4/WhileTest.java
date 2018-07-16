package com.ch4;
/* 코딩 순서
 * 1.WhileTest.java 추가한다.
 * 2.ForTest.java에서 main메소드 안에 코드를 입양한다.
 * 3.for문으로 처리된 부분을 while문으로 바꾸어 본다.
 * 4.for문에서는 변수 선언과 초기화, 조건식, 증감연산자를 지원하지만
 *   while문에서는 조건식만 지원되므로 변수선언 및 초기화, 증감연산자를 따로
 *   해주어야 한다.
 */
public class WhileTest {

	public static void main(String[] args) {
		int i = 1;
		int hap = 0;
		while(i<=100) {
			if(i%2==0) {
				//hap = hap + i;
				hap+=i;
				System.out.println("hap:"+hap);
			}
			//while문에서는 증감연산자를 처리하는 부분이 따로 없으므로 반드시 추가해야 함
			//만일 이 코드를 누락하게 되면 무한루프에 빠짐.
			//영원히 while문을 탈출할 수 없게 됨
			//메모리가 꽉 차게되면 PC가 다운될 수 있음.
			//혹은 메모리 덤프가 발생(blue screen)하거나 memory overflow가 발생함.
			i = i + 1;
		}
		System.out.println("1부터 100까지의 짝수의 합은? "+hap);
	}
/* FizzBuzzGame 구현해 보기(숫자게임)
 * 1 2 3 4 fizz 6 buzz 8 9 fizz 11 12 13 buzz fizz 16 17 18 19 fizz buzz,.....34 fizzbuzz 36 37
 * FizzBuzzGame.java	
 */

}







