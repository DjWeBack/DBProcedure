package com.ch11;

import java.util.Iterator;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListTest1 lt1 = new ListTest1();
		List nameList = lt1.setNameList();
		Iterator iter = nameList.iterator();
		System.out.println("========list2==========");
		while(iter.hasNext()) {
			Object obj = iter.next();
			System.out.println(obj);
		}
	}

}
