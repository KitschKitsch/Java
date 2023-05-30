package C04_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C0530_09 {

	public static void main(String[] args) {

		// Map 메소드가 있는 객체선언
		ColClass c = new ColClass();
		Map<String, Object> map = new HashMap<>();// 딱맞는 공간 만들고
		map = c.execute();// 공간에 대입하기
		System.out.println(map.get("nowPage"));
		System.out.println(map.get("startRow"));
		System.out.println(map.get("endRow"));
		System.out.println("----------");

		// int 메소드가 있는 객체선언
		ColClass2 c2 = new ColClass2();
		int nowPage = 0;// 딱맞는 공간 만들고
		nowPage = c2.execute2();// 공간에 대입하기
		System.out.println(nowPage);
		System.out.println("----------");

		// ArrayList 메소드가 있는 객체선언
		ColClass3 c3 = new ColClass3();
		ArrayList<Student> list = new ArrayList<>();// 딱맞는 공간 만들고
		list = c3.execute3();// 공간에 대입하기
		System.out.println(list.get(0).getName());
		System.out.println("----------");

		// Map 메소드가 있는 객체선언_2
		ColClass4 c4 = new ColClass4();
		Map<String, Object> map2 = new HashMap<>();// 딱맞는 공간 만들고
		map2 = c4.execute4();// 공간에 대입하기
		System.out.println(map2.get("nowPage"));// "키"는 항상 쌍따옴표로! (String이 검색 용이하니까)
		System.out.println(map2.get("startRow"));
		System.out.println(map2.get("endRow"));
		System.out.println("----------");

	}// main

}
