package j0512;

import java.util.Scanner;

public class Class0512_01 {

	public static void main(String[] args) {
		// 성적입력 프로그램
		// 1:성적입력  2:성적출력  0:종료
		
		Scanner scan = new Scanner(System.in);
		
		// 1) 변수선언
		int input = 0, count = 0;
		String[] name = new String[10];
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] math = new int[10];
		int[] total = new int[10];
		double[] avg = new double[10];
		
		// 2) 화면출력
		loop: while (true) {
			System.out.println("[ 📝성적입력 프로그램📊 ]");
			System.out.println("1:성적입력  2:성적출력  3:성적수정  4.등수처리  5.성적검색  0:종료");
			System.out.println("---------------------------------------------------");
			System.out.println("숫자를 입력하세요.>> ");
			input = scan.nextInt();
			if (input==0) {
				System.out.println(">> 프로그램을 종료합니다.");
				break; //0:종료하기
			} //종료하는 if문
			
			// 3) 조건문
			switch (input) {
				// 4) 입력
			case 1: //1:성적입력
				for (int i=count; i<name.length; i++) { // i<=count 값만 대입한것! i와 count는 별개의 변수임
					System.out.println(count+1 +"번째 학생 이름(이전:0, 종료:1)>> ");
					name[i] = scan.next();
					if (name[i].equals("0")) break; //1-0:이전으로 빠져나가기
					if (name[i].equals("1")) {
						System.out.println(">> 프로그램을 종료합니다.");
						break loop; //1-1:종료하기
					}
					System.out.println("국어점수>> ");
					kor[i] = scan.nextInt();
					System.out.println("영어점수>> ");
					eng[i] = scan.nextInt();
					System.out.println("수학점수>> ");
					math[i] = scan.nextInt();
					//자동계산
					total[i] = kor[i]+eng[i]+math[i];
					avg[i] = total[i]/3.0;
					count++; //다시 입력시 덮어쓰기 안되게!
				} //입력 for문
				break; //조건 switch문 종료
				
				// 5) 출력	
			case 2: //2:성적출력
				System.out.println();
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("-------------------------------------------");
				for (int i=0; i<count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i],kor[i],eng[i],math[i],total[i],avg[i]);		
				} //출력 for문
				System.out.println();
			} //조건 switch문
		} //전체 while문
	}

}