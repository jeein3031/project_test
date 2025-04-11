package project_test.utils;
import java.util.HashMap;



import java.util.Map;
import project_test.codetest.UtilTest;
import project_test.jinstudy.Calculat;
import project_test.jinstudy.ChoiceCase;
import project_test.jinstudy.LogPrint;
import project_test.jinstudy.LottoNotRedundant;
import project_test.jinstudy.LottoNumber;
import project_test.jinstudy.Lunch;
import project_test.jinstudy.ScannerTest;
import project_test.jinstudy.StarPattern;
import porject_test.jinstydy.DataJson;






public class TestFunctionMap {	
	 public static final Map<String, Runnable> functionMap = new HashMap<>();
	 static {
		 functionMap.put("test_001", () -> { StarPattern.add(); });
		 functionMap.put("test_002", () -> { StarPattern.minus(); });
		 functionMap.put("test_003", () -> { Calculat.sum(); });
		 functionMap.put("test_004", () -> { Calculat.even_odd_sum(); });
		 functionMap.put("test_005", () -> { ScannerTest.namePrint(); });
		 functionMap.put("test_log", () -> { LogPrint.lognamePrint(); });
		 functionMap.put("test_lotto", () -> { LottoNotRedundant.lottGenerator(); });
		 functionMap.put("test_lottolucky", () -> { LottoNumber.lottLucky(); });
		 functionMap.put("todayMenu", () -> { Lunch.LunchMenu(); });
		 functionMap.put("test_switch", () -> { ChoiceCase.casecolor(); });
		 functionMap.put("test_util", () -> { UtilTest.codetest(); });
		 functionMap.put("test_Json", () -> {DataJson.printJson(); });
		 
	 }		  
}
