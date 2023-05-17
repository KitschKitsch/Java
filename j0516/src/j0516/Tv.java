package j0516;

public class Tv {
	
	// 변수
	String color;
	boolean power;
	int channel;
	int volume;

	//메소드
	void power() {
		power = ! power;
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
			System.out.println("최대 볼륨입니다.");
			volume = 15;
			return;
		}
		volume++;
	}

	void volumeDown() {
		if (volume < 1) {
			System.out.println("최소 볼륨입니다.");
			volume = 0;
			return;
		}
		volume--;
	}
}
