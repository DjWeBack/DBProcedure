package socat1and1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;


public class Socat {

	int port = 8888;
	ServerSocket ss;
	Socket sk ;
	DataInputStream in;
	DataOutputStream out;
	SeverRun r;
	StringBuffer msg = new StringBuffer();
	public void SocatRan() throws IOException {
		ss = new ServerSocket(port);
		System.out.println("서버 시작");
		sk = ss.accept();
		in = new DataInputStream(sk.getInputStream());
		out = new DataOutputStream(sk.getOutputStream());
		out.writeUTF(msg.toString());
		while(true) {
			msg.append(in.readUTF()+"\n");
			r.jta.setText(msg.toString());
		}
		
	
	}
	
	   public static void main(String[] args) throws IOException {
		   SeverRun SeverRun = new SeverRun();
		   SeverRun.initdisplay();
	   }

	public void setR(SeverRun r) {
		this.r = r;
	}
}
