package C04_Starcraft;

public class Medic extends GroundUnit implements Curable {

	Medic() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Curable c) {
		GroundUnit g = (GroundUnit) c;// Curable 인터페이스 모두를 포함하는 그룹은? GroundUnit!
		while (g.hitPoint != g.MAX_HP) {
			g.hitPoint++;
		}
		System.out.println("치료 완료");

	}
}
