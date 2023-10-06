package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
import com.java.www.dto.Board;

public class BReadService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		// 객체선언 후 조회 + 조회수 증가 메소드 호출
		BoardDao bdao = new BoardDao();
		Board board = bdao.selectOne(bno);
		bdao.updateHit(bno); 
		
		// "board" 이름으로 담기
		request.setAttribute("board", board);

	}

}
