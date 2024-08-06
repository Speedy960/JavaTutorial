package loggerUtility;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerUtility {

    private static final Logger logger = LogManager.getLogger(LoggerUtility.class);

    public static void info(String message) {
        logger.info(message);
    }

    public static void error(String message) {
        logger.error(message);
    }
}
