package datadropmodel.plugin.parts;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class LogFormatter extends Formatter {
	// ANSI escape code
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	// Here you can configure the format of the output and
	// its color by using the ANSI escape codes defined above.

	// format is called for every console log message
	@Override
	public String format(LogRecord pRecord) {
		// This example will print date/time, class, and log level in yellow,
		// followed by the log message and it's parameters in white .
		var builder = new StringBuilder();

		builder.append("[");
		builder.append(calcDate(pRecord.getMillis()));
		builder.append("]");

		builder.append(" [");
		builder.append(pRecord.getSourceClassName());
		builder.append("]");

		builder.append(" [");
		builder.append(pRecord.getLevel().getName());
		builder.append("]");

		builder.append(" - ");
		builder.append(pRecord.getMessage());

		Object[] params = pRecord.getParameters();

		if (params != null) {
			builder.append("\t");
			for (var i = 0; i < params.length; i++) {
				builder.append(params[i]);
				if (i < params.length - 1)
					builder.append(", ");
			}
		}

		builder.append("\n");
		return builder.toString();
	}

	private String calcDate(long millisecs) {
		var dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		var resultdate = new Date(millisecs);
		return dateFormat.format(resultdate);
	}
}