package j0523;

public class C0523_05 {

	public static void main(String[] args) {
		// 12시 50분 52초 입력
		// 12시를 출력

		Time t = new Time(12, 50, 52);
		System.out.println(t.getHour());

		t.setHour(24);
		System.out.println(t.getHour());

	}

}
