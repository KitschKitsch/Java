package j0508_01;

public class Class0508_05 {

	public static void main(String[] args) {
		// 오버플로우
		// 21|4748|3647
		int num = 2147483647;
		System.out.println(num+1);
		
		int num1 = 1000000;
		int num2 = 2000000;
		System.out.println(num1*num2); // 2|0000|0000|0000
		
		int num3 = -2147483648;
		System.out.println(num3-1);
	}

}
