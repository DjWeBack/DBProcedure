package com.ChatProject;

import java.io.Serializable;
import java.util.List;

public class Message<T> implements Serializable{
	   private int    type;      //메시지 타입
	   private List<T> request;   //클라이언트가 데이터를 담는 부분
	   private List<T> response;   //서버가 데이터를 담는 부분
	   
	   ///////////////////////메시지 타입////////////////////////////
	   public static final int MEMBER_LOGIN   = 0; //회원 로그인
	   public static final int MEMBER_JOIN      = 1; //회원 가입
	   public static final int MEMBER_MODIFY    = 2; //회원 수정
	   public static final int FRIEND_ALL      = 3; //친구 전체 리스트
	   public static final int FRIEND_INSERT   = 4; //친구 추가
	   public static final int FRIEND_DELETE   = 5; //친구 삭제
	   public static final int FRIEND_SEARCH   = 6; //친구 검색
	   public static final int CHAT_SEND      = 7; //채팅 전송
	   public static final int CHAT_LOAD      = 8; //채팅 내역 조회
	   ///////////////////////////////////////////////////////////
	   
	   public Message() {
	      this(0,null,null);
	   }
	   
	   public Message(int type, List<T> request, List<T> response) {
	      this.type = type;
	      this.request = request;
	      this.response = response;
	   }

	   public int getType() {
	      return type;
	   }

	   public void setType(int type) {
	      this.type = type;
	   }

	   public List<T> getRequest() {
	      return request;
	   }

	   public void setRequest(List<T> request) {
	      this.request = request;
	   }

	   public List<T> getResponse() {
	      return response;
	   }

	   public void setResponse(List<T> response) {
	      this.response = response;
	   }
	   
	   
	}