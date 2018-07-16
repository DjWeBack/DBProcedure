package com.ch6;

class Jumsu{
	String name=null;
	int java = 0;
	int ora=0;
	Jumsu() {
		
	}
	Jumsu(String name, int java, int ora) {
		this.name=name;
		this.java=java;
		this.ora=ora;
	}
}
public class Sungg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jumsu ju = new Jumsu();
		Jumsu ju1 = new Jumsu("±èÈÆÅÂ", 90, 80);
		System.out.println(ju.name+","+ju.java+","+ju.ora);
		System.out.println(ju1.name+","+ju1.java+","+ju1.ora);

	}

}
