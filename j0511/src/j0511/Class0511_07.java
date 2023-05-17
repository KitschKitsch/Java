package j0511;

public class Class0511_07 {

	public static void main(String[] args) {
		// int 배열
		int[] num = new int[5];
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		num[4]=5;
		
		for (int i=0; i<num.length; i++) { // 0~4. Index Out Of Bounds 에러 조심!
			System.out.println(num[i]);
		}
		
		
		// 배열 100개를 만들고 1~100까지 숫자를 입력
		int[] num2 = new int[100];
		for (int i=0; i<100; i++) {
			num2[i] = i+1;
			System.out.println(num2[i]);
		}

		
		// 10개의 배열을 만들고 랜덤숫자 1~10까지 출력하시오.
		int[] num3 = new int[10];
		for (int i=0; i<10; i++) {
			num3[i] = (int)(Math.random()*10)+1;
			System.out.println(num3[i]);
		}
	}

}
