package stuProject2;

public class Student {

	{// 1)인스턴스 초기화블록
		count++;
		stuNo = count;
	}

	Student() {
	}// 2)기본생성자

	Student(String name, int kor, int eng, int math) {// 2)매개변수 생성자
		this.name = name;// 메소드, 생성자는 변수 위아래 상관없음!
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total / 3.0;
	}

	// 3)클래스변수&인스턴스변수
	static int count = 1000;
	static String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

	private int stuNo;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;

	// 4)get&set
	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
