package com.ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Filecopy {
	public static void main(String[] args) {
		String path = "E:\\weback\\";
		try (FileInputStream fis = new FileInputStream(path + "test.txt");
				FileOutputStream fos = new FileOutputStream(path + "Copy.txt");) {

			int data = 0;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
