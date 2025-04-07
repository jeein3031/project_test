package project_test.utils;

import java.util.Map;
import project_test.jinstudy.LottoNotRedundant;
import project_test.jinstudy.Calculat;
import project_test.jinstudy.StarPattern;
import project_test.jinstudy.ScannerTest;
import project_test.jinstudy.LogPrint;


public class TestFunctionMap {
   public static final Map<String, Runnable> functionMap = Map.of(
	   "test_001", () -> { StarPattern.add(); },
	   "test_002", () -> { StarPattern.minus(); }, 
	   "test_003", () -> { Calculat.sum(); }, 
	   "test_004", () -> { Calculat.even_odd_sum(); }, 
	   "test_005", () -> { ScannerTest.namePrint(); }, 
	   "test_log", () -> { LogPrint.lognamePrint(); },
	   "test_lotto", () -> { LottoNotRedundant.lottGenerator(); }
   );
}
