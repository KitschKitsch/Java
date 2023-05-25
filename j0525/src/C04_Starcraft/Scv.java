package C04_Starcraft;

public class Scv extends GroundUnit implements Repairable {

	Scv() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) {// 인터페이스를 매개변수로!
		// Repairable r = new Tank(); // 다형성
		Unit u = (Unit) r;// 강제형변환! Repairable의 상위는? Unit!

		while (u.hitPoint != u.MAX_HP) {
			u.hitPoint++;
		}
		System.out.println("수리 완료");

	}
}
