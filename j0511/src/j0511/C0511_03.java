package j0511;

public class C0511_03 {

	public static void main(String[] args) {
		// 1씩 증가하는 값들의 합이 100을 넘지 않을 때 값 구하기
		int i=0, sum=0;
		
		// while문
		while (true) {
			if (sum >= 100) break; // while문(for문)을 빠져나오는 break
			i++; // i 초기값이 0부터 시작하므로, 위아래 순서가 중요함!
			sum = sum + i; // 1-1, 2-3, 3-6, 4-10, 5-15,,,
			System.out.print("i: " +i +"\t");
			System.out.println("sum: " +sum);
		}
		System.out.println("i의 결과값: " +i);
		System.out.println("sum의 결과값: " +sum);
		
//		// for문
//		for (i=0;;) {
//			if (sum >= 100) break;
//			i++;
//			sum = sum + i; // 1-1, 2-3, 3-6, 4-10, 5-15,,,
//			System.out.print("i: " +i +"\t");
//			System.out.println("sum: " +sum);
//		}
//		System.out.println("i의 결과값: " +i);
//		System.out.println("sum의 결과값: " +sum);
	}

}
