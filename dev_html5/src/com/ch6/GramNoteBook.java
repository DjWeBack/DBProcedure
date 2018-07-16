package com.ch6;
class NoteBook {
	String usb="usb";
	public void usbRead() {
		System.out.println("usbRead호출 성공");
	}
	public void usbWrite() {
		System.out.println("usbWrite호출 성공 아빠");
	}
}

public class GramNoteBook extends NoteBook{
	@Override
	public void usbRead() {
		System.out.println("usbRead호출 성공");
	}
	@Override
	public void usbWrite() {
		System.out.println("usbWrite호출 성공");
	}
	/*
	 * 메소드 오버라이드는 원형을 바꾸지 않는다.
	 * 리턴타입과 파라미터 그대로 사용해야됨.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오버라이드된 메소드 호출해 보기.
		GramNoteBook gnb = new GramNoteBook();
		gnb.usbRead();
		gnb.usbWrite();
		NoteBook nb = new NoteBook();
		nb.usbRead();
		nb.usbWrite();
	}

}
