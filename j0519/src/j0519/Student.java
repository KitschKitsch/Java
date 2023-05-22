package j0519;

public class Student {
	// 기본생성자 = 매개변수가 없는 생성자. 자동생성
	Student() {
	}

	// 생성자 오버로딩(이름중복)도 지원함
	Student(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
		total = k + e + m;
		avg = total / 3.0;
	}

	// 인스턴스 변수
	String name;
	int kor;
	int eng;
	int math;
	int total; // DB에 넣을때 컬럼형태로 편하게 쓰려고 이중배열X
	double avg;
	int rank;

	// 클래스 변수
	static String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

	// 인스턴스 메소드
	void sum() {
		total = kor + eng + math;
	}

	void average() {
		avg = total / 3.0;
	}

}
