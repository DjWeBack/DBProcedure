package com.test;

import java.io.*;
import java.net.*;

public class ChatServer extends Thread{ 
	//채팅서버 클래스
	
		
	void ChatServer() {
		SocketStart();
		
	}
	void ChatServer(int a) {
		//인트형 생성자
		
	}
	public void DataBase() {
		//데이터베이스 메소드 //실전에선 디비커넥션을 이욜할 예정.
		String user_id="weback";
		String user_pw="112233";
	}
	public void initDisplay() {
		//UI 생성 메소드
	}
	public void SocketStart() {
		try {
			ServerSocket s_socket = new ServerSocket(8080);		// 서버 생성 한 ip 당 6만개 정도를 만들수있고 그 구분은 포트번호 (8080);
			Socket c_Socket = s_socket.accept();				// 유저가 서버에 들어오는 것을 확인 하는 구문 
			OutputStream s_reqO = c_Socket.getOutputStream();	// 출력을 할수있는 통로를 지정
			InputStream s_reqI = c_Socket.getInputStream();		// 입력을 할수있는 통로를 지정
			
			DataInputStream DIS = new DataInputStream(s_reqI);	// 데이터 타입의 보관함 
			DataOutputStream DOS = new DataOutputStream(s_reqO);// 데이터 타입의 트럭 
			
			String ServerMsg = "Server접속 성공";
			
			DOS.writeUTF(ServerMsg);
			DIS.readUTF();
			
			s_socket.close();
			c_Socket.close();
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}
	@Override
	public void run() {
		try {
			
			SocketStart();
			//첫번째 쓰레드는 소켓대기상태를 만드는 쓰레드임
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String args[]) {
		new ChatServer();
		
	}
}
