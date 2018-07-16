package com.semi.chatweback;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PictureMessage extends JDialog implements ActionListener{
	JPanel jp_emoticon = new JPanel();
	JButton jbtn_emo1 = new JButton();
	JButton jbtn_emo2 = new JButton();
	JButton jbtn_emo3 = new JButton();
	JButton jbtn_emo4 = new JButton();
	ImageIcon imgs[] = new ImageIcon[4];
	JButton	jbtns[]= {jbtn_emo1,jbtn_emo2,jbtn_emo3,jbtn_emo4};
	String[] imgsFile = {"¹Ð¶ó_¸Þ·Õ.gif","¹Ð¶ó_ºÎ²ô.gif","¹Ð¶ó_»ßÁü.gif","¹Ð¶ó_È­³².gif"};
	String imgChoice = "default";
	String imgPath = "src//com//semi//chatweback//tales_emoticon//";
	public PictureMessage() {
		initDisplay();
	}
	public void initDisplay() {

		for(int i=0;i<imgs.length;i++) {
			imgs[i] = new ImageIcon(imgPath+imgsFile[i]);
			jbtns[i].setIcon(imgs[i]);
		}

		jp_emoticon.setLayout(new GridLayout(1, 4,2,2));
		jp_emoticon.add(jbtn_emo1);
		jp_emoticon.add(jbtn_emo2);
		jp_emoticon.add(jbtn_emo3);
		jp_emoticon.add(jbtn_emo4);
		this.add("Center",jp_emoticon);
		this.setResizable(false);
		this.setSize(300,150);
		this.setVisible(false);
	}
/*	public static void main(String args[]) {
		new PictureMessage();
	}*/
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj==jbtn_emo1) {
			imgChoice="¹Ð¶ó_¸Þ·Õ.gif";
		}
		else if(obj==jbtn_emo2) {
			imgChoice="¹Ð¶ó_ºÎ²ô.gif";
		}
		else if(obj==jbtn_emo3) {
			imgChoice="¹Ð¶ó_»ßÁü.gif";
		}
		else if(obj==jbtn_emo4) {
			imgChoice="¹Ð¶ó_È­³².gif";
		}
	}
}
