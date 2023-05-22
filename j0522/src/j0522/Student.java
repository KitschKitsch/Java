package j0522;

public class Student {

	// 클래스변수
	static int count = 1000;

	// 인스턴스변수
	int stuNo; // 2023 + 0001
	String name;// <- this.name
	int kor;// <- this.kor
	int eng;// <- this.eng
	int math;// <- this.math
	int total;
	double avg;
	int rank;

	{// 인스턴스 초기화블럭: 생성자의 중복요소를 뽑아냄~!
		++count;
//		stuNo = "2023" + String.format("%04d", count);
		stuNo = count;// 1001, 1002, 1003,...
	}

	Student() {// 기본생성자
	}

	Student(String name, int kor, int eng, int math) {// 지역변수들
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total / 3.0;
	}

}
