package com.ch7;

public class NoteBook extends Object{
	public boolean isTypeCheck(NoteBook nb) {
		boolean isOk = false;
		//instanceof 자주사용됨.
		if(nb instanceof NoteBook) {
			isOk = true;
		}
//		else if(nb instanceof Sonata) {
//			
//		}
		return isOk;
	}
	//이때 아빠가 정의한 메소드 toString은 쉐도우 메소드라고함.
	@Override
	public String toString() {
		return "나는 삼성 노트북입니다.";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook nb = new NoteBook();
		System.out.println(nb.toString());
	}

}
