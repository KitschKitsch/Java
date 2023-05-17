package j0516;

import java.util.Scanner;

public class C0516_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 리모콘 프로그램

		// 1)변수선언
		int choice = 0;// 번호입력변수
		int tempVolume = 0;// 임시볼륨 저장변수

		// 2)객체선언: 클래스명 참조변수명 = new 클래스명();
		Tv t = new Tv();

		// 3)화면출력
		while (true) {
			System.out.println("[ 📺리모콘 프로그램 ]");
			System.out.println("1:전원    2:채널🔼  3:채널🔽");
			System.out.println("4:볼륨🔊  5:볼륨🔉  6:음소거🔈");
			System.out.println("--------------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				t.power();// 메소드사용방법: 참조변수명.메소드명();
				if (t.power == true) {
					System.out.println("🔘 ON");
				} else {
					System.out.println("⚪ OFF");
				}
				System.out.println();
				break;

			case 2:
				if (t.power == false) {
					System.out.println("먼저 전원을 켜주세요.");
					break;
				}
				t.channelUp();
				System.out.println("현재채널: " + t.channel);
				System.out.println();
				break;

			case 3:
				if (t.power == false) {
					System.out.println("먼저 전원을 켜주세요.");
					break;
				}
				t.channelDown();
				System.out.println("현재채널: " + t.channel);
				System.out.println();
				break;

			case 4:
				if (t.power == false) {
					System.out.println("먼저 전원을 켜주세요.");
					break;
				}
				t.volumeUp();
				System.out.println("현재볼륨: " + t.volume);

				break;

			case 5:
				if (t.power == false) {
					System.out.println("먼저 전원을 켜주세요.");
					break;
				}
				t.volumeDown();
				System.out.println("현재볼륨: " + t.volume);

				break;

			case 6:
				if (t.power == false) {
					System.out.println("먼저 전원을 켜주세요.");
					break;
				}
				if (t.volume == 0) {
					t.volume = tempVolume;// 저장볼륨불러오기
					System.out.println("음소거 해제🔊");
					System.out.println("현재볼륨: " + t.volume);
				} else {
					tempVolume = t.volume;// 현재볼륨저장
					t.volume = 0;
					System.out.println("음소거 실행🔈");
					System.out.println("현재볼륨: " + t.volume);
				}
				break;

			}// switch

		} // while
	}

}