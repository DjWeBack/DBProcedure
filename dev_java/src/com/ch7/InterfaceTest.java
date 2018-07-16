package com.ch7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class InterfaceTest {
	public void setSonataList(Vector<String> nameList) {
		nameList.add("NF 소나타");
		nameList.add("2018년형 소나타");
		nameList.add("2019년형 소나타");
	}
	public void setSonataList(ArrayList<String> nameList) {
		nameList.add("그녀의 소나타");
		nameList.add("그놈의 소나타");
		nameList.add("당신의 소나타");
	}
	public void setSonataList(List<String> nameList) {
		nameList.add("이코노미 소나타");
		nameList.add("2.4 소나타");
		nameList.add("2.0 소나타");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		InterfaceTest ift = new InterfaceTest();
		Vector<String> nameList = new Vector<>();
		ArrayList<String> nameList2 = new ArrayList<String>();
		ift.setSonataList(nameList);
		for(String carName:nameList) {
			System.out.println("Vector[멀티쓰레드안전:속도느림] : "+carName);
		}
		ift.setSonataList(nameList2);
		for(String carName:nameList2)
		{
			System.out.println("ArrayList[싱글쓰레드안전:속도빠름] : "+carName);
		}
		
		List<String> nameList3 = new ArrayList<>();//List<>는 가장 큰 형태이므로 ArrayList나 Vector등으로 자유자재로 타입을 변형해서 사용할수 있음.
		//<> 안에는 타입 영향을 안받음 심지어 클래스가 올수도있음.
		
		ift.setSonataList(nameList3);
		for(String carName:nameList3) {
			System.out.println("ArrayList3[싱글쓰레드안전:속도빠름] : "+carName);
		}
	}

}
