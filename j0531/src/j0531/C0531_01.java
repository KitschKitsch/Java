package j0531;

import java.util.ArrayList;
import java.util.List;

public class C0531_01 {

	public static void main(String[] args) {

		// 다형성: 조상(부모)의 참조변수로 자손의 객체를 다룸
		List list = new ArrayList<>();// ArrayList의 조상 List!
		list.add("aaa"); // - 사실은 Object 객체! 기본형+String은 형변환 안해도 값나옴!
		list.add("bbb");
		list.add("ccc");
		list.add("aaa");// 순서O 중복O

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("--------------------");

		// 강제형변환 사용
		List list2 = new ArrayList<>();
		// Student s1 = new Student(1,"홍길동",100,100,99);
		// list2.add(s1);
		list2.add(new Student(1, "홍길동", 100, 100, 99));
		list2.add(new Student(2, "유관순", 99, 99, 98));

		System.out.println(list2.get(1));// 기본형+String이 아니고, Object 객체라 주소값이 나와열😮
		// Student s = (Student) list2.get(1);// 형변환해줘야
		// System.out.println(s.getName());// 값나옴!
		System.out.println(((Student) list2.get(1)).getName());// 형변환해줘야 값나옴!

		System.out.println("--------------------");

		// 제너릭스 사용
		List<Student> list3 = new ArrayList<>();// <제너릭>쓰면 형변환 필요없음!
		list3.add(new Student(1, "홍길동", 100, 100, 99));
		list3.add(new Student(2, "유관순", 99, 99, 98));

		// Student ss = list3.get(0);// 형변환안해도
		// System.out.println(ss.getName());// 값나옴!
		System.out.println(list3.get(0).getName());// 형변환안해도 값나옴!

	}

}
