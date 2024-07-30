package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utilisaire Date.
 */
public class DateUtils {
	private static final String DATE_PATTERN = "dd/MM/yyyy HH:mm:ss";

	/**
	 * Format string date with pattern.
	 *
	 * @param pattern the pattern
	 * @param date    the date
	 * @return the string
	 */
	public static String format(String pattern, Date date) {
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}

	/**
	 * Format string date with defaut pattern.
	 *
	 * @param date the date
	 * @return the string
	 */
	public static String formatDefaut(Date date) {
        return format(DATE_PATTERN, date);
	}
}
