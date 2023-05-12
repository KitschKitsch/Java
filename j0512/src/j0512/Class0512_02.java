package j0512;

import java.util.Scanner;

public class Class0512_02 {

	public static void main(String[] args) {
		// 로또 프로그램
		Scanner scan = new Scanner(System.in);
		// 1.변수&배열생성
		int random = 0; //랜덤번호
		int temp = 0; //임시저장변수
		int count = 0;
		int[] lotto = new int[45]; //로또번호
		int[] lottoNum = new int[6]; //당첨번호
		int[] myNum = new int[6]; //입력번호
		
		// 2.번호생성
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = i+1; // 1,2,3,4,,,45
			// lotto[i] = (int)(Math.random()*45)+1; //중복번호생겨버림;;;
		}
		
		
		// 3.번호섞기
		for (int i=0; i<1000; i++) {
   			random = (int)(Math.random()*45); //0~44 난수
   			temp = lotto[0];
   			lotto[0] = lotto[random];
   			lotto[random] = temp;
		}
		
		// 4.로또번호 입력
		for (int i=0; i<6; i++) {
			System.out.println(i+1 +"번째 로또번호를 입력하세요.");
			myNum[i] = scan.nextInt();
		}
		
		// 5. 로또번호 확인
		for (int i=0; i<6; i++ ) {
			for (int j=0; j<6; j++) {
				if (lotto[i]==myNum[j]) {
					lottoNum[count] = lotto[i]; //당첨번호 넣기 
					count++; //당첨개수 증가
					continue; //로또번호를 맞췄으면 다음번호를 대입하며 찾아보자!
				}
			}
		}
		
		// 6. 로또번호 출력
		System.out.print("로또번호: ");
		for (int i=0; i<6; i++) {
			System.out.print(lotto[i] +" ");
		}
		System.out.println();
		
		// 7. 입력번호 출력
		System.out.print("입력번호: ");
		for (int i=0; i<6; i++) {
			System.out.print(myNum[i] +" ");
		}
		System.out.println();
		
		// 8. 당첨번호 출력
		System.out.print("당첨번호: ");
		for (int i=0; i<count; i++) {
			System.out.print(lottoNum[i] +" ");
		}
		// 9. 당첨개수
		System.out.println("당첨개수: " +count);
	}

}
