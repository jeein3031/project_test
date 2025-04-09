package project_test.jinstudy;

public class StarPattern {
	public static void add() {
		for(int i = 1; i <= 10; ++i) {
			for(int j = 1; j <= i; ++j) {
            System.out.print("*");
			}
         System.out.println();
		}
	}
	public static void minus() {
		for(int i = 10; i >= 1; --i) {
			for(int j = 1; j <= i; ++j) {
            System.out.print("*");
			}
         System.out.println();
		}
	}
}
