package j0516;

public class Student {

	// 변수
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

	// 메소드
	void sum() {
		total = kor + eng + math;
	}

	void average() {
		avg = total / 3.0;
	}

}
