package com.java.www.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BWriteService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		// 파일을 받기 때문에 업로드 위치와 크기 정해주기!
		String uploadPath = "c:/upload";
		int size = 10*1024*1024;
		
		// 멀티파트 리퀘스트 쓰기 때문에 트라이-캐치 문!
		try {
			MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());

			String id = multi.getParameter("id");
			String btitle = multi.getParameter("btitle");
			String bcontent = multi.getParameter("bcontent");
			String bfile = multi.getFilesystemName("bfile"); // 파일은 특.별.해!
			
			// 객체선언 후 메소드 호출
			BoardDao bdao = new BoardDao();
			int result = bdao.insertOne(id, btitle, bcontent, bfile); 
			
			request.setAttribute("result", result);
		
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
