package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
import com.java.www.dto.Board;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BEditService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		// 파일 받았응께 경로+사이즈
		String uploadPath = "c:/upload";
		int size = 10*1024*1024;
		
		// 멀티파트 쓸껑께 트라이-캐치
		try {
			MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());
			
			int bno = Integer.parseInt(multi.getParameter("bno"));
			String btitle = multi.getParameter("btitle");
			String bcontent = multi.getParameter("bcontent");
			String oldfile = multi.getParameter("oldfile");
			String bfile = multi.getFilesystemName("bfile"); // 새 파일만 특.별.히!
			
			System.out.println("헌놈(oldfile): " + oldfile);
			System.out.println("새놈(bfile): " + bfile);
			
			// 근데 새로운 파일 등록 안되었다면,
			if (bfile == null) {
				// 그냥 예전파일 등록하기
				bfile = oldfile;
			}
			
			BoardDao bdao = new BoardDao();
			int result = bdao.updateOne(bno, btitle, bcontent, bfile);
			
			request.setAttribute("result", result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
