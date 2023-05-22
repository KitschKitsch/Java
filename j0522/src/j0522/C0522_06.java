package j0522;

public class C0522_06 {

	public static void main(String[] args) {
		// 객체선언 - 기본생성자
		Car c1 = new Car();// 기본생성자에 이미 기본값 있음!
		System.out.println(c1.color);
		System.out.println(c1.gearType);
		System.out.println(c1.door);

		System.out.println();

		// 객체선언 - 매개변수생성자
		Car c2 = new Car("red", "auto", 5);
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);

		System.out.println();

		// 객체선언 - 참조변수를 매개변수로 받는 생성자 (객체 복사시 사용)
		Car c3 = new Car(c2);
		c3.color = "blue";
		c3.gearType = "stick";
		c3.door = 3;
		System.out.print("c2: " + c2.color);
		System.out.println("\t c3: " + c3.color);
		System.out.print("c2: " + c2.gearType);
		System.out.println(" c3: " + c3.gearType);
		System.out.print("c2:" + c3.door);
		System.out.println("\t c3:" + c3.door);

		Car c4 = new Car(c3);
		c4.color = "yellow";
		c4.gearType = "auto";
		c4.door = 4;

//		// 참조변수만 선언
//		Car c3 = null;
//		// 복사..?
//		c3 = c2;// 정체성에 혼란이 와버린...값이 동시에 변함!
//		c3.color = "blue";
//		
//		System.out.println("c2: " + c2.color);
//		System.out.println("c3: " + c3.color);

	}

}
