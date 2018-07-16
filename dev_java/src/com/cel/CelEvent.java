package com.cel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class CelEvent implements ActionListener {
	CelView clv=null;
	StringBuffer sb = new StringBuffer();
	String bsb="";
	String asb="";
	int ibsb = 0;
	int iasb = 0;
	int ieq =0;
	String eq="";
	String sik ="";
	public CelEvent(CelView clv) {
		this.clv=clv;
	}
	public int plus(int ibsb, int iasb) {
		this.ibsb=ibsb;
		this.iasb=iasb;
		ieq=ibsb+iasb;
		return ieq;
	}
	public int min(int ibsb, int iasb) {
		this.ibsb=ibsb;
		this.iasb=iasb;
		ieq=ibsb-iasb;
		return ieq;
	}
	public int gob(int ibsb, int iasb) {
		this.ibsb=ibsb;
		this.iasb=iasb;
		ieq=ibsb*iasb;
		return ieq;
	}
	public int nanu(int ibsb, int iasb) {
		this.ibsb=ibsb;
		this.iasb=iasb;
		ieq=ibsb/iasb;
		return ieq;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();
		if(obj==clv.jbtn_1) {
			sb.append(clv.jbtn_1.getLabel());
			clv.jtf_display.setText(sb.toString());
		}
		else if(obj==clv.jbtn_2) {
			sb.append(clv.jbtn_2.getLabel());
			clv.jtf_display.setText(sb.toString());
		}
		else if(obj==clv.jbtn_3) {
			sb.append(clv.jbtn_3.getLabel());
			clv.jtf_display.setText(sb.toString());
		}
		else if(obj==clv.jbtn_4) {
			sb.append(clv.jbtn_4.getLabel());
			clv.jtf_display.setText(sb.toString());
		}
		else if(obj==clv.jbtn_5) {
			sb.append(clv.jbtn_5.getLabel());
			clv.jtf_display.setText(sb.toString());
		}
		else if(obj==clv.jbtn_6) {
			sb.append(clv.jbtn_6.getLabel());
			clv.jtf_display.setText(sb.toString());
		}
		else if(obj==clv.jbtn_7) {
			sb.append(clv.jbtn_7.getLabel());
			clv.jtf_display.setText(sb.toString());
		}
		else if(obj==clv.jbtn_8) {
			sb.append(clv.jbtn_8.getLabel());
			clv.jtf_display.setText(sb.toString());
		}
		else if(obj==clv.jbtn_9) {
			sb.append(clv.jbtn_9.getLabel());
			clv.jtf_display.setText(sb.toString());
		}
		else if(obj==clv.jbtn_0) {
			sb.append(clv.jbtn_0.getLabel());
			clv.jtf_display.setText(sb.toString());
		}
		if(obj==clv.jbtn_ac) {
			sb.setLength(0);
			clv.jtf_display.setText("");
					}
		if(obj==clv.jbtn_bs) {
			sb.deleteCharAt(sb.length()-1);
			clv.jtf_display.setText(sb.toString());
					}
		if(obj==clv.jbtn_plus) {
			bsb = sb.toString();
			ibsb = Integer.parseInt(bsb);
			sb.setLength(0);
			sik="+";
				}
		else if(obj==clv.jbtn_min) {
			bsb = sb.toString();
			ibsb = Integer.parseInt(bsb);
			sb.setLength(0);
			sik="-";
		}
		else if(obj==clv.jbtn_x) {
			bsb = sb.toString();
			ibsb = Integer.parseInt(bsb);
			sb.setLength(0);
			sik="*";
		}
		else if(obj==clv.jbtn_avr) {
			bsb = sb.toString();
			ibsb = Integer.parseInt(bsb);
			sb.setLength(0);
			sik="/";
		}
		
		if(obj==clv.jbtn_equ) {
			asb = sb.toString();
			iasb=Integer.parseInt(asb);
			if(sik.equals("+")) {
			eq=String.valueOf(plus(ibsb,iasb)); 
			}
			else if(sik.equals("-")) {
				eq=String.valueOf(min(ibsb,iasb));
			}
			else if(sik.equals("*")) {
				eq=String.valueOf(gob(ibsb,iasb));
			}
			else if(sik.equals("/")) {
				double gap = 0.0;
				gap=(double)nanu(ibsb,iasb);
				eq=String.valueOf(gap);
			}
			clv.jtf_display.setText(eq);
			sb.setLength(0);
		}
	}
}

