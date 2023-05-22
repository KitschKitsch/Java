package j0522;

public class Triangle extends Shape {// Shape 클래스 상속받음
	Point[] p;// 인스턴스변수: 객체선언후 참조변수명.변수명

	Triangle(Point[] p) {// 매개변수생성자
		this.p = p;
	}

	Triangle(Point p1, Point p2, Point p3) {// 매개변수생성자
		p = new Point[] { p1, p2, p3 };
		// Point[] p = { p1, p2, p3 };
	}

}
