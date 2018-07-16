package com.ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeptManager {
	//순서가 없다(랜덤), 키값 중복불가, 값은 중복가능
	//List비해서 키값으로 값을 추측
	//Flex같은 UI솔루션에서 지원하는 클래스
	HashMap 	hMap1 = new HashMap();//단일스레드안전-동기화처리안됨-속도빠름
	Hashtable 	hMap2 = new Hashtable();//멀티스레드안전 -동기화처리
	//선언부에 상위클래스나 인터페이스를 사용하면 생성부에 여러가지 다른 클래스를 선택할 수 있다.
	Map         hMap3 = hMap1;
	Map         hMap4 = hMap2;
	//완결편
	//key값에 String으로 한 이유는 
	Map<String,Object> hMap5 = new HashMap<String,Object>();
	//숫자타입
	Map<Integer,Object> hMap6 = new HashMap<Integer,Object>();
	//true,false
	Map<Boolean,Object> hMap7 = new HashMap<Boolean,Object>();
	List<Map<String,Object>> deptList =
			new ArrayList<Map<String,Object>>();
	public void setMap() {
		hMap5.put("deptno", 10);
		hMap5.put("dname", "ACCOUNTING");
		hMap5.put("loc", "NEW YORK");
		deptList.add(hMap5);
		hMap5 = new HashMap<String,Object>();
		hMap5.put("deptno", 20);
		hMap5.put("dname", "RESEARCH");
		hMap5.put("loc", "DALLAS");
		deptList.add(hMap5);
		hMap5 = new HashMap<String,Object>();
		hMap5.put("deptno", 30);
		hMap5.put("dname", "SALES");
		hMap5.put("loc", "CHICAGO");
		deptList.add(hMap5);
		System.out.println(hMap5.get("deptno"));
		System.out.println(hMap5.get("dname"));
		//key값에 대한 대소문자를 구분하므로 담을 때 사용한 키값을 사용해야 되요.꼬오옥~~~~
		//myBatis(ORM솔루션)-30%줄어듬.- 왜? 담는걸 생략해도 되니까...
		//인스턴스화를 세번 했으므로 이것을 ArrayList에 담아봐요.
		//왜? 맨 마지막 주소번지만 기억을 하니깐....오버라이트가 일어나지 않도록 하기 위해서...
		//ArrayList도 주소번지 즉 객체를 담을 수 있는 자료구조 이므로 가능하겠지요.
		//대신 값을 꺼낼 때 주소번지를 두 번 접근해야 값을 출력해 볼 수가 있어요.
		//한 번은 ArrayList 두번째는 Map 주소번지 이렇게 두 번을 접근해야
		//그 안에 담긴 값을 꺼낼 수 있어요.
		//System.out.println(hMap5.get("loc"));
		for(int i=0;i<deptList.size();i++) {
			System.out.println(deptList.get(i));//Map-> HashMap
			Object[] keys = deptList.get(i).keySet().toArray();
			Set deptSet = deptList.get(i).keySet();
			keys = deptSet.toArray();
			System.out.println("keys["+i+"]="+keys[i]);
		}
	}
	public static void main(String[] args) {
		DeptManager dm = new DeptManager();
		dm.setMap();
		String str = "{"+"deptno="+10+",dname="+"ACCOUNTING"+",loc="+"NEW YORK}";
		System.out.println(str);
	}

}





