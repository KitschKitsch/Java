package j0531;

import java.util.ArrayList;
import java.util.List;

public class DataClass {

	// 두 정수를 더하는 메소드
	int numAdd(int num1, int num2) {
		System.out.println("더하기: ");
		int sum = num1 + num2;
		System.out.println(sum);
		return sum;// 반환결과로 저기서 작업할꺼야? 그럼 리턴타입도바꾸고 return해주께!!!
	}// numAdd

	// 성적을 받아 학생객체를 생성하는 메소드
	Student stuAdd(int kor, int eng, int math) {
		System.out.println("학생성적추가");
		int stuNo = 1;
		String name = "홍길동";
		Student s = new Student(stuNo, name, kor, eng, math);
		return s;// 리턴타입도 바꾸고 return 해주지!

	}

	// (컬랙션)리스트 객체를 넘겨주는 메소드
	List<Student> stuList() {
		List<Student> list = new ArrayList<>();
		// ArrayList<Student> list = new ArrayList<>();// 상관없음!
		list.add(new Student(1, "홍길동", 100, 100, 100));
		list.add(new Student(2, "이순신", 90, 90, 90));
		return list;// 리턴타입 바꾸고 return!
	}

}
