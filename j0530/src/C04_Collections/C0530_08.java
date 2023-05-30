package C04_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C0530_08 {

	public static void main(String[] args) {

		// List - ArrayList <순서O 중복O>
		ArrayList list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println(list.get(0));
		System.out.println("----------");

		Iterator it2 = list.iterator();// for문 추천..!
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("----------");

		// Map - HashMap <순서X 중복△(키X 값O)>
		HashMap map = new HashMap();
		map.put("id", "aaa");
		map.put("list", "data");
		map.put("no", "1");
		map.put("lastNo", "100");
		map.put("id", "bbb");
		System.out.println(map.get("id"));// 중복허용안됨!
		System.out.println("----------");

		Iterator it = map.entrySet().iterator();// entrySet에서 iterator 불러와야함;;;
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------");

	}

}
