package C03_Abstract;

public abstract class Player {

	int volume;

	abstract void play();// 미완성메소드 => abstract!

	abstract void stop(); // 미완성메소드 => abstract!

	void pause() {// 완성메소드
	}
}
