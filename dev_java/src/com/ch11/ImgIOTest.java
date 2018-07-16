package com.ch11;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImgIOTest {
	public void initdis() {
		String imagePath = "이미지경로.."; 
		BufferedImage image = null;
		//이미지를 읽어와서 BufferedImage에 넣는다. 
		image = ImageIO.read(new URL(imagePath)); 
		int width = image.getWidth(); 
		int height = image.getHeight(); 
		//파일명 자르기 
		String fileNm = imagePath.substring(imagePath.lastIndexOf("/") + 1); 
		try { 
			// 저장할 이미지의 크기와 타입을 잡아줌. 
			BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR); 
			bufferedImage.createGraphics().drawImage(image, 0, 0, this); 
			// 해당경로에 이미지를 저장함. 
			ImageIO.write(bufferedImage, "jpg", new File("C:/saveImage/" + fileNm)); 
		} 
		catch(Exception e) { 
			e.printStackTrace(); 
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
