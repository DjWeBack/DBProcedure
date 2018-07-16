package com.codetest;

public class test2 {
public static String output = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo(0);
		foo(1);
		System.out.println(output);

	}
	public static void foo(int i) {
		try {
			if(i==1) {
				throw new Exception();
			}
			output +="1";
		} catch (Exception e) {
			// TODO: handle exception
			output +="2";
		}
		finally {
			output +="3";
		}
		output +="4";
	}
}