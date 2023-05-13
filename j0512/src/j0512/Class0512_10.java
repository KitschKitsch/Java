package j0512;

import java.util.Arrays;
import java.util.Collections;

public class Class0512_10 {

	public static void main(String[] args) {
		// 배열 정렬
		
		int[] arr = {1,11,23,45,2,3,9,5};
		Integer[] arr2 = {1,11,23,45,2,3,9,5};//Integer객체
		
		Arrays.sort(arr);//오름차순
		Arrays.sort(arr2, Collections.reverseOrder());//내림차순은 Integer객체만 가능
		
		//단순 for문으로 출력(배열만 가능)
		System.out.print("오름차순: ");
		for (int i:arr) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		System.out.print("내림차순: ");
		for (int i:arr2) {
			System.out.print(i +" ");
		}
	}

}
