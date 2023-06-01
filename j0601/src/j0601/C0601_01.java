package j0601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C0601_01 {

	public static void main(String[] args) {

		// 날짜 객체
		Date today = new Date();
		System.out.println(today.toString());// Thu Jun 01 09:45:20 KST 2023
		System.out.println("--------------------");

		// 날짜 형태를 지정하는 객체(SimpleDateFormat): 2023-06-01 형식으로 변경
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss zzz");// 형식지정 *** 월 = MM
		System.out.println(sdf.format(today));// 형식에 시간 끼워넣기

		System.out.println(today.getYear());// 년 1900년 기준 1900+123=2023
		System.out.println(today.getMonth());// 월 0~11 = 1월~12월
		System.out.println(today.getDate());// 일
		System.out.println(today.getDay());// 요일 0~6 = 일요일~토요일
		System.out.println(today.getHours());// 시
		System.out.println(today.getMinutes());// 분
		System.out.println(today.getSeconds());// 초
		System.out.println("--------------------");

		// 지역시간을 표기하는 객체(Calendar): 싱글톤 패턴 = 객체 단 하나 = 객체선언X
		// Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();// 메소드호출
		Date date1 = cal.getTime();// Date형식으로 받기
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");// 형식지정
		System.out.println(sdf2.format(date1));// 형식에 시간 끼워넣기

		int year = cal.get(Calendar.YEAR);// 년
		System.out.println(year);
		int month = cal.get(Calendar.MONTH);// 월 0~11 = 1월~12월
		System.out.println(month);
		int date = cal.get(Calendar.DATE);// 일
		System.out.println(date);
		int HOUR = cal.get(Calendar.HOUR);// 시
		System.out.println(HOUR);
		int MINUTE = cal.get(Calendar.MINUTE);// 분
		System.out.println(MINUTE);
		int SECOND = cal.get(Calendar.SECOND);// 초
		System.out.println(SECOND);
	}

}
