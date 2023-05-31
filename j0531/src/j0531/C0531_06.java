package j0531;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class C0531_06 {

	public static void main(String[] args) {

		// 변수&객체선언
		int stuNo = 0;
		String name = "";
		int kor = 0, eng = 0, math = 0;
		List<Student> list = new ArrayList<>();

		// 버퍼리더로 파일 읽어오기
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:/savedata/student.txt"));// 파일경로설정(1byte말고 한줄씩 읽을램)

			while (true) {// 반복문
				String data = br.readLine();// 한줄씩 읽어온 데이터 // data = "1,홍길동,100,100,99";
				if (data == null)// 데이터 없으면
					break;// 그만
				System.out.println(data);// 아니면 데이터 출력

				String[] dataArr = data.split(",");// 쉼표단위로 분리해서 배열에 저장
				System.out.println(Integer.parseInt(dataArr[0]));// String -> Int로 형변환
				System.out.println(dataArr[1]);
				System.out.println(Integer.parseInt(dataArr[2]));
				System.out.println(Integer.parseInt(dataArr[3]));
				System.out.println(Integer.parseInt(dataArr[4]));

				stuNo = Integer.parseInt(dataArr[0]);// String -> Int로 형변환
				name = dataArr[1];
				kor = Integer.parseInt(dataArr[2]);
				eng = Integer.parseInt(dataArr[3]);
				math = Integer.parseInt(dataArr[4]);

				list.add(new Student(stuNo, name, kor, eng, math));
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				br.close();// 파일닫기
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		System.out.println();
	}// 파일 읽어오기

}
