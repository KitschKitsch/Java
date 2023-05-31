package j0531;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C0531_04 {

	public static void main(String[] args) {

		File f = new File("C:/savedata/b.txt");

		// FileWriter: 파일저장하기 (문자열로! 바이트 단위 X)
		FileWriter fw = null;
		try {
			fw = new FileWriter(f);
			for (int i = 0; i < 10; i++) {
				String data = i + "번째 줄입니다.\r\n";
				fw.write(data);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println(">> 파일이 저장되었습니다.");

		// FileReader: 파일 읽어오기(문자열로)
		FileReader fr = null;// 1byte씩 읽음(한글X)
		BufferedReader br = null;// 1줄씩 데이터를 읽어옴!
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			// br = new BufferedReader(new FileReader(f));

			while (true) {
				String line = br.readLine();// 버퍼리더는 파일을 한줄씩 읽어..🐻
				if (line == null)
					break;
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
