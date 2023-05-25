package C04_Starcraft;

public class Medic extends GroundUnit {

	Medic() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair2(GroundUnit g) {
		while (g.hitPoint != g.MAX_HP) {
			g.hitPoint++;
		}
		System.out.println("수리 완료");

	}
}
