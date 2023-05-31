package j0531;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class C0531_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// InputStream: 파일 읽어오기
		// 외부와 접속시 try-catch문
		InputStream is = null;
		try {
			is = new FileInputStream("C:/savedata/a.txt");

			int i = -1;

			while (true) {
				if ((i = is.read()) == -1) // -1: 더이상 1byte씩(한문자씩) 읽어올 데이터가 없음
					break;

				System.out.println("데이터: " + (char) i);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {// 무조건 돌리는 구문
			try {
				is.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		// OutStream: 파일 저장하기
		// 외부와 접속시 try-catch문
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:/savedata/a.txt");

			System.out.println("원하는 글자를 입력하세요.");
			String str = scan.nextLine();// next로 하면 띄어쓰기 이하 생략;;
//			String str = "글자를 입력합니다.안녕하세요.\r\n반갑습니다.줄단락바꿈\r\n";

			byte[] bs = str.getBytes();// 통째로 넣으면 한글도 byte단위로 저장 가넝 but 읽기는 안됨,,,

			os.write(bs);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				os.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		System.out.println(">> 파일이 저장되었습니다.");

	}
}
