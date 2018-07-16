package com.oracle.jdbc;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.util.DBConnectionMgr;

public class BoardManager extends JFrame implements ActionListener{
	//선언부
	//DefaultTableModel 헤더 구성하기에 필요한 변수 선언.
	String cols[] = {"글번호","제목","작성자","작성일자","조회수"};
	//DefaultTableModel에 출력할 데이터 변수 선언
	String data[][] = new String[0][5];
	DefaultTableModel dtm_board = new DefaultTableModel(data,cols);
	JTable jtb_board = new JTable(dtm_board);
	//스크롤바 생성.
	JScrollPane jsp_board = new JScrollPane(jtb_board,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
			,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JButton jbtn_select = new JButton("조회");
	JButton jbtn_insert = new JButton("입력");
	JButton jbtn_delete = new JButton("삭제");
	DBConnectionMgr dbmgr = null;
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	//생성자
	public BoardManager() {


		initDisplay();
	}
	//화면처리부
	public void initDisplay() {

		this.setLayout(new GridLayout(1,3,2,2));
		this.add("North", jbtn_select);
		this.add("North", jbtn_insert);
		this.add("North", jbtn_delete);
		this.add("Center",jsp_board);
		this.setSize(800, 500);
		this.setTitle("게시판");
		this.setVisible(true);
	}
	//메인메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		BoardManager bm = new BoardManager();
		//		bm.initDisplay();
		new BoardManager();
	}
	public int boardInsert(HashMap<String, Object> rMap) {
		int result = 0;
		return result;
	}
	public void boardUpdate() {}
	public int boardDelete(int b_no) {
		return b_no;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = new Object();
		if(jbtn_select==e.getSource()) {
			dbmgr = DBConnectionMgr.getInstance();
			StringBuilder sql = new StringBuilder();
			sql.append("select b_no, b_title, b_writer, b_date, b_hit from jdbc_board");
			try {
				con = dbmgr.getConnection();
				pstmt = con.prepareStatement(sql.toString());
				rs = pstmt.executeQuery();
				List<HashMap<String,Object>> boardList = new ArrayList<HashMap<String,Object>>();
				while(rs.next()) {
					HashMap<String, Object> rMap = new HashMap<String, Object>();
					rMap.put("b_no", rs.getInt("b_no"));
					rMap.put("b_title", rs.getString("b_title"));
					rMap.put("b_writer", rs.getString("b_writer"));
					rMap.put("b_date", rs.getString("b_date"));
					rMap.put("b_hit", rs.getInt("b_hit"));
					boardList.add(rMap);
					System.out.println(boardList.size());
				}
			}
			catch (Exception e2) {
				// TODO: handle exception

			}
		}
		if(obj==jbtn_insert) {
			int result = 0;
			HashMap<String, Object> pMap = new HashMap<String,Object>();
			pMap.put("b_title", "글등록 연습");
			pMap.put("b_content", "테스트");
			pMap.put("b_writer", "작성자1");
			result = boardInsert(pMap);
			if(result==1) {
				JOptionPane.showMessageDialog(this, "등록성공", "INFO", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(this, "등록실패", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
		if(obj==jbtn_delete) {
			int result = 0;
			int b_no=2;
			result = boardDelete(b_no);
			if(result==1) {
				JOptionPane.showMessageDialog(this, "삭제성공", "INFO", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(this, "삭제실패", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}

	}

}



