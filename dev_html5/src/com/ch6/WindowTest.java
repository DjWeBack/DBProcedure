package com.ch6;
import javax.swing.*;
public class WindowTest {
	JFrame jf = new JFrame();
	JTextArea jt = new JTextArea();
	public void windowOpen(String IDcheck, int ho, int va){
		//ID중복검사, 가로크기, 세로크기
		jf.setTitle(IDcheck);
		jf.setSize(ho, va);
		jf.setVisible(true);
		jf.add(jt);
		jt.append("중복검색창입니다.");
	}
	public void windowOpen(int pnum, int ho, int va){
		//우편번호검색, 가로크기,세로크기
		String Pnumname = String.valueOf(pnum);
		Pnumname = "우편번호 검색";
		jf.setTitle(Pnumname);
		jf.setSize(ho, va);
		jf.setVisible(true);
		jf.add(jt);
		jt.append("우편번호 검색창 입니다.");
	}
	public void windowOpen(String book, String ho, String va){
		//도서검색, 가로크기,새로크기
		int pho=0;
		int pva=0;
		pho = Integer.parseInt(ho);
		pva = Integer.parseInt(va);
		jf.setTitle(book);
		jf.setSize(pho,pva);
		jf.setVisible(true);
		jf.add(jt);
		jt.append("도서검색 창입니다.");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowTest wt[] = {new WindowTest(),new WindowTest(),new WindowTest()};//인스턴스 변수도 배열안에 담을수 있음... 개신기....
		
		wt[0].windowOpen("중복검색창",300,500);
		wt[1].windowOpen(4451,800,500);
		wt[2].windowOpen("도서검색","500","500");
		}


}
