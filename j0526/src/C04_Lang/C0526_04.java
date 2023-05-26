package C04_Lang;

public class C0526_04 {

	public static void main(String[] args) {

		Person p1 = new Person(8801011234567L);
		Person p2 = new Person(9902021234567L);
		Person p3 = new Person(8801011234567L);

		Person p4 = new Person(p1);// 공간분리, 객체복사(깊은 복사)
		Person p5 = p3;// 객체의 주소를 복사(얉은 복사)
		System.out.println(p4.id);

		System.out.println(p1);
		System.out.println(p3);

		if (p1.equals(p3)) {// 서로 다른 주소 가짐;;;
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}

}
