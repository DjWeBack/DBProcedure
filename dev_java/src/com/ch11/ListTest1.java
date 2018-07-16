package com.ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class ListTest1 {
/*
 * 선언부의 타입과 생성부의 타입이 다를 수 있다. - 다형성의 전제조건
 * 다를 경우 생성부에 오는 클래스 타입으로 객체 생성이 일어남.
 * 선언부에 더 상위클래스나 인터페이스가 오면 생성부에 다양한 클래스를 인스턴스화 할 수 있어서 좋다.
 * 예) 코드를 덜 수정하고 요구사항을 만족시킬수 있다.
 */
	ListTest1(){
		setNameList();
		setAniList();
		printNameList();
		printAniNameList();
	}
	List nameList2 = new Vector(); 
	List nameList = new ArrayList();
	ArrayList aniList = new ArrayList();
	public List setNameList() {
		nameList.add("유재석");
		nameList.add(1,"김종국");
		nameList.add(2,"하하");
		return nameList;
	}
	public Vector setNameList2() {
		nameList2.add("유재석");
		nameList2.add(1,"김종국");
		nameList2.add(2,"하하");
		return (Vector) nameList2;
	}
	public ArrayList setAniList() {
		aniList.add("cat");
		aniList.add(1,"dog");
		aniList.add(2,"pig");
		return aniList;
	}
	public void printNameList() {
		for(int i=0;i<nameList.size();i++) {
			System.out.println(nameList.get(i));
		}
		System.out.println("=====[[개선 for문]]======");
		for(Object obj:nameList) {
			//컬렉션프레임워크 클래스는 모두 Object타입을 담는다.
			//제네릭을 사용하지 않는 경우 타입을 따로 맞춰 주어야 한다.
			System.out.println(obj);
		}
		System.out.println("========================");
		System.out.println("유재석 있니?"+nameList.contains("유재석"));
		
	}
	public void printAniNameList() {
		for(int i=0;i<aniList.size();i++) {
			System.out.println(aniList.get(i));
		}
		System.out.println("=====[[개선 for문]]======");
		for(Object obj:aniList) {
			System.out.println(obj);
		}
		System.out.println("========================");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListTest1();
	}

}
