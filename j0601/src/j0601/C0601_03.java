package j0601;

import java.io.FileWriter;

public class C0601_03 {

	public static void main(String[] args) {

		FileWriter fw = null;
		try {
			fw = new FileWriter("C:/savedata/a.txt", true);// true: 덮어쓰기X 아래에 데이터 추가
			String data = "안녕 오늘 날씨 조왕\r\n";
			fw.write(data);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				fw.close();
				System.out.println("파일이 저장되었습니다.");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
