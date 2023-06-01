
public class Student {

	// 1)변수선언
	private int stuNo;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	private String createDate;
	private String updateDate;

	// 2)생성자
	Student() {// 기본생성자
	}

	Student(int stuNo, String name, int kor, int eng, int math, String CreateDate) {
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total / 3.0;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	
	
}// class
