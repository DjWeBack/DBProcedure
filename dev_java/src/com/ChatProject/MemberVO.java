package com.ChatProject;

import java.io.Serializable;
import java.util.ArrayList;

public class MemberVO implements Serializable{

	private int mem_no;
	private String mem_id;
	private String mem_name;
	private String mem_nick;
	private String mem_gender;
	private String mem_pw;
	private String mem_hp;
	private String mem_profile;
	private String mem_background;

	public MemberVO() {}

	public MemberVO(int mem_no, String mem_id, String mem_name, String mem_nick, String mem_gender, String mem_pw,
			String mem_hp, String mem_profile, String mem_background) {
		this.mem_no = mem_no;
		this.mem_id = mem_id;
		this.mem_name = mem_name;
		this.mem_nick = mem_nick;
		this.mem_gender = mem_gender;
		this.mem_pw = mem_pw;
		this.mem_hp = mem_hp;
		this.mem_profile = mem_profile;
		this.mem_background = mem_background;
	}

	public int getMem_no() {
		return mem_no;
	}

	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_pw() {
		return mem_pw;
	}

	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}

	public String getMem_nick() {
		return mem_nick;
	}

	public void setMem_nick(String mem_nick) {
		this.mem_nick = mem_nick;
	}

	public String getMem_gender() {
		return mem_gender;
	}

	public void setMem_gender(String mem_gender) {
		this.mem_gender = mem_gender;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public String getMem_hp() {
		return mem_hp;
	}

	public void setMem_hp(String mem_hp) {
		this.mem_hp = mem_hp;
	}

	public String getMem_profile() {
		return mem_profile;
	}

	public void setMem_profile(String mem_profile) {
		this.mem_profile = mem_profile;
	}

	public String getMem_background() {
		return mem_background;
	}

	public void setMem_background(String mem_background) {
		this.mem_background = mem_background;
	}
//	public static void main(String args[]) {
//	
//	}
	
}
