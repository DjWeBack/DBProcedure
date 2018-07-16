package socat1and1;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SocatCRun implements ActionListener{
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JTextField jtf = new JTextField();
	JTextArea jta = new JTextArea();
	SocatC c = new SocatC();
	
	public void initdisplay() throws IOException {
		jtf.addActionListener(this);
		jf.setSize(600, 300);
		jf.setVisible(true);
		jf.setTitle("채팅창");
		jp.setLayout(new BorderLayout());
		jp.add("South",jtf);
		jp.add("Center",jta);
		jf.add(jp);
		
		jf.addWindowListener(new WindowAdapter() {
			private void windowOpend(WindowEvent e) {
				jtf.requestFocus();
			}
			public void windowClosing(WindowEvent e){
			    System.exit(0);
			  }
		});
		c.setR(this);
		c.SocatCrun();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		c.msg.append("유저:"+jtf.getText()+"\n");
		jta.setText(c.msg.toString());
		System.out.println(c.msg);
		try {
			c.out.writeUTF("유저:"+jtf.getText());
			jtf.setText("");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
