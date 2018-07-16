package com.ch8;

import java.util.ArrayList;
import java.util.List;

import com.ChatProject.MemberVO;
import com.ch6.Sonata;

public class ArrayListTest {
	String a = "";
	List al = new ArrayList();
	ArrayList al2 = new ArrayList();
	List<String> al3 = new ArrayList<String>();
	List<Sonata> al4 = new ArrayList<Sonata>();
	ArrayList<MemberVO> al5 = new ArrayList<MemberVO>();
	public void setList() {
		al.add("馬馬");
		al.add(new com.base.Sonata());
		al.add(10);
	}
/*	public void setList2() {
		al5.add("馬馬");
		al5.add(new com.base.Sonata());
		al5.add(10);
		
	}*/
	
	public void setList3() {
		Sonata ysCar = new Sonata(a,350,4);
		Sonata gsCar = new Sonata(a,220,4);
		Sonata bhCar = new Sonata(a,100,4);
	}
	public void getList3() {
		for(int i=0;i<al.size();i++) {
			Sonata himCar = al4.get(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
