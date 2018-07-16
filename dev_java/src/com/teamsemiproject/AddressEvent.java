package com.teamsemiproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressEvent  implements ActionListener{
	AddressBookUI abu = null;
	AddressCUD acud = new AddressCUD();
	public AddressEvent(AddressBookUI abu) {
		this.abu=abu;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==abu.jbtn_ins) {
//			acud.isView = true;
//			acud.jdi_cud.setTitle("입력");
//			acud.initDisplay();
			acud.set("입력",true,AddressBookUI.abook);
		}
		else if(obj==abu.jbtn_del) {
			acud.Delete(AddressBookUI.abook);
//			acud.isView = true;
//			acud.jdi_cud.setTitle("삭제");
//			acud.initDisplay();

		}
		else if(obj==abu.jbtn_det) {
			abu.dataAll();
//			acud.jdi_cud.setTitle("상세");
//			acud.isView = true;
//			acud.initDisplay();
		}
		else if(obj==abu.jbtn_upd) {
			acud.set("수정",true,AddressBookUI.abook);

		}
		else if(obj==abu.jbtn_all) {
			acud.set("전체보기",true,AddressBookUI.abook);
//			acud.jdi_cud.setTitle("전체");
//			acud.isView = true;
//			acud.initDisplay();
		}
		else if (obj==abu.jmi_exit) {
			System.exit(0);
		}

	}

}
