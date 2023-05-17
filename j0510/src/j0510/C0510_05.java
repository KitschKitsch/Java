package j0510;

import java.util.Scanner;

public class C0510_05 {

	public static void main(String[] args) {
		// 점수를 입력받아 90점 이상이면 A, 80점 이상 B,...
		// 97점 이상 A+, 93점 이하 A-, 87점 이상 B+, 83점 이하 B-,...
//		int input = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int input = scan.nextInt();
		
		if (input >= 90) { // 90점 이상이면 A
			System.out.print("A");
			// A안에서 +,-,0 나누기(이중 for문)
			if (input>=97) { // 97점 이상이면 A+
				System.out.println("+");
			} else if (input<=93) { // 93점 이하이면 A-
				System.out.println("-");
			} else { // 둘 다 아니라면 A0
				System.out.println("0");
			}
			
		} else if (input >= 80) {
			System.out.print("B");
			
			if (input>=87) {
				System.out.println("+");
			} else if (input<=83) {
				System.out.println("-");
			} else {
				System.out.println("0");
			}
			
		} else if (input >= 70) {
			System.out.print("C");
			
			if (input>=77) {
				System.out.println("+");
			} else if (input<=73) {
				System.out.println("-");
			} else {
				System.out.println("0");
			}
			
		} else if (input >= 60) {
			System.out.print("D");
			
			if (input>=67) {
				System.out.println("+");
			} else if (input<=63) {
				System.out.println("-");
			} else {
				System.out.println("0");
			}
			
		} else {
			System.out.print("F");
		}
	}
	
}