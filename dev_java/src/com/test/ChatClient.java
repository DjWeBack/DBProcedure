package com.test;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatClient {

	public void clientstart() {
		try {
			Socket c_Socket = new Socket("127.0.0.1", 8080);
			InputStream c_req = c_Socket.getInputStream();
			byte socketBuf[] = new byte[100];
			c_req.read(socketBuf);
			System.out.println(new String(socketBuf));
			c_Socket.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String args[]) {
		ChatClient cc = new ChatClient();
		cc.clientstart();
	}
}
