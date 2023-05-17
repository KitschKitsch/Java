package j0515;

public class C0515_05 {

	public static void main(String[] args) {
		// 2차원배열(5*4)에 랜덤번호넣기(1~20)

		// 1)변수&배열선언
		int random = 0;
		int temp = 0;
		int[] num = new int[20];// 1차원배열
		for (int i = 0; i < num.length; i++) {// 1차원배열에번호넣기
			num[i] = i + 1;
		}
		int[][] box = new int[5][4];// 5행*4열

		// 2)1차원배열섞기
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * 10);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}

		// 3)1차원배열번호->2차원배열에넣기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				box[i][j] = num[i * 4 + j];
			}
		}

		// 4)출력
		System.out.print("    |\t");
		for (int i = 0; i < 4; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("-----------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.print(i + "   |\t");
			for (int j = 0; j < 4; j++) {
				System.out.print(box[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

	}

}
