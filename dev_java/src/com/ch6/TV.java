package com.ch6;

public class TV {
	int height = 0;
	int width = 0;
	String tv_color = null;
	int channel =0;//공장
	int volume = 0;
	//자바에서는 생성자를 여러개 정의할 수 있다.(같은이름의)
	public TV() {
		//width = 0, height = 0, channel = 0, volume = 0, color = null
	}
	public TV(int channel, int volume, int width, int height) {
		this.width=width;
		this.height=height;
		this.channel=channel;
		this.volume=volume;
	}
	public TV(int width, int height) {//인스턴스화에 따라 멤버 변수의 초기화가 결정됨.
		this.width = width;
		this.height = height;
		
	}

	boolean PowerOn(boolean on) {
		if(on==true) {
			System.out.println("TV를 켭니다.");
		}
		return on;

	}
	public TV(int channel, int volume,boolean onoff) {
		System.out.println("TV를 켭니다.");
		this.channel = channel;
		this.volume = volume;
		
	}
	public TV(boolean onoff,int width, int height) {
		System.out.println("TV를 끕니다.");
		this.width = width;
		this.height = height;
		
	}
	boolean PowerOff(boolean off) {
		if(off==false) {
			System.out.println("TV를 끕니다.");
		}
		return off;
	}
	int VolumeUp() {
		volume++;
		return volume;
	}
	int VolumeDown() {
		volume--;
		return volume;
	}
	int ChannelUp() {
		channel++;
		return channel;
	}
	int ChannelDown() {
		channel--;
		return channel;
	}

}
