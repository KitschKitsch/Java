package j0516;

public class C0516_03 {

	public static void main(String[] args) {
		// 객체선언: 클래스명 참조변수명 = new 클래스명();
		Tv t = new Tv();
		t.color = "white";
		System.out.println(t.color);
		
		// 참조변수명만 다르면 객체는 몇개든 만들 수 있음!
		Tv t2 = new Tv();
		t2.color = "red";
		System.out.println(t2.color);
	}

}
