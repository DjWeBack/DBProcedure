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
//DAO(Data Access Object):DB������ �����ϴ� Ŭ������ ������.
//����? ���뼺�� ���̱� ���� Ŭ���� ������
//������ �������̿��� ���谡 �ְ� �� ���迡 ���������� ���� ���·� Ŭ���� ���踦 �ؾ�
//���� �ִ� ���� ���׿��� �޼ҵ带 ������ �� ����.
//--> ���յ��� ���� �ڵ带 �����ϴ� ���� �߿���.
//--> ���յ��� ���ƾ� �����׽�Ʈ�� �����ϰ� �����׽�Ʈ�� ������.
//--> ������Ʈ �������
//�м� ���� -> ����(�ڵ�) -> �׽�Ʈ -> �ý��� ���� -> ��
public class BoardDao {
	//�����
	//��ü���� -> DI(dependency injection)
	DBConnection		dbmgr = null;
	Connection 			con   = null;
	PreparedStatement 	pstmt = null;
	CallableStatement	cstmt = null;
	ResultSet			rs	  = null;
	//�Է�ó��
	public String getBoardIns(ArrayList<BoardVO> pbvo){
		List<BoardVO> boardlist = pbvo;
		String msg ="";
		try {
			//�ڹٿ��� �����ϴ� �������̽��� �� �޼ҵ� ȣ���� ���� ��ü���ԵǴ� ��쵵 ����.
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
	//����ó��

	//����ó��

	//�Խ��� ��ü ��ȸ
	public List<BoardVO> getBoardList(BoardVO pbvo){
		List<BoardVO> boardlist = new ArrayList<BoardVO>();
		StringBuilder sql = new StringBuilder();//StringBuffer
		sql.append("SELECT b_no, b_name,b_user,b_date,b_view,b_comm ");
		sql.append("from t_board");
		//DB������ ����Ŭ ������ �����ϴ� ���̹Ƿ� ����ó�� �ʼ���.
		try {
			//�ڹٿ��� �����ϴ� �������̽��� �� �޼ҵ� ȣ���� ���� ��ü���ԵǴ� ��쵵 ����.
			dbmgr = new DBConnection();
			con = dbmgr.getConnetion();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			//Ŀ���� �� �տ� �ִ�
			//System.out.println(rs.isFirst());
			//Ŀ���� �� �ڿ� �ִ�.
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





