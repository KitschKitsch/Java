package com.java.www.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.service.BDeleteService;
import com.java.www.service.BEditService;
import com.java.www.service.BListService;
import com.java.www.service.BReadService;
import com.java.www.service.BService;
import com.java.www.service.BWriteService;

@WebServlet("*.do") // .do로 끝나면 모두 여길 거쳐간닷!
public class FController extends HttpServlet {

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction으로 받았습니당");
		request.setCharacterEncoding("utf-8"); // doPost로 들어오면 인코딩해야제
		String page = "";
		BService bservice = null;
		
		String uri = request.getRequestURI(); // /프로젝트명/파일명
		String contextPath = request.getContextPath(); // /프로젝트명
		String fileName = uri.substring(contextPath.length()); // /프로젝트명/파일명 - 프로젝트명 = /파일명
		System.out.println("uri: " + uri);
		System.out.println("contextPath: " + contextPath);
		System.out.println("fileName: " + fileName);
		
		if (fileName.equals("/main.do")) {
			page = "main.jsp"; 
		} else if (fileName.equals("/list.do")) {
			bservice = new BListService();
			bservice.execute(request, response);
			page = "list.jsp";
		} else if (fileName.equals("/read.do")) {
			bservice = new BReadService();
			bservice.execute(request, response);
			page = "read.jsp";
		} else if (fileName.equals("/write.do")) {
			page = "write.jsp";
		} else if (fileName.equals("/doWrite.do")) {
			bservice = new BWriteService();
			bservice.execute(request, response);
			page = "doWrite.jsp";
		} else if (fileName.equals("/edit.do")) {
			bservice = new BReadService();
			bservice.execute(request, response);
			page = "edit.jsp";
		} else if (fileName.equals("/doEdit.do")) {
			bservice = new BEditService();
			bservice.execute(request, response);
			page = "doEdit.jsp";
		} else if(fileName.equals("/delete.do")) {
			bservice = new BDeleteService();
			bservice.execute(request, response);
			page = "doDelete.jsp";
		}
		
		// 포워딩 request 정보 전송!
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet으로 들어왔고");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost로 들어왔고");
		doAction(request, response);
	}

}
