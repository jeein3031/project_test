package project_test.jinstudy;

import java.util.Scanner;

public class ScannerTest {
	public static void namePrint() {
		Scanner in = new Scanner(System.in);
		System.out.print("이름을 입력하세요:");
		String name = in.nextLine();
		System.out.println(name + "입니다");
		in.close();
	}
}
