package j0523;

import stuProject.Student;

public class StuDeck {

	Student s = new Student("홍길동", 100, 100, 100);// 다른 패키지의 클래스 객체선언

	void stuPrint() {
		s.kor = 50;// public이라서 변경 가능!
		System.out.println(s.kor);
	}

}
