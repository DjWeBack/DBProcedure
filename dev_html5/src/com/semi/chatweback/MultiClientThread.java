package com.semi.chatweback;

import java.awt.Color;
import java.util.StringTokenizer;

import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class MultiClientThread extends Thread {
	MultiClient multiClient = null;
	public MultiClientThread(MultiClient multiClient) {
		this.multiClient = multiClient;
	}
	public SimpleAttributeSet makeAttribute(String style[]) {
		SimpleAttributeSet sas = new SimpleAttributeSet();
		//폰트 컬러
		sas.addAttribute(StyleConstants.ColorConstants.Foreground
				       , new Color(Integer.parseInt(style[0])));
		//폰트 타입
		switch(style[1]) {
			case "Font.ITALIC":
				sas.addAttribute(StyleConstants.CharacterConstants.Italic, true);
				break;
			case "Font.BOLD":
				sas.addAttribute(StyleConstants.CharacterConstants.Bold, true);
				break;
		}
		//폰트 사이즈
		sas.addAttribute(StyleConstants.CharacterConstants.Size, Integer.parseInt(style[2]));
		return sas;
	}
	@Override
	public void run() {//듣기:run-스레드에서, 말하기:actionPerformed-MultiClient
		String message = "";//100|대화명
		boolean isStop = false;
		while(!isStop) {
			try {
				message = (String)multiClient.ois.readObject();
				StringTokenizer st = null;
				int protocol = 0;//지역변수이니까 초기화
				if(message !=null) {
					st = new StringTokenizer(message,"|");
					protocol = Integer.parseInt(st.nextToken());
				}
				switch(protocol) {
				case Protocol.ROOM_IN:{
					String chatName = st.nextToken();
					String[] names = new String[3];
					names[0] = chatName;
					names[1] = "남";
					names[2] = "29";
					multiClient.dtm_list.addRow(names);
					//insert here - DefaultTableModel.addRow(Vector)
					try {
						multiClient.sd_display.insertString(multiClient.sd_display.getLength(), chatName+"님이 입장하였습니다.\n", null);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}break;
				case Protocol.MESSAGE:{
					String chatName 	= st.nextToken();
					String msg 			= st.nextToken();
					String fontColor 	= st.nextToken();
					String fontType  	= st.nextToken();
					String fontSize  	= st.nextToken();
					String[] style = new String[3];
					style[0] = fontColor;
					style[1] = fontType;
					style[2] = fontSize;
					//읽어온 대화내용을 출력하기
					try {
						multiClient.sd_display.insertString(multiClient.sd_display.getLength(),"["+chatName+"]"+msg+"\n",null);
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					multiClient.jtp_display.setCaretPosition(multiClient.sd_display.getLength());
				}break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}








