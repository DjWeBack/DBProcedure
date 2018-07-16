package com.ch6;

public class P251 {
	static int showMenu() {
		int select = 0;
		return select;
	}
	static void inputRecord() {
		System.out.println("인풋 호출성공");
	}
	static void changeRecord() {
		System.out.println("교체 호출성공");
	}
	static void deleteRecodrd() {
		System.out.println("삭제 호출성공");
	}
	static void searchRecord() {
		System.out.println("검색 호출성공");
	}
	static void showRecordList() {
		System.out.println("리스트 호출성공");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];

		int initArr = numArr[0];
		int printArr = numArr[1];
		int sortArr = numArr[2];
			
		switch(showMenu()) {
		case 1: inputRecord();
		break;
		case 2: changeRecord();
		break;
		case 3: deleteRecodrd();
		break;
		case 4: searchRecord();
		break;
		default: showRecordList();
		break;
		
		}

}
}