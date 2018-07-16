package com.ch4;
/*
 * 연습문제
 * 1부터 100사이의 숫자를 채번해서 5의 배수이면 5의 배수입니다 라고 출력하고
 * 7로 나눈 나머지가 0이면 7의 배수입니다.라고 출력하고
 * 5로 나눈 나머지가 0이고 7로 나눈 나머지도 0이면 5와 7의 공배수라고 출력하는 
 * 프로그램을 작성하시오.
 * 
 */
public class HakJumSwitch {

	public static void main(String[] args) {
		int jumsu=51;
		char chakjum ='F';
		switch(jumsu/10) {
		case 10: case 9:
			chakjum='A';
			break;
		case 8:
			chakjum='B';
			break;
		case 7:
			chakjum='C';
			break;
		case 6:
			chakjum='D';
			break;
		default:
			chakjum='F';
			break;
		}		
/*		switch(jumsu) {
		case 100: case 99: case 98: case 97: case 96:
		case 95:  case 94: case 93: case 92: case 91:
		case 90:
			chakjum='A';
			break;
		case 89: case 88: case 87: case 86:
		case 85:  case 84: case 83: case 82: case 81:
		case 80:
			chakjum='B';
			break;
		case 3:
			chakjum='C';
			break;
		case 4:
			chakjum='D';
			break;
		default:
			chakjum='F';
			break;
		}*/
		System.out.println("chakjum는 "+chakjum+"입니다.");

	}

}
