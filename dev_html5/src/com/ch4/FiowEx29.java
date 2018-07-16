package com.ch4;

public class FiowEx29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3 6 9출력 단. 33//66//99 는 짝을 두번 출력
		int i = 0;
		for (i=0;i>i;i++) {
			System.out.println("i="+i);
		//if(i==5) {

			//}
		}
		System.out.println("여기 - For문 밖");
		//반복문 사용시
		//무한루프 방지 코드를 꼭 추가합시다. - break문 사용!
		
		while (i>5){
			System.out.println("while문 안");
			break;
		}
		System.out.println("while문 밖");
	}

}

