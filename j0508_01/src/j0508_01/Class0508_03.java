package j0508_01;

public class Class0508_03 {
	
	static int num = 10; // 전역변수 - class영역에서도 변수선언 가능. 전역변수는 기본값 0 세팅됨
	
	public static void main(String[] args) {
		int num; // 지역변수 - 지역변수는 기본값 0 세팅 X
		num = 10;
		System.out.println("main메소드 num호출: "+num);
		sub();
	}
	
	static void sub() {
		System.out.println("sub메소드 num호출: "+num);
	}
}