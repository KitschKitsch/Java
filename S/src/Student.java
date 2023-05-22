
public class Student {
	// 클래스변수
	static String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	static int count = 1000;

	// 인스턴스변수
	int stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

	{// 초기화블록
		count++;
		stuNo = count;
	}

	Student() {// 기본생성자
	}

	Student(String name, int kor, int eng, int math) {// 매개변수생성자
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total / 3.0;
	}

}
