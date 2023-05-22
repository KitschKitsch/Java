package j0522;

public class C0522_05 {

	public static void main(String[] args) {
		Data d1 = new Data();// new:공간생성, Data():기본생성자 호출
		// int num1,num2,data1,data2,data3,data4;
		Data d2 = new Data();
		Data d3 = new Data(1, 2);// 매개변수생성자

		Data[] d = new Data[5];// 배열에대한선언(객체선언X)
		d[0] = new Data();// == d[0] = d1;
		d[1] = new Data();
		d[2] = new Data(1, 2);

		int num1 = 0;
		int num2 = 0;
		int data1 = 0;
		int data2 = 0;
		int data3 = 0;
		int data4 = 0;

		int num3 = 0;
		int num4 = 0;
		int data5 = 0;
		int data6 = 0;
		int data7 = 0;
		int data8 = 0;

		int num5 = 0;
		int num6 = 0;
		int data9 = 0;
		int data10 = 0;
		int data11 = 0;
		int data12 = 0;
	}

}
