package j0511;

public class Class0511_06 {

	public static void main(String[] args) {
		//int[] = num;
		//new = int[10];
		int[] score = new int[10]; // 10자리 배열 만들기
		System.out.println(score[0]); // 인덱스 없으면 메모리 주소값이 출력!
		
		String[] name = new String[100];
		System.out.println(name[0]);
		double[] avg = new double[50];
		System.out.println(avg[0]);
		
		//score[0] = 1; score[1] = 2; score[2] = 3; score[3] = 4;	score[4] = 5;
		//score[5] = 6; score[6] = 7; score[7] = 8; score[8] = 9;	score[9] = 10;
		int[] input = {1,2,3,4,5,6,7,8,9,10}; // 10개 배열 자동 생성
		System.out.println("" +input[0] +input[1] +input[2]);
	}

}
