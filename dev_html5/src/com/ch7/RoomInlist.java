package com.ch7;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class RoomInlist {
	public RoomInlist() {
		nameListPrint();
	}
 public List<String> getRoomInList(){
//	 nameList는 List타입입니다.
//	 nameList의 구현체 클래스는 ArrayList가 선택되었음.
//	 아래와 같이 인스턴스화를 진행 하였고 컴파일 문제가 발생되지 않았다는건 합법임을 뜻함.
//	 그렇다면 List의 추상매소드인 add(E e):boolean과 add(int index, E e):void
//	 는 ArrayList클래스가 구현했다는 것임.
	 List<String> nameList = new ArrayList<String>();
//	 nameList = new Vector<String>();
	boolean isOK = nameList.add("유재덕");
	nameList.add(1,"박의");
//  대화방 입장시 if문을 추가하여 인덱스 값을 i++후위 연산자를 사용 해서 어레이리스트에 순차적으로 쌓고 대화방안에 인원 출력.
//	스트링 안에 들어가는 이름은 대화명 또는 이름으로 설정하여 sql문 을 통해 이름을 정해주면 됨.
	isOK = nameList.add("김희진");
		 return nameList;
 }
 public void nameListPrint() {
	System.out.println(getRoomInList().get(0)); 
	System.out.println(getRoomInList().get(1));
	System.out.println(getRoomInList().get(2));
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RoomInlist();
	}

}
