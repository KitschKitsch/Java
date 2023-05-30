package C04_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class C0530_07 {

	public static void main(String[] args) {

		// List - ArrayList <순서O, 중복O>
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("abc");
		list.add("bbb");
		list.add("aaa");

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------");

		// 불편한 Iterator 대신 for문으로!
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------");

		// Set - HashSet <순서X, 중복X>
		HashSet hs = new HashSet();

		hs.add("abc");
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		hs.add("abc");
		hs.add("bbb");
		hs.add("aaa");

		Iterator it2 = hs.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("---------");
		
	}

}
