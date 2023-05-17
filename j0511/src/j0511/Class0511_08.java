package j0511;

import java.util.Scanner;

public class Class0511_08 {

	public static void main(String[] args) {
		// 랜덤숫자 맞추기
		// 기회는 10번! 정답확인 시 입력한 모든 번호를 출력하시오.
		Scanner scan = new Scanner(System.in);
		int random=0, count=0;
		int[] num = new int[10]; // 입력값 저장소
		
		random = (int)(Math.random()*100)+1;
		System.out.println("랜덤숫자: " +random);
		
		while (true) {
			if (count>9) {
				System.out.println("10번 도전했습니다. 프로그램을 종요합니다.");
				break;
			}
			System.out.println((count+1)+ "번째 숫자를 입력하세요.>> ");
			num[count] = scan.nextInt();
			
			if (num[count]==random) {
				System.out.println(">> 정답입니다!");
				System.out.println(num[count]);
				break;
			} else {
				System.out.println(">> 오답입니다. 다시 도전하세요.");
			}
			count++;
		}
		
		// 입력한 숫자 출력
		System.out.println(">> 정답: " +random);
		System.out.print(">> 입력한 숫자: ");
		for (int i=0; i<count; i++) {
			if (i==0) { System.out.print(num[i]);
			} else {
				System.out.print(", " +num[i]);
			}
		}	
	}

}
