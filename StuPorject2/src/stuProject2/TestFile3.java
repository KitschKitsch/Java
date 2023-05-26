package stuProject2;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestFile3 {

	public static void main(String[] args) {

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("C:/data/student.txt"));// 파일을 버퍼로 읽을꺼야
			while (true) {
				String data = br.readLine();// 한 줄씩 읽어오기!(한글자씩 말고)

				if (data == null)
					break;

				System.out.println(data);

				String[] dataArr = data.split(",");// ,(쉼표)로 분리
				int stuNo = Integer.parseInt(dataArr[0]);
				String name = dataArr[1];
				int kor = Integer.parseInt(dataArr[2]);
				int eng = Integer.parseInt(dataArr[3]);
				int math = Integer.parseInt(dataArr[4]);
				// new Student(dataArr[0]...[4]); = 1001,홍길동,100,100,99;
			}

			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
