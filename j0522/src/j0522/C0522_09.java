package j0522;

public class C0522_09 {

	public static void main(String[] args) {
		// 객체선언 후
		Product p1 = new Product();// serialNo = 1
		System.out.println("p1.serialNo:" + p1.serialNo);

		Product p2 = new Product(); // serialNo = 2 // 같은 static count 사용하니까@!@!
		System.out.println("p2.serialNo:" + p2.serialNo);

		Product p3 = new Product();
		System.out.println("p3.serialNo:" + p3.serialNo);

		System.out.println();	
		
		System.out.println("p1.count:" + Product.count);
		System.out.println("p2.count:" + Product.count);
		System.out.println("p3.count:" + Product.count);
		System.out.println("p1.count:" + p1.count);// 주소값 같으니까 이젠 계속 3!

	}

}
