package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BService { // 유지보수 용이하게 중간에 인터페이스 거치기
	
	// 인터페이스의 기본 접근권한은 public !!!
	void execute(HttpServletRequest request, HttpServletResponse response);

}
