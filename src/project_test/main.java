package project_test;


import project_test.utils.TestFunctionMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println(">>사용 가능한 테스트: test_001, test_log, test_switch, todayMenu 등"); //이거추가
		System.out.print("[TEST] 입력한 테스트를 수행합니다 : ");
		String test_function = inputScanner.nextLine();
		Runnable runnable = TestFunctionMap.functionMap.getOrDefault
			(test_function, 
			() -> System.out.println("[TEST] 해당하는 ㅔㅌ스트 함수가 없습니다.")
		);
		runnable.run();
				
//		((Runnable)TestFunctionMap.functionMap.getOrDefault(test_function, () -> {
//				System.out.println("[TEST] 해당하는 테스트 함수가 없습니다.");
//		})).run();
   }
}
