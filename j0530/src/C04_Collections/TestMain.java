package C04_Collections;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) throws Exception {

		// 객체선언
		TestFile t = new TestFile();
//		t.fileSave();// 파일저장메소드
//		t.fileRead();// 파일읽기메소드

		ArrayList<Student> list = new ArrayList<>();
		list = t.fileRead();

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getName()+"\t");
		}
	}

}
