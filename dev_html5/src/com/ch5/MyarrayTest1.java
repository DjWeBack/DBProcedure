package com.ch5;
import java.util.*;
public class MyarrayTest1 {
	public void initArry(int nums[], int size) {
		Random rn = new Random();
		for(int i=0;i<size;i++) {
			nums[i] = rn.nextInt(10);
		}
	}
	public void print10PerLine(int nums[], int size) {

		for(int i=0;i<size;i++) {
			System.out.printf("%3d", nums[i]);
			if(i%10==9) System.out.println("");
		}
	}
	/*
	 * @param nums[]- 채번한 숫자 100개(재료), fres[]-100개에 숫자를 대한 빈도를 계산, 재료의 수 
	 */
	public void numberCount( int nums[],int fres[], int size) {
		int i;//0부터~99까지 세는 변수
		int index; //100개의 숫자중 그 숫자가 나왔을때 1차배열의 인덱스가 같은곳에 1증가시킨다.
		for(i=0;i<size;i++) {
			index = nums[i];//채번한 숫자-nums배열, fres배열에는 빈도 수를 담는다.
			fres[index]++;//fres[index]=fres[index]+1


		}
	}
	/*public void numberCount
	 * 파라미터에는 원시형 타입이나 참조형 타입을 넘길 수 있다.
	 * 원시형 타입의 경우 그 값이 복사 되는 것이고 - 복제본이 만들어 진다.
	 * 참조형 타입의 경우 원본의 주소번지를 넘기는 것이다.
	 * 파라미터에는 한번에 여러개의 원시형타입의 값 그리고 여러개의 주소번지를 넘길 수 있다.
	 * 파타미터에 넘겨니는 값들은 호출할 때 넘어옴.
	 */
	public void PrintResult(int fres[], int size) {
		System.out.print("숫자 :  ");
		for(int i=0;i<size;i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		System.out.print("빈도수 : ");
		for(int i=0;i<size;i++) {
			System.out.printf("%3d",fres[i]);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[100];
		MyarrayTest1 mat = new MyarrayTest1();
		mat.initArry(nums, nums.length);
		mat.print10PerLine(nums, nums.length);
		int fres[] = new int[10];
		mat.numberCount(nums,fres,nums.length);
		mat.PrintResult(fres,fres.length);
	}
}


