package C04_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class C0530_06 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);// 0 | 0
		list.add(2);// 1 | 1
		list.add(3);// 2 | 2
		list.add(4);// 3 | 삭제
		list.add(5);// 4 | 3
		list.add(6);// 5 | 4
		list.add(7);// 6 | 5

		// list.remove(3);// 3번째 삭제되면서 자리 당겨옴
		// list.remove(3);

		// Iterator로 출력(Enumeration-구버전). 중복코드 있어도 한번만 출력됨!
		Iterator it = list.iterator();// 컬렉션을 읽어오는 객체

		while (it.hasNext()) {// 데이터가 있는지 확인(안하면 에러남!)
			System.out.println(it.next());// 1개의 데이터를 가져옴
		}

		/*
		 * // 기본형 타입은 형변환 없이 바로 출력 가능! for (int i = 0; i < list.size(); i++) {
		 * System.out.println(list.get(i)); }
		 * 
		 * // 전체삭제 for (int i = list.size() - 1; i >= 0; i--) { list.remove(i); }
		 * 
		 * // 출력 for (int i = 0; i < list.size(); i++) {
		 * System.out.println(list.get(i)); }
		 * 
		 * System.out.println(list.size());
		 */

	}

}
