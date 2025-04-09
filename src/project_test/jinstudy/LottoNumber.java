package project_test.jinstudy;

import java.util.Random;

//로또번호 6자리 중복안되게
public class LottoNumber {
	public static void lottLucky() {
		Random random = new Random();
		
		int a = random.nextInt(45) + 1;
		int b = random.nextInt(45) + 1;
		while (a == b) {
			b = random.nextInt(45) + 1;
		}
		int c = random.nextInt(45) + 1;
		while (c == a || c == b) {
			c = random.nextInt(45) + 1;
		}
		int d = random.nextInt(45) + 1;
		while (d == a || d == b || d == c) {
			d = random.nextInt(45) + 1;
		}
		int e = random.nextInt(45) + 1;
		while (e == a || e == b || e == c || e == d ) {
			e = random.nextInt(45) + 1;
		}
		int f = random.nextInt(45) + 1;
		while (f == a || f == b || f == c || f == d ||  f == e) {
			f = random.nextInt(45) + 1;
		}
		System.out.println("로또번호: " + a + ", " + b + ", " + c + ", " + d + ", " + e + "," + f );
	}
}
