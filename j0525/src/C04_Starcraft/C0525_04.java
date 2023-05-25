package C04_Starcraft;

public class C0525_04 {

	public static void main(String[] args) {

		Tank t1 = new Tank();
		Marine m1 = new Marine();
		Tank t2 = new Tank();
		Marine m2 = new Marine();
		Scv s1 = new Scv();
		Vulture v1 = new Vulture();

		t1.hitPoint -= 10;
		t1.hitPoint -= 10;
		System.out.println("수리전: " + t1.hitPoint);
		s1.repair(t1);
		System.out.println("수리후: " + t1.hitPoint);

		v1.hitPoint -= 10;
		v1.hitPoint -= 10;
		System.out.println("수리전: " + v1.hitPoint);
		s1.repair(v1);
		System.out.println("수리후: " + v1.hitPoint);

//		m2.hitPoint -= 10;
//		m2.hitPoint -= 10;
//		m2.hitPoint -= 10;
//		s1.repair(m2);

	}

}
