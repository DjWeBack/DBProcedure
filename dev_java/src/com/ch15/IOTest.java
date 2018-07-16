package com.ch15;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOTest {
public void methodA() {
	try {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test.txt"));
		bis.read();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "src//com//ch13//";
		try {
			InputStream is = null;
			OutputStream os = null;
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			File f = new File(filePath+"ThreadTest2.java");
			boolean isOk = f.exists();
			System.out.println("파일이 존재 하니?"+isOk);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
