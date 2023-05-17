package j0512;

import java.util.Scanner;

public class C0512_03 {

	public static void main(String[] args) {
		// 로또번호 생성 프로그램 (한번더!)
		
		Scanner scan = new Scanner(System.in);
		
		// 1)변수&배열생성
		int random = 0;
		int temp = 0;
		int count = 0;
		int[] lotto = new int[45];
		int[] myNum = new int[6];
		int[] lottoNum = new int[6];
		
		// 2)로또번호생성
		for (int i=0; i<45; i++) {
			lotto[i] = i+1;
		}
		
		// 3)로또번호섞기(random사용, 1000번)
		for (int i=0; i<1000; i++) {
			random = (int)(Math.random()*45);//0~44 인덱스 주소
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}
		
		// 4)로또번호입력
		for (int i=0; i<myNum.length; i++) {
			System.out.println((i+1) +"번째 번호를 입력하세요.>> ");
			myNum[i] = scan.nextInt();
		}
		
		// 5)로또번호확인
		for (int i=0; i<6; i++) {//생성된 번호 중 앞 여섯개만 로또번호로 사용!
			for (int j=0; j<6; j++) {
				if (lotto[i] == myNum[j]) {
					lottoNum[count] = lotto[i];
					count++;
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
		
		// 9)당첨개수출력
		System.out.print("당첨개수: ");
		System.out.print(count);
	}

}
