package C04_Collections;

public class C0530_04 {

	public static void main(String[] args) {

		String str = "abc";
		str = str + "1";// 계속 새로운 공간에 저장 => StringBuffer클래스: 기존 공간에 저장
		str = str + "1";
		System.out.println(str);

		int a = 0;
		a = a + 1;// 기존 값에 저장

		// StringBuffer클래스: 기존 공간에 저장
		StringBuffer sb = new StringBuffer("abc");
		// sb = sb + 1;// 에러
		sb.append(1);
		sb.append(1);
		System.out.println(sb);

	}

}
