package j0522;

public class Product {
	static int count = 0;// 클래스변수 count = 0

	int serialNo;// 인스턴스변수 serialNo = 0

	{// 인스턴스 초기화블럭
		++count; // count = 1
		serialNo = count; // serialNo = 1
	}

	Product() {// 생성자

	}
}
