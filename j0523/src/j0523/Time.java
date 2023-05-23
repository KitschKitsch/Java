package j0523;

public class Time {
	private int hour; // 인스턴스변수
	private int minute;
	private int second;

	Time() {// 기본생성자(항상만들기! super 에러 방지)
	}

	Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;

	}

	// get : 읽기
	public int getHour() {// 인스턴스메소드. hour값 읽어오는 메소드
		return hour;
	}

	// set : 저장
	public void setHour(int hour) {// hour에 값을 저장하는 메소드
		if (hour < 0 || hour > 23) {
			System.out.println("데이터 잘못 입력");
			
		}
		this.hour = hour;
	}

}
