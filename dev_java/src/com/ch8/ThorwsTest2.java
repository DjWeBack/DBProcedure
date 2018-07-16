package com.ch8;

public class ThorwsTest2 {
/*
 * 예외처리를 반드시 해야 되는 패키지가 있다.
 * java.net.Socket
 * javaj.io.PrintWriter
 * java.lang.Thread
 * 위의 경우 예외처리를 별도로 하지 않으면 에러 발생.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			throw new ClassNotFoundException();
			//thorw를 호출하면 예외를 강제로 발생시켜 주는데
			//예외를 강제로 일으켜서 시간을 벌어놓고 그 사이에 다른 처리를 할 수 있다.
			//예를 들면 오라클에서 트랜잭션 처리를 할 때.....
		}
		catch (ClassNotFoundException ce) {
			// TODO: handle exception
		System.out.println("클래스를 찾을 수 없습니다.");	
		}
		 catch (Exception e) {
			// TODO: handle exception
			 System.out.println("Exception : " +e.getMessage());
		}
	}

}
