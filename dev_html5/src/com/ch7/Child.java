package com.ch7;

public class Child extends Parent {
 int j=0;
 @Override
 public void MethodB() {
	 System.out.println("Child MethodB호출 성공");
 }
 
 public void MethodB(int i) {
	 System.out.println("Child MethodB호출 성공");
 }
 Object obj = new Object();

 }
