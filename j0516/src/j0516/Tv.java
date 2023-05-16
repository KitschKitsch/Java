package j0516;

//클래스=설계도: 첫글자 대문자!
public class Tv {
	// 변수 3개
	String color;// 클래스 바로 아래 선언된 변수는 알아서 기본값!
	boolean power;// false
	int channel;// 0
	int volume;// 0

	// 메소드 3개
	void power() {
		power = !power;
	}

	void channelUp() {
		if (channel >= 999) {
			channel = 1;
			return;
		}
		channel++;
	}

	void channelDown() {
		if (channel <= 1) {
			channel = 999;
			return;
		}
		channel--;
	}

	void volumeUp() {
		if (volume > 14) {
			volume = 15;
			return;
		}
		volume++;
	}

	void volumeDown() {
		if (volume < 1) {
			volume = 0;
			return;//void 메소드 탈출~
		}
		volume--;
	}
}
