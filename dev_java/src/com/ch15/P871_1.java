package com.ch15;

import java.io.FileReader;
import java.util.Scanner;

public class P871_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		Scanner scn = null;
		try {
			fr = new FileReader("src//com//ch15//"+"P871_1.java");
			scn = new Scanner(fr);
			while(scn.hasNextLine()) {
				System.out.println(scn.nextLine());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
