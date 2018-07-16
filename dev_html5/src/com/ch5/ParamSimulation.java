package com.ch5;
class Param{
	int ival=0;
}
public class ParamSimulation {
	public void effectParam(Param p) {
		//p = new Param();
		p.ival=500;
		System.out.println("sub ival : "+p.ival); //500 500
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParamSimulation ps = new ParamSimulation();
		Param p = new Param();
		p.ival=100;
		ps.effectParam(p);
		System.out.println("main ival : "+p.ival); //500 100

	}

}
