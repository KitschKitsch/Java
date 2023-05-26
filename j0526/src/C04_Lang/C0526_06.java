package C04_Lang;

public class C0526_06 {

	public static void main(String[] args) {
		
		int sum = 0;
		String str = "";
		for (int i = 1; i < 10; i++) {
			sum = sum + i;// 기존값에 덮어쓰기
			str = str + i;// 계속 새로운 공간 만듦
		}

	}

}
