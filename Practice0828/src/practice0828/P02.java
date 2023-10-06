package practice0828;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1: 입력한 숫자 배열에 저장 | 2: 2차원 배열의 길이, 출력");
			System.out.println("3: String 클래스 | 4: 배열 정렬");
			System.out.println("------------------------------");
			System.out.println();
			switch (scan.nextInt()) {
			case 1:
				// Q1. 입력한 숫자 배열에 저장
				System.out.println("Q1. 입력한 숫자 배열에 저장");
				int[] arr = new int[6];
				for (int i = 0; i < arr.length; i++) {
					System.out.printf("숫자를 입력하세요(%d/6) -> ", i + 1);
					int num = scan.nextInt();
					arr[i] = num;
				} // for
				System.out.print("입력한 값: ");
				for (int i = 0; i < arr.length; i++) {
					if (i != arr.length - 1)
						System.out.print(arr[i] + ",");
					if (i == arr.length - 1)
						System.out.println(arr[i]);
				}
				System.out.println("------------------------------");

				break;

			case 2:
				// Q2. 2차원 배열의 길이, 출력
				System.out.println("Q2. 2차원 배열의 길이, 출력");

				/*
				 * 배열에 값넣는 방법 // 1. 객체 생성 후 하나씩 int[][] arr2 = new int[2][3]; arr2[0][0] = 1;
				 * arr2[0][1] = 2; arr2[0][2] = 3; arr2[1][0] = 4; arr2[1][1] = 5; arr2[1][2] =
				 * 6;
				 * 
				 * // 2. 행 먼저 생성하고 열 생성 = 비정방 행렬 가능(들쭉날쭉 행렬) int[][] arr2 = new int[2][];
				 * arr2[0] = new int[3]; arr2[1] = new int[3]; arr2[0][0] = 1; arr2[0][1] = 2;
				 * arr2[0][2] = 3; arr2[1][0] = 4; arr2[1][1] = 5; arr2[1][2] = 6;
				 * 
				 * // 3. 배열 자료형과 함께 입력 = 비정방 행렬 가능(들쭉날쭉 행렬) int[][] arr2 = new int[][]
				 * {{1,2,3},{4,5,6}};
				 */

				// 4. 대입 값만 입력 = 비정방 행렬 가능(들쭉날쭉 행렬)
				int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 } };

				System.out.println(arr2.length); // 방의 개수 (1방 = 1원소 = 1차원배열이 들어감)
				System.out.println(arr2[0].length);
				System.out.println(Arrays.toString(arr2[0]));
				System.out.println(Arrays.toString(arr2[1]));
				System.out.println("------------------------------");

				System.out.println("2중 for문으로 출력");
				for (int i = 0; i < arr2.length; i++) {
					for (int j = 0; j < arr2[i].length; j++) {
						if (j != arr2[i].length - 1) {
							System.out.print(arr2[i][j] + ", ");
						} else {
							System.out.println(arr2[i][j]);
						}
					}
				}
				System.out.println("------------------------------");

				System.out.println("2중 for-each문으로 출력");
				for (int[] m : arr2) { // 2차원 배열 arr2에서 m이라는 1차원배열 원소 꺼내기
					for (int n : m) { // 1차원 배열 m에서 n이라는 원소 꺼내기
						System.out.print(n + " ");
					}
					System.out.println();
				}
				System.out.println("------------------------------");

				break;

			case 3:
				// Q3. String 클래스(indexOf(), lastIndexOf(), substring())
				System.out.println("Q3. String 클래스");
				String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다";
				String name = "";
				int age = 0;
				int s1 = str.indexOf("[");
				int l1 = str.indexOf("]");
				name = str.substring(s1 + 1, l1);

				int s2 = str.lastIndexOf("[");
				int l2 = str.lastIndexOf("]");
				age = Integer.parseInt(str.substring(s2 + 1, l2));

				System.out.println(name);
				System.out.println(age);
				System.out.println("------------------------------");

				break;

			case 4:
				// Q4. 배열 정렬
				System.out.println("Q4. 배열 정렬");
				int[] arr3 = { 1, 5, 4, 2, 3, 6, 7, 9, 8 };
				Integer[] arr4 = { 8, 9, 7, 6, 3, 2, 4, 5, 1 };

				Arrays.sort(arr3); // 오름차순 정렬
				Arrays.sort(arr4, Collections.reverseOrder()); // 내림차순 정렬 *Integer 객체만 가능~

				System.out.println("arr3: " + Arrays.toString(arr3));
				System.out.println("arr4: " + Arrays.toString(arr4));
				System.out.println("------------------------------");

				break;
			}// switch
		}// while(true)

	}// main

}
