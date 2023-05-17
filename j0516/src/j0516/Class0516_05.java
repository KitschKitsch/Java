package j0516;

import java.util.Scanner;

public class Class0516_05 {

	public static void main(String[] args) {
		// 리모콘
		// 1,2,3,4,5,6,7,8,9,0
		// channelUp, channelDown, 이전보기, 자막
		// volumeUp, volumeDown, 음소거
		// 전원

		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int tempVolume = 0;// 임시볼률 저장변수

		// 객체선언
		Tv t = new Tv();
		while (true) {
			System.out.println("[ 📺리모콘 프로그램 ]");
			System.out.println("1:전원    2:채널🔼  3:채널🔽");
			System.out.println("4:볼륨🔊  5:볼륨🔉  6:음소거🔈");
			System.out.println("--------------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				t.power();// 객체사용방법: 참조변수명.메소드명();
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
				if (t.volume == 15) {
					System.out.println("최대 음량입니다.🔊");
				}
				System.out.println();
				break;

			case 5:
				if (t.power == false) {
					System.out.println("먼저 전원을 켜주세요.");
					break;
				}
				t.volumeDown();
				System.out.println("현재볼륨: " + t.volume);
				if (t.volume == 0) {
					System.out.println("최소 음량입니다.🔉");
				}
				System.out.println();
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
