package C01_Exception;

public class C0526_01 {

	public static void main(String[] args) {

		Exception e1 = new Exception("고의로 예외 발생");

		System.out.println("[ 프로그램 시작 ]");
		try {
			System.out.println("파일 복사 시작");
			System.out.println("파일 복사 진행 중...");
			// throw e1;
			// System.out.println(0 / 0);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {// 에러유무에 상관없이 항상 실행할 구문!
			System.out.println("파일 종료");

		}
		System.out.println("[ 프로그램 종료 ]");
	}

}
