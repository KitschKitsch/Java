package j0512;

import java.util.Scanner;

public class C0512_02 {

	public static void main(String[] args) {
		// 로또번호 생성 프로그램
		// 랜덤하게 섞고 내가 입력한 번호와 비교하여 당첨결과까지 출력
		
		Scanner scan = new Scanner(System.in);
		
		// 1)변수&배열선언 - 랜덤번호변수, 임시저장변수, 개수변수, 로또번호배열, 내번호배열, 당첨번호배열
		int random = 0;
		int temp = 0;
		int count = 0;
		int[] lotto = new int[45];
		int[] myNum = new int[6];
		int[] lottoNum = new int[6];
		
		// 2)로또번호생성(1~45)
		for (int i=0; i<lotto.length; i++) {//lotto.length = 45
			lotto[i] = i+1;//로또번호배열에 1~45 숫자담기
		}
		
		// 3)로또번호섞기
		for (int i=0; i<1000; i++) {//아래 작업을 1000번 반복
			random = (int)(Math.random()*45);//0~44의 난수 인덱스번호
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}
		
//		// 6)로또번호출력
//		for (int i=0; i<6; i++) {
//			System.out.print(lotto[i] +" ");
//		}
//		System.out.println();
		
		// 4)로또번호입력
		for (int i=0; i<6; i++) {
			System.out.println((i+1) +"번째 번호를 입력하세요.>> ");
			myNum[i] = scan.nextInt();
		}
		
		// 5)로또번호확인*** - lotto[0]에 myNum[0~5]을 대입하며 맞춰보기
		for (int i=0; i<6; i++) {
			for (int j=0; j<6; j++) {
				if (lotto[i]==myNum[j]) {
					lottoNum[count] = myNum[j];//***덮어쓰기 방지!, myNum[j] = lotto[i]
					count++;
//					continue;
				}
			}
		}
		
		// 6)로또번호출력
		System.out.print("로또번호: ");
		for (int i=0; i<6; i++) {
			System.out.print(lotto[i] +" ");
		}
		System.out.println();
		
		// 7)입력번호출력
		System.out.print("내 번호: ");
		for (int i=0; i<myNum.length; i++) {
			System.out.print(myNum[i] +" ");
		}
		System.out.println();

		// 8)당첨번호출력
		System.out.print("당첨번호: ");
		for (int i=0; i<count; i++) {
			System.out.print(lottoNum[i] +" ");
		}
		System.out.println();
		
		// 9)당첨개수
		System.out.print("당첨개수: ");
		System.out.println(count);
	}

}
