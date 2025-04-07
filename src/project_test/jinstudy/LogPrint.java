package project_test.jinstudy;
import java.util.logging.Logger;

public class LogPrint {
	private static final Logger logger = Logger.getLogger(LogPrint.class.getName());
	public static void lognamePrint() {
		logger.info("로그 찍기 성공!");
		logger.warning("주의가 필요한 로그입니다");
		logger.severe("심각한 오류발생");
    }
}
