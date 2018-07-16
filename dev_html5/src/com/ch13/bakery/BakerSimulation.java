package com.ch13.bakery;

public class BakerSimulation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BakerStack bs = new BakerStack();
		Baker ba1 = new Baker(bs);
		ba1.start();
		Baker ba2 = new Baker(bs);
		ba2.start();
		Baker ba3 = new Baker(bs);
		ba3.start();
		Customer cs1 = new Customer(bs);
		cs1.start();
		Customer cs2 = new Customer(bs);
		cs2.start();
		Customer cs3 = new Customer(bs);
		cs3.start();
		
		
	}

}
