package C04_Lang;

import java.util.Arrays;

public class C0526_10 {

	public static void main(String[] args) {
		String data1 = "1001,홍길동,100,100,99";
		String[] result = data1.split(",");
		System.out.println(Arrays.toString(result));// 배열내용 한번에 출력
		int stuNo = Integer.parseInt(result[0]);// 인티.파스인티 = 객체타입을 int로 변환. (wrapper클래스)
		String name = result[1];
		int kor = Integer.parseInt(result[2]);
		int eng = Integer.parseInt(result[3]);
		int math = Integer.parseInt(result[4]);
		// double kor = Double.parseDouble(result1[1]);// 더블.파스더블

		Student s = new Student(stuNo, name, kor, eng, math);
		System.out.println("합계: " + s.getTotal());
		System.out.println("평균: " + s.getAvg());

		String[] chk_info = new String[3];
		chk_info[0] = "HTML";
		chk_info[1] = "CSS";
		chk_info[2] = "webDesign";

		String info3 = "";
		for (int i = 0; i < chk_info.length; i++) {
			if (i == 0)
				info3 = info3 + chk_info[i];
			else
				info3 = info3 + "," + chk_info[i];
		}

		// String info1 = chk_info[0]+","+chk_info[1]+","+chk_info[2];// 체크개수에 따라 누락되서 에러발생
		// String info2 = "HTML,CSS,webDesign";
		System.out.println(info3);
	}

}
