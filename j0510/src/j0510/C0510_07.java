package j0510;

import java.util.Scanner;

public class C0510_07 {

	public static void main(String[] args) {
		// 랜덤숫자 만들기
		int random = 0;
		random = (int)(Math.random()*5)+1; // (int)(Math.random()*원하는 끝번호)+1 : 1~원하는 번호까지 난수 발생
		System.out.println(random);
				
		int random2 = 0;
		random2 = (int)(Math.random()*10)+1; // 1부터 10까지의 난수 발생
		System.out.println(random2);
		
		int random3 = 0;
		random3 = (int)(Math.random()*3)+1;
		System.out.println(random3);
		
		// 숫자를 입력받아 같은 값일 경우 당첨, 그렇지 않으면 낙첨을 출력하시오.
		int input = 0;
		int random4 = (int)(Math.random()*10)+1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		input = scan.nextInt();
		
		if (random4 == input) {
			System.out.println(random4 +" 당첨입니다.");
		} else {
			System.out.println(random4 +" 낙첨입니다.");
		}
		System.out.print("입력숫자: " +input +"\t");
		System.out.print("랜덤숫자: " +random4);	
	}
	
}