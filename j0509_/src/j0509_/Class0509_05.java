package j0509_;

public class Class0509_05 {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		
		int result = (num2*num3)+num1;
		System.out.println(result);
		
		int result2 = ++num3; // 5 + 1 = 6 *먼저 num3값을 1증가시키고 result2에 대입시켜줘~
		System.out.println(result2);
		
		int result3 = num2++; // *먼저 num2값을 result3에 대입하고 1증가시켜줘~
		System.out.println(result3);
		System.out.println("num2: "+num2);
	}

}
