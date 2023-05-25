package stuProject2;

import java.util.ArrayList;
import java.util.Scanner;

public class StuProcess {

	// 1)변수선언
	Scanner scan = new Scanner(System.in);
	String name = "";// 변수재정의해줌
	int kor = 0, eng = 0, math = 0;

	// 학생성적입력 메소드
	void stuInput(ArrayList<Student> list) {
		while (true) {
			System.out.println("학생이름을 입력하세요.(0:이전)>> ");
			name = scan.next();
			if (name.equals("0"))
				break;
			System.out.println("국어점수>> ");
			kor = scan.nextInt();
			System.out.println("영어점수>> ");
			eng = scan.nextInt();
			System.out.println("수학점수>> ");
			math = scan.nextInt();

			// 학생성적입력 메소드 -> 합계,평균까지 한번에!
			list.add(new Student(name, kor, eng, math));

			// list.size() = 1
			// list.get(list.size() - 1).getStuNo();// 0번자리에 있는 학생
			System.out.printf("%s(%d)", name, list.get(list.size() - 1).getStuNo());
			System.out.print("(이)가 입력되었습니다.\n");
			System.out.println();

			break;
		} // while
	}// stuInput

}
