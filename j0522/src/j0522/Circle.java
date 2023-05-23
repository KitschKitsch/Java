package j0522;

public class Circle extends Shape {// Shape 클래스 상속받음..!

	// 다른 클래스 사용
	Point center; // 참조변수만 선언(new X = 공간 X). 주소만 있음
	int r;// 인스턴스변수: 객체선언후 참조변수명.변수명

	Circle() {// 기본생성자: 클래스명일치, void X
		this(new Point(0, 0), 100);// 다른생성자호출
	}

	Circle(Point center, int r) {// 매개변수생성자
		this.center = center;// 인스턴스변수에대입
		this.r = r;
	}

}
