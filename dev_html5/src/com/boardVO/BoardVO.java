package com.boardVO;
/*
 * ��������� �����ϴ� ���̺��� �ִ�. emp
 * emp���տ��� 8���� �÷��� �ִ�.
 * 8���� ���� �������� ���� 8���� �����ؾ� �ȴ�.
 * �׷��� VO�� ����ϸ� �ּҹ��� �ϳ��� 8�� ���� ��� �ѱ� �� �Ǵ� ���� �� �ִ�.
 */
public class BoardVO {
	int		b_no	 = 0;
	String	b_name	 = null;
	String	b_user	 = null;
	String	b_date	 = null;
	String	b_comm	 = null;
	int		b_view	 = 0;
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_user() {
		return b_user;
	}
	public void setB_user(String b_user) {
		this.b_user = b_user;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String b_date) {
		this.b_date = b_date;
	}
	public int getB_view() {
		return b_view;
	}
	public void setB_view(int b_view) {
		this.b_view = b_view;
	}
	public String getB_comm() {
		return b_comm;
	}
	public void setB_comm(String b_comm) {
		this.b_comm = b_comm;
	}
	
	
	
}
