package C04_Starcraft;

public class Unit {

	int hitPoint;// 체력
	final int MAX_HP;// 최대체력

	Unit() {// 기본생성자
		MAX_HP = 10;
	}

	Unit(int hp) {
		MAX_HP = hp;
	}

}
