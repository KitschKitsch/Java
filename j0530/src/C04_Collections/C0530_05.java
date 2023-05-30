package C04_Collections;

import java.util.ArrayList;

public class C0530_05 {

	public static void main(String[] args) {
		// list: 객체들의 집합. 데이터 이동 및 읽기, 저장용도로 사용
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add("abc");// 순서O, 중복O
		list.add("bbb");
		list.add("aaa");
		list.add("ccc");
		list.add(3);// Integer로 자동 형변환

		for (int i = 0; i < list.size(); i++) {
			System.out.println("list: " + list.get(i));
		}

//		// 입력
//		ArrayList<Student> list2 = new ArrayList<Student>();// 지네릭스 쓰면 특정클래스만 입력가능
//		list2.add(new Student(1, "홍길동", 100, 100, 99));
//		list2.add(new Student(2, "유관순", 90, 90, 99));
//		list2.add(new Student(3, "이순신", 80, 80, 87));
//		list2.add(new Student(3, "이순신", 80, 80, 87));// 중복가능
//		// list2.add(2);
//
//		// 출력
//		for (int i = 0; i < list2.size(); i++) {
//			System.out.println(list2.get(i));// 주소값만 나옴..!
//		}
//
//		for (int i = 0; i < list2.size(); i++) {
//			Student s = list2.get(i);// 지네릭스 안쓰면 형변환 필요!!!
//			System.out.printf("%d  %s  %d  %d  %d  %d  %.2f \n", s.getStuNo(), s.getName(), s.getKor(), s.getEng(),
//					s.getMath(), s.getTotal(), s.getAvg());
//		}
		
	}// main

}
