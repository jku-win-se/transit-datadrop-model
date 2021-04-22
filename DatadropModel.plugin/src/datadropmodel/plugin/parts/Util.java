package datadropmodel.plugin.parts;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Util {

	private Util() {
		throw new IllegalStateException("Utility class");
	}

	public static Logger getLogger(String className) {

		// add custom logging
		Logger logger = Logger.getLogger(className);
		logger.setUseParentHandlers(false);

		ConsoleHandler handler = new ConsoleHandler();

		LogFormatter formatter = new LogFormatter();
		handler.setFormatter(formatter);

		logger.addHandler(handler);

		logger.setLevel(Level.ALL);

		return logger;
	}
}