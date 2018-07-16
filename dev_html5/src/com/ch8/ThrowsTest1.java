package com.ch8;

public class ThrowsTest1 {
	public static void aMethod() throws Exception{
		try {
			throw new Exception();
		}
//		catch (Exception e) {
//			// 
//		}
		finally {
			System.out.println("finally");
		}
	}
	public static void main(String args[]) {
		try {
			aMethod();
		} catch(Exception e) {
			System.out.println("exception");
		}
		System.out.println("finished");
	}
}
