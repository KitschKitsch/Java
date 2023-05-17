package j0511;

public class Class0511_11 {

	public static void main(String[] args) {
		int num = 5;
		int num2 = num;
		num2 = 10;
		System.out.println(num);
		System.out.println(num2);
		System.out.println("--------------------");
		
		// 배열복사할 때 데이터값을 그냥 넣으면 XXX!
		// 배열복사를 사용해야함..!
		int[] input = new int[3];
		input[0] = 5;
		
		int[] input2 = input; // 값이 아니라 주소값을 복사해온 것!
		System.out.println(input2[0]);
		input2[0] = 20; // 이 주소에 20 넣어야지~
		System.out.println(input2[0]);
		System.out.println(input[0]); // 5..5라매...!!
	}

}