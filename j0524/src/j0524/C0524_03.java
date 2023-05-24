package j0524;

public class C0524_03 {

	public static void main(String[] args) {

		Car c = new Car();
		Car cc = null;
		Ambulance a = new Ambulance();
		Ambulance aa = null;
		FireEngine f = new FireEngine();
		FireEngine ff = null;

		// 다형성! 다형성일때만 '형.변.환' 가능함..!
		Car c2 = new Ambulance();
		Car c3 = new FireEngine();

		// ------------------------------
		a.siren();
		f.water();
		// c2.siren(); // siren 메소드 존재 X
		// c3.water(); // water 메소드 존재 X
//		 c2 = aa;
		aa = (Ambulance) c2;// 조상을 자손에 담을 때! 형변환(Down-casting)
		aa.siren();

		// aa = (Ambulance) c;// Ambulance aa = new Car(); 자손참조변수로 부모객체 다루는 것 X
		// aa = (Ambulance)c3;// Ambulance aa = new FireEngine(); 다른자손 형변환 X

	}

}
