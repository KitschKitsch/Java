package C04_Lang;

public class Person {

	long id;// 주민번호 880101-1234567 13자리 => Long

	Person() {// 기본생성자
	}

	Person(long id) {// 매개변수 생성자
		this.id = id;
	}

	Person(Person p) {// 객체복사 메소드
		this.id = p.id;// 매개변수 '값'을 복사
	}

	@Override
	public boolean equals(Object obj) {
		boolean chk = false;
		Person p = (Person) obj;// 사실 obj엔 id가 없어서!
		if (id == (p.id)) {
			chk = true;
		}
		return chk;
	}

	@Override
	public String toString() {// 객체만 찍어도 주소값 말고 내용 나옴!
		String str = "주민번호: " + id;
		return str;
	}

}
