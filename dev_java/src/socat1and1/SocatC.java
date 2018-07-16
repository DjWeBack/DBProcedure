package socat1and1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocatC {
	DataInputStream		in;
	DataOutputStream	out;
	SocatCRun r;
	StringBuffer msg = new StringBuffer();
	void SocatCrun() throws UnknownHostException, IOException{
		Socket sk = new Socket("127.0.0.1",8888);
		System.out.println("연결이 되었습니다.");
		 in = new DataInputStream(sk.getInputStream());
		 out = new DataOutputStream(sk.getOutputStream());
		 msg.append(sk.getPort()+"님이 접속하셧습니다.");
		 out.writeUTF(msg.toString());
		while(true) {
			msg.append(in.readUTF()+"\n");
			r.jta.setText(msg.toString());
		}
	}


	public void setR(SocatCRun r) {
		this.r = r;
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		SocatCRun SocatCRun = new SocatCRun();
		SocatCRun.initdisplay();
	}
}
