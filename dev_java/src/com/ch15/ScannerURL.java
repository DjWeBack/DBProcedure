package com.ch15;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ScannerURL {
 
 public static void main(String[] args) {
	 URLConnection urlCon = null;
	 URLConnection urlCon2 = null;
	 Scanner scn = null;
	 try {
		 urlCon = new URL("http://localhost:9000/dev_html5/boardintro/boardintro.jsp").openConnection();
		 urlCon2 = new URL("https://www.naver.com/"+"index.html").openConnection();
		 scn = new Scanner(urlCon2.getInputStream());
		 scn.useDelimiter("//Z");
		 String text = scn.next();
		 System.out.println(text);
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	 
 }
}
