package j0515;

public class C0515_04 {

	public static void main(String[] args) {
		// 2차원배열(4*3)에 번호넣기(1~12)

		// 1)배열선언
		int[][] box = new int[4][3];// 4행*3열

		// 2)번호넣기
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				box[i][j] = (i * 3) + (j + 1);
			}
		}

		// 3)출력
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(box[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
