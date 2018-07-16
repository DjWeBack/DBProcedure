package com.semi2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BaseBallGameEvent implements ActionListener{
	BaseBallGameview viewG = new BaseBallGameview();
	BaseBallGameLogic logicG = new BaseBallGameLogic();
public void Gevent(){
	for(int nu = 0; nu<viewG.jbtns.length; nu++)
	{
		viewG.jbtns[nu] = new JButton(viewG.btnn[nu]);
		viewG.jbtns[nu].addActionListener(this);
		//addActionListener(this);

	}
	///////메인화면////////////
	viewG.jtf_input.addActionListener(this);
	//버튼 맵핑
}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();//이벤트가 발생한 클래스의 주소번지
		String label = e.getActionCommand();
		String userNum = viewG.jtf_input.getText();
		if(obj==viewG.jtf_input) {
			viewG.jt_tarea.append(viewG.jtf_input.getText()+"\n");
			viewG.jtf_input.setText("");
			viewG.jt_tarea.append(logicG.result(userNum));



		}
		else if("새게임".equals(label)) {
			//사용자가 클릭한 버튼의 문제가 새게임? 주소번지(jbtn_new)가 가진 문자열 비교.
			logicG.randoms();

		}
		else if("정답".equals(label)) {
			viewG.jt_tarea.append(logicG.nansu[0]+""+logicG.nansu[1]+""+logicG.nansu[2]+"\n");
		}
		else if("지우기".equals(label))
		{
			viewG.jt_tarea.setText("야구 숫자 게임 !\n"+"중복값이 존재 할경우 현재 배팅x3\n");
			logicG.randoms();
		}
		else if("종료".equals(label)) {
			System.exit(0);
		}
	}
}

