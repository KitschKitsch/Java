package j0512;

import java.util.Scanner;

public class Class0512_01 {

	public static void main(String[] args) {
		// 학생 10명 성적입력 프로그램
		// 1:성적입력  2:성적출력  0:종료
		// 1->0:이전  1->1:종료
		// 성적입력->이전을 누르면 이어서 성적입력 가능하게
		// 성적출력은 입력된 학생까지만 나오도록
		
		Scanner scan = new Scanner(System.in);
		
		// 1)변수&배열선언 - 메뉴입력변수, 개수변수, 이름배열, 국어배열, 영어배열, 수학배열, 합계배열, 평균배열,  
		int input = 0;
		int count = 0;
		String[] name = new String[10];
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] math = new int[10];
		int[] total = new int[10];
		double[] avg = new double[10];
		
		// 2)화면출력
		loop: while (true) {
			System.out.println("[ 📝 성적입력 프로그램 📊 ]");
			System.out.println("1:성적입력  2:성적출력  0:종료");
			System.out.println("----------------------- ");
			input = scan.nextInt();
			
			// 3)조건문
			switch (input) {
			case 0:
				System.out.println(">> 프로그램을 종료합니다.");
				break loop;
				
			// 4)성적입력	
			case 1:
				for (int i=count; i<10; i++) { //덮어쓰기 방지!
					System.out.println((count+1) +"번째 학생(0:이전  1:종료)");
					System.out.println("이름을 입력하세요.>> ");
					name[i] = scan.next();
					if (name[i].equals("0")) break; //이전
					if (name[i].equals("1")) {//종료
						System.out.println(">> 프로그램을 종료합니다.");
						break loop;
					}
					System.out.println("국어 점수를 입력하세요.>> ");
					kor[i] = scan.nextInt();
					System.out.println("영어 점수를 입력하세요.>> ");
					eng[i] = scan.nextInt();
					System.out.println("수학 점수를 입력하세요.>> ");
					math[i] = scan.nextInt();
					//자동계산
					total[i] = kor[i]+eng[i]+math[i];
					avg[i] = total[i]/3.0;
					count++; //덮어쓰기 방지!
				}//for
				break;
				
			// 5)성적출력	
			case 2:
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("---------------------------");
				for (int i=0; i<count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i],kor[i],eng[i],math[i],total[i],avg[i]);
				}//for
				break;
			}//switch
		}//while
	}

}
