package project_test.jinstudy;
import java.util.Random;

//로또6번호 중복 안되게(이거는 이해를 못함..그냥 일단 해봄)
public class LottoNotRedundant {
	public static void lottGenerator() {
		int[] lotto = new int[6];
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			int number = random.nextInt(45) + 1;
			System.out.println("random number: " + number);
			boolean duplicated = false;
			for (int j = 0; j < i; j++){
				if (lotto[j] == number) {
					duplicated = true;
					break;
				}
			}
			if (duplicated) {
				i--;
			} else {
				lotto[i] = number;
			}		
		}
		System.err.print("로또 번호:");
		for (int n : lotto) {
			System.out.print(n + " ");
		}		
	}
}
