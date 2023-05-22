package j0522;

public class Data {

	Data() {
		// 같은 클래스 내 다른 생성자 호출
		this(1, 1);
//		num1 = 1;
//		num2 = 1;
//		data1 = num1 + num2;
//		data2 = num1 - num2;
//		data3 = num1 * num2;
//		data4 = num1 / num2;
	}

	// 매개변수를 받는 다른 생성자 만들기!
	Data(int num1, int num2) {
		this.num1 = num1;// this.num1: 클래스내인스턴스변수
		this.num2 = num2;// this.num2: 클래스내인스턴스변수
		data1 = num1 + num2;
		data2 = num1 - num2;
		data3 = num1 * num2;
		data4 = num1 / num2;
	}

	int num1;// 첫번째 입력받을 숫자
	int num2;// 두번째 입력받을 숫자
	int data1;// 더하기
	int data2;// 빼기
	int data3;// 곱하기
	int data4;// 나누기

}
