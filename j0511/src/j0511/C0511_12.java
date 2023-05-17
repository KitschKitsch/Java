package j0511;

public class C0511_12 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 0;
		// a와 b의 값을 서로 바꿔서 저장하시오.
		c = a;
		a = b;
		b = c;
		System.out.println("a: 10 => " +a);
		System.out.println("b: 20 => " +b);
	}

}