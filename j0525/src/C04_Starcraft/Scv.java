package C04_Starcraft;

public class Scv extends GroundUnit implements Repairable {

	Scv() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable g) {// 인터페이스를 매개변수로!
		// Repairable g = new Tank(); // 다형성
		Unit t = (Unit) g;// 강제형변환! Repairable의 상위는? Unit!

		while (t.hitPoint != t.MAX_HP) {
			t.hitPoint++;
		}
		System.out.println("수리 완료");

	}
}
