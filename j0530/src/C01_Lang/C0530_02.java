package C01_Lang;

import java.io.File;
import java.util.Scanner;

public class C0530_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String domain = "https://forum.nexon.com";
		String url = "https://forum.nexon.com/asgard/";

		String[] files = { "fifamobile", "asgard", "GodzillaDF", "csonline" };

		String input = url.substring(domain.length() + 1, url.length() - 1);
		System.out.println("파일명: " + input);
		input = scan.next();

		// for문 & if문
		for (int i = 0; i < files.length; i++) {
			if (input.equalsIgnoreCase(files[i])) {
				System.out.printf("files 배열에 %d에 있습니다. \n", i);
			}
		}

		// if문
		if (input.equalsIgnoreCase(files[0])) {
			System.out.printf("fifalmoboile 페이지");
		} else if (input.equalsIgnoreCase(files[1])) {
			System.out.println("asgard 페이지");
		} else if (input.equalsIgnoreCase(files[2])) {
			System.out.println("GodzillaDF 페이지");
		} else if (input.equalsIgnoreCase(files[3])) {
			System.out.println("csonline 페이지");
		}

		// switch문
		switch (input) {
		case "fifalmobile":
			System.out.println("fifalmoboile 페이지");
			break;
		case "asgard":
			System.out.println("asgard 페이지");
			break;
		case "GodzillaDF":
			System.out.println("GodzillaDF 페이지");
			break;
		case "csonline":
			System.out.println("csonline 페이지");
			break;
		}

	}

}
