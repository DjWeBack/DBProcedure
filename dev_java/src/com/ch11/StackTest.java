package com.ch11;

import java.util.Stack;
import java.util.Vector;
/***********************
 * Stack은 처음에 담은 정보가(나중에) 나온다.
 * Stack에 들어있는 정보를 꺼내면 담긴 정보는(삭제되지만 인스턴스는 유지) 된다.
 * Stack는 Vector에 자식 클래스 이지만 (사용 용도가)가 다르다.
 * Stack에 정보를 담을 때와 꺼낼 때 (순서)가 다르다.
 * Stack에 담긴 정보를 꺼낼 때 Vector와 달리 (인덱스) 을 사용할 필요가 없다.
 ***********************/
public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Vector vec = new Vector<>();
		Stack st = new Stack();
		st.push("사과");
		st.push("바나나");
		st.push("수박");
		vec.set(0, "a");
		System.out.println(vec.get(0));
		vec.set(1, "b");
		System.out.println(vec.get(0));
		System.out.println("st.size() : " + st.size());
		for(int i=0;i<st.size();i++) {
			System.out.println(st.pop());
		}
		System.out.println(st.empty());
		System.out.println(st.pop());//담긴 정보를 역순으로 꺼냄.
		System.out.println(st.empty());
		
	}

}
