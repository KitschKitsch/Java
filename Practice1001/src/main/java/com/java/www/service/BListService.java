package com.java.www.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
import com.java.www.dto.Board;

public class BListService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		// 객체선언 후 메소드 호출하기
		BoardDao bdao = new BoardDao();
		ArrayList<Board> list = bdao.selectAll();
		
		// "list"이름으로 list 담기
		request.setAttribute("list", list);
		

	}

}
