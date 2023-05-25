package C04_Starcraft;

public class C0525_04 {

	public static void main(String[] args) {

		Tank t1 = new Tank();
		Tank t2 = new Tank();
		Vulture v1 = new Vulture();
		Scv s1 = new Scv();
		Marine m1 = new Marine();
		Medic m2 = new Medic();
		
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

		m1.hitPoint -= 10;
		System.out.println("치료전: " + m1.hitPoint);
		m2.repair(m1);
		System.out.println("치료후: " + m1.hitPoint);

	}

}
