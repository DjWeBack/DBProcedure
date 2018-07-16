package com.test2;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatClient {
		ChatServer cs = new ChatServer();
		public String Uid() { //유저아이디 입력란
			String u_id = "weback";
			return u_id;
			}
		public String Upw() {
			String u_pw = "112233";
			return u_pw;
			}
				
	public void clientstart() {
		try {
			
			System.out.println("클라이언트 접속 대기중");
			Socket c_Socket = new Socket("127.0.0.1", 8080);
			System.out.println("서버접속완료");
			InputStream c_req = c_Socket.getInputStream();
			if(Uid()==cs.DID()&&Upw()==cs.DPW()) {
			byte socketBuf[] = new byte[100];
			c_req.read(socketBuf);
			System.out.println(new String(socketBuf));
			c_Socket.close();
		}
			else {
				System.out.println("접속실패");
			}
		}
		 catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("접속에 실패하였습니다.");
				}
		
	}
		
	public static void main(String args[]) {
		ChatClient cc = new ChatClient();
		cc.clientstart();
		
	}
}
