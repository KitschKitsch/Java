package C04_Starcraft;

public class Tank extends GroundUnit implements Repairable {

	Tank() {
		super(150);// super(): 조상의 생성자 호출
		hitPoint = MAX_HP;
	}

}
