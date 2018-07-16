package com.ch13;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DukeAnimation extends JFrame implements Runnable{
	//선언부
	String 				imgPath 	= "src//com//ch13//duke//";
	Image[]				dukeimg		= new Image[10];
	JPanel				jp_duke		= new JPanel();
	Thread				animator	= null;
	int 				i			= 0;
//	Image memoryimage = createImage(0, 50);
//	Graphics mgc = memoryimage.getGraphics();
	


	//생성자
		public DukeAnimation(){
			for(int i=1;i<10;i++) {
				dukeimg[i-1] = Toolkit.getDefaultToolkit().getImage(imgPath+"FRAME"+i+".gif");//이미지객체
			
			}
		}
		public void showDuke() {
			animator = new Thread(this);//(인스턴스화를 하게되면 기본생성자가 조건반사적으로 호출됨.. )
			animator.start();
			
		}
		public void update(Graphics g) {
			g.clearRect(0, 50, 80, 70);
	
//			this.paint(g);
			paint(g);

		}
		//이미지를 화면에 그리기 구현 - callbak method  repaint()-updata()-paint()
		public void paint(Graphics g) {
			g.drawImage(dukeimg[i], 0, 50, this);
			
		}
		public void initDisplay() {

			this.setTitle("듀크움짤");
			this.setSize(500, 500);
			this.setVisible(true);
			showDuke();
			//이미지 배열로 담음.

		}
	
	
	//화면부

	//메인메소드
	public static void main(String[] args) {
		DukeAnimation da = new DukeAnimation();
		da.initDisplay();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
		this.update(this.getGraphics());
		i++;
		if(i>=9) {
			i=0;
		}
		try {
			Thread.sleep(50);
		} catch (InterruptedException ie) {
			// TODO: handle exception
			break;
		}
		}
	}

}
