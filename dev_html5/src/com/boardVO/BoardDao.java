package com.boardVO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.util.DBConnectionMgr;
import com.vo.EmpVO;
import com.oracle.jdbc.DBConnection;
//DAO(Data Access Object):DB연동을 전담하는 클래스로 설계함.
//이유? 재사용성을 높이기 위한 클래스 설계임
//업무와 업무사이에는 관계가 있고 그 관계에 종속적이지 않은 상태로 클래스 설계를 해야
//관련 있는 업무 사잉에서 메소드를 공유할 수 있음.
//--> 결합도가 낮은 코드를 전개하는 것이 중요함.
//--> 결합도가 낮아야 단위테스트가 가능하고 통합테스트가 가능함.
//--> 프로젝트 진행과정
//분석 설계 -> 개발(코딩) -> 테스트 -> 시스템 이행 -> 끝
public class BoardDao {
	//선언부
	//객체주입 -> DI(dependency injection)
	DBConnection		dbmgr = null;
	Connection 			con   = null;
	PreparedStatement 	pstmt = null;
	CallableStatement	cstmt = null;
	ResultSet			rs	  = null;
	//입력처리
	public String getBoardIns(ArrayList<BoardVO> pbvo){
		List<BoardVO> boardlist = pbvo;
		String msg ="";
		try {
			//자바에서 제공하는 인터페이스들 중 메소드 호출을 통해 객체주입되는 경우도 많음.
			dbmgr = new DBConnection();
			con = dbmgr.getConnetion();
			cstmt = con.prepareCall("call proc_boardadd(?,?,?,?)");
			cstmt.setString(1,boardlist.get(0).b_name);
			cstmt.setString(2,boardlist.get(0).b_user);
			cstmt.setString(3,boardlist.get(0).b_comm);
			cstmt.registerOutParameter(4, java.sql.Types.VARCHAR);
			cstmt.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	//수정처리

	//삭제처리

	//게시판 전체 조회
	public List<BoardVO> getBoardList(BoardVO pbvo){
		List<BoardVO> boardlist = new ArrayList<BoardVO>();
		StringBuilder sql = new StringBuilder();//StringBuffer
		sql.append("SELECT b_no, b_name,b_user,b_date,b_view,b_comm ");
		sql.append("from t_board");
		//DB연동은 오라클 서버에 접속하는 것이므로 예외처리 필수임.
		try {
			//자바에서 제공하는 인터페이스들 중 메소드 호출을 통해 객체주입되는 경우도 많음.
			dbmgr = new DBConnection();
			con = dbmgr.getConnetion();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			//커서가 맨 앞에 있다
			//System.out.println(rs.isFirst());
			//커서가 맨 뒤에 있다.
			//System.out.println(rs.isLast());
			BoardVO bvo = null;
			while(rs.next()) {
				//while(rs.previous()) {	
				//while(rs.absolute(4)) {
				bvo = new BoardVO();
				bvo.setB_no(rs.getInt("b_no"));
				bvo.setB_name(rs.getString("b_name"));
				bvo.setB_user(rs.getString("b_user"));
				bvo.setB_date(rs.getString("b_date"));
				bvo.setB_view(rs.getInt("b_view"));
				bvo.setB_comm(rs.getString("b_comm"));
				boardlist.add(bvo);
			}
			//		} catch (SQLException se) {
			//			System.out.println("[[query]]"+se.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardlist;
	}
}





