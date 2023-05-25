package C05_Interface;

public class C0525_05 {

	public static void main(String[] args) {

		A a = new A();
		// B b = new B();
		a.methodA(new B());// A클래스 안건드리고 main만 바꾸면됨!
		a.methodA(new SuperB());
		a.methodA(new PlusB());

	}

}
