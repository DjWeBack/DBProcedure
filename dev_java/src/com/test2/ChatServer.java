package com.test2;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ChatServer{ 
	//채팅서버 클래스
	public ChatServer(){
		SocketStart();
	}
	public String DID() {
		//데이터베이스 메소드 //실전에선 디비커넥션을 이욜할 예정.
		String user_id="weback";//서버에 저장된 유저아이디
		return user_id;
	}
	public String DPW() {
		String user_pw = "112233";
		return user_pw;
	}
	public void initDisplay() {
		//UI 생성 메소드
	}
	public void SocketStart() {
		try {
			System.out.println("서버 생성대기");
			ServerSocket s_socket = new ServerSocket(8080);
			System.out.println("서버 생성");
			System.out.println("클라이언트 대기중");
			Socket c_Socket = s_socket.accept();
			OutputStream s_req = c_Socket.getOutputStream();
			String ServerMsg = "Server접속 성공";
			int i = 0;
			while(true) {
				if(i==0) {
				s_req.write(ServerMsg.getBytes());
				i++;
				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public static void main(String args[]) {
		new ChatServer();
	}
}
