package C04_Starcraft;

public class Wraith extends AirUnit implements Repairable {

	Wraith() {
		super(120);// super(): 조상의 생성자 호출
		hitPoint = MAX_HP;
	}
}
