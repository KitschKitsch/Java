package j0517;

public class C0517_07 {

	public static void main(String[] args) {

		// static 메소드는 객체선언 없이 사용 가능!

		int[] num = new int[2];

		int a = 10;
		int b = 5;

		caculate(num, a, b);

		System.out.println("합계: " + num[0]);
		System.out.println("평균: " + num[1]);

	}

	static void caculate(int[] num, int a, int b) {// num 주소값 같이보냄
		// 두 수의 합, 평균
		num[0] = a + b;
		num[1] = (a + b) / 2;
		// 주소값 받아오면 return 피료없어!
		// return total, avg;// return은 무.족.권 한가지 값만..!
	}

}