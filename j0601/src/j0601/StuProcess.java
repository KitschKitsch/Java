package j0601;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StuProcess {

	// 변수&객체선언
	Scanner scan = new Scanner(System.in);
	int stuNo;
	String name;
	int kor, eng, math;
	String createDate, updateDate;

	// 1:학생성적입력
	// 메소드: 리턴타입+메소드명+(매개변수)
	Map<String, Object> stuInput(List<Student> list, int stuCount) {// 리턴타입이 Map: list와 count 둘다 반환할꺼라소
		while (true) {
			System.out.println("[ 학생성적 입력 ]");
			System.out.print(stuCount + "번째 이름(0:이전)>> ");
			name = scan.next();

			if (name.equals("0")) {
				System.out.println(">> 이전페이지로 이동");
				System.out.println();
				break;
			}

			System.out.print("국어점수>> ");
			kor = scan.nextInt();
			System.out.print("영어점수>> ");
			eng = scan.nextInt();
			System.out.print("수학점수>> ");
			math = scan.nextInt();
			// 날짜객체선언
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			createDate = sdf.format(d);

			list.add(new Student(stuCount, name, kor, eng, math, createDate));
			stuCount++;// 1증가
			System.out.println();
		} // while

		Map<String, Object> map = new HashMap<>();
		map.put("list", list);
		map.put("stuCount", stuCount);
		return map;
	}// stuInput

	// 2:학생성적출력
	// 리턴타입 메소드명
	List<Student> stuOutput(List<Student> list) {// 리턴타입이 List
		// 매개변수 대신 List<Student> list = new ArrayList(); 객체선언해버리면 출력이 안됨;;;
		String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수", "입력일", "수정일" };
		System.out.println("[ 학생성적 출력 ]");
		System.out.printf("%s\t %s\t %s\t %S\t %s\t %s\t %s\t %s\t %s\t %s\n", title[0], title[1], title[2], title[3],
				title[4], title[5], title[6], title[7], title[8], title[9]);
		System.out.println("--------------------------------------------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %s\t %.2f\t %d\t %s\t %s\n", s.getStuNo(), s.getName(),
					s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank(), s.getCreateDate(),
					s.getUpdateDate());
		}
		System.out.println();
		return list;
	}// stuOutput

	// 8:파일 불러오기
	// 리턴타입 메소드명
	List<Student> stuRead() {// List가 리턴타입
		List<Student> list = new ArrayList<>();// 매개변수에 list가 들어가면 호출할때마다 파일을 계속 가져와 덧붙임;;;

		// 버퍼리더로 파일 읽어오기
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:/savedata/student.txt"));// 파일경로설정(1byte말고 한줄씩 읽을램)

			while (true) {// 반복문
				String data = br.readLine();// 한줄씩 읽어온 데이터 // data = "1,홍길동,100,100,99";
				if (data == null)// 데이터 없으면
					break;// 그만

				String[] dataArr = data.split(",");// 쉼표단위로 분리해서 배열에 저장
				stuNo = Integer.parseInt(dataArr[0]);// String -> Int로 형변환
				name = dataArr[1];
				kor = Integer.parseInt(dataArr[2]);
				eng = Integer.parseInt(dataArr[3]);
				math = Integer.parseInt(dataArr[4]);
				createDate = dataArr[5];

				list.add(new Student(stuNo, name, kor, eng, math, createDate));
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
		return list;
	}// stuRead

	// 9:파일 저장하기
	// 리턴타입 메소드명
	void stuSave(List<Student> list) {

		// 파일 저장하기
		String data = "";
		for (int i = 0; i < list.size(); i++) {
			data += String.format("%d,%s,%d,%d,%d,%s,%s\r\n", list.get(i).getStuNo(), list.get(i).getName().trim(),
					list.get(i).getKor(), list.get(i).getEng(), list.get(i).getMath(), list.get(i).getCreateDate(),
					list.get(i).getUpdateDate());
		} // for문

		FileWriter fw = null;
		try {
			fw = new FileWriter("C:/savedata/student.txt", true);// true: 파일을 뒷부분에 추가
			fw.write(data);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println(">> 파일이 저장되었습니다.");
	}// stuSave

}
