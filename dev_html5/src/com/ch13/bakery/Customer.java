package com.ch13.bakery;

public class Customer  extends Thread{
	private BakerStack bs = null;
	public Customer(BakerStack bs) {
		this.bs = bs;
	}
	public void run() {
		
		String bread = null;
		//»§°¡Á®¿Í »§¼ÅÆ²»õ³¢¾ß
		bs.pop("Å©¸²Ä¡Áîµµ³Ó");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			// TODO: handle exception
			System.out.println("»õÄ¡±âÇÏ¸é ¶Ò¹è±â ±ü´Ù ¾¾ºÎ¾û¾Æ.");
		}
	}
}
