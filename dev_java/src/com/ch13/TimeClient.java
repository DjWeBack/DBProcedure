package com.ch13;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.*;
public class TimeClient extends JFrame implements Runnable{
	TimeServer ts = new TimeServer();
	JLabel jlb_time = new JLabel("현재시간",JLabel.CENTER);
	JLabel jlb_stime = new JLabel(ts.getTime());
	public void initDisplay() {
		this.add("North",jlb_time);
		this.add("Center",jlb_stime);
		this.setTitle("단말기");
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeClient tc = new TimeClient();
		tc.initDisplay();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Socket socket = null;
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		try {
			socket = new Socket("127.0.0.1", 8080);
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			while(true) {
				if(ois.readObject()!=null) {
				String time = (String)ois.readObject();
				jlb_time.setText(time);
				try {
					Thread.sleep(1);
				} catch (InterruptedException ie) {
					System.out.println(ie.toString());
					// TODO: handle exception
				}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				ois.close();
				oos.close();
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
		}
		
	}

}
