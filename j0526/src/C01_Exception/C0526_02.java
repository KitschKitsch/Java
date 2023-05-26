package C01_Exception;

import java.io.File;
import java.io.FileWriter;

public class C0526_02 {

	public static void main(String[] args) {

//		File dir = new File("c:/bbb");
//		dir.mkdirs();// 폴더생성 메소드
//		System.out.println("폴더 생성");
//		
//		File f = new File("c:/bbb/test.txt");
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("파일을 생성합니다.");

		FileWriter fw = null;
		String str = "";
		try {
			fw = new FileWriter("c:/bbb/test.txt");
			for (int i = 0; i < 10; i++) {
				str = str + "글자 저장 \r\n";// \r제일 마지막에서 \n줄바꿈
			}
			fw.write(str);// 글자저장메소드
			fw.flush();// 버퍼(중간저장소, 임시저장소)에 있는 모든것 저장

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("글자가 저장되었습니다.");
	}

}
