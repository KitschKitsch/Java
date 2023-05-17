package j0516;

public class C0516_04 {

	public static void main(String[] args) {
		// 객체선언: 클래스명 참조변수명 = new 클래스명();
		// 클래스 변수&메소드 사용: 객체선언 후! 참조변수명.변수or메소드 이름
		Student s1 = new Student();// 객체선언
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 100;
		s1.math = 100;
		s1.sum();
		s1.average();
		System.out.println(s1.total);
		System.out.println(s1.avg);

		Student s2 = new Student();
		s2.name = "유관순";
		s2.kor = 99;
		s2.eng = 99;
		s2.math = 90;
		s2.sum();
		s2.average();
		System.out.println(s2.total);
		System.out.println(s2.avg);
	}

}
