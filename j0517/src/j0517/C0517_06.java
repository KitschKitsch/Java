package j0517;

public class C0517_06 {

	public static void main(String[] args) {
		//
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x: " + d.x);

		System.out.println("-----------");
 
		change(d.x);
		// d.x = change(d.x); // 변수에 재저장해야 1000
		System.out.println("change d.x: " + d.x);// 10:O  1000:X

	}

	static void change(int x) {// int 리턴타입에
		x = 1000;// 지역변수!
		System.out.println("x: " + x);
		// return x; // return 있어야하고
	}

}
