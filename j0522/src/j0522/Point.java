package j0522;

public class Point {
	int x;// 인스턴스변수. = this.x
	int y;// = this.y

	Point() {// 기본생성자
		this(0, 0);// 다른생성자호출
	}

	Point(int x, int y) {// 매개변수생성자
		this.x = x;// 인스턴스변수(this.x), 지역변수(x)
		this.y = y;
	}
}
