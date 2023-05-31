package j0531;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class C0531_05 {

	public static void main(String[] args) {

		// 파일 읽어오기
		BufferedReader br = null;
		try {
			br = new BufferedReader((new FileReader("C:/savedata/news.txt")));// 1byte말고 한줄씩 읽을램

			while (true) {
				String data = br.readLine();// 한줄씩 읽어온 데이터
				if (data == null)// 데이터 없으면
					break;// 그만
				System.out.println(data);// 아니면 데이터 출력
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		// 파일 쓰기
		String str = "파일쓰기를 시작합니다.";

		FileWriter fw = null;
		try {
			fw = new FileWriter("C:/savedata/c.txt");// 1)경로지정
			fw.write(str);// 2)데이터넣기. 끗!

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

			System.out.println(">> 파일이 저장되었습니다.");
		}

	}

}
