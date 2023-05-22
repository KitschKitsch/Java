package j0522;

public class Car {

	String color;// = this.color
	String gearType;// = this.gearType
	int door;// = this.door

	Car() {// 기본생성자에 기본값 지정
			// this("white", "auto", 4);
		color = "white";
		gearType = "auto";
		door = 4;
	}

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	Car(Car c) {// 참조변수를 매개변수로 받는 생성자 (객체 복사시 사용)
		color = c.color;// 값만 복사
		gearType = c.gearType;
		door = c.door;
	}
}
