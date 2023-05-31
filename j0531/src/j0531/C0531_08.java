package j0531;

import java.util.ArrayList;
import java.util.List;

public class C0531_08 {

	public static void main(String[] args) {

		// 객체선언
		DataClass d = new DataClass();

		int num1 = 10;
		int num2 = 5;
		// 두 정수를 더하는 메소드호출
		int sum = d.numAdd(num1, num2);// 반환결과 받아서 활용할꺼여
		System.out.println(sum * 2);
		System.out.println("----------");

		int kor = 100;
		int eng = 100;
		int math = 99;
		// 성적을 받아 학생객체를 생성하는 메소드호출
		Student s = d.stuAdd(kor, eng, math);// 받아서 활용(저장)!
		System.out.println(s.getTotal());
		System.out.println("----------");

		// (컬랙션)리스트 객체를 넘겨주는 메소드호출
		List<Student> list = d.stuList();// 잘쓰겠습니당~
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d %s \n", list.get(i).getStuNo(), list.get(i).getName());
		}
		System.out.println("----------");

	}

}
