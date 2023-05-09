package j0508_01;

public class Class0508_08 {

	public static void main(String[] args) {
		// num1 변수 10, num2 변수 3을 int로 선언 후, 나눈 값을 소수점 2자리까지 출력하시오.
		int num1 = 10;
		int num2 = 3;
		System.out.printf("%.2f \n", num1/(float)num2);
		
		
		// 변수 n1: 3.14, 변수 n2: 5, [ n1+n2 결과값: 8.14 ]를 출력하시오.
		float n1 = 3.14f;
		int n2 = 5;
		System.out.printf("[ n1+n2의 결과값: %.2f ]\n", n1+n2);
		
		
		// kor 100 , eng 100, math 99, [ 합계: , 평균: ]을 출력하시오. (평균은 소수점 2자리까지)
		int kor = 100, eng = 100, math = 99;
		int total = kor+eng+math;
		float avg = total/3f;
		System.out.printf("[ 합계: %d, 평균: %.2f ]\n", kor+eng+math, (float)(kor+eng+math)/3);
		System.out.printf("[ 합계: %d, 평균: %.2f ]\n", total, avg);
	}

}
