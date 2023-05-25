package C04_Starcraft;

public class Vulture extends GroundUnit implements Repairable {

	Vulture() {
		super(80);// super(): 조상의 생성자 호출
		hitPoint = MAX_HP;
	}

}
