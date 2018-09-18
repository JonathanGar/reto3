package co.com.proyectobase.screenplay.util;

import com.ibm.icu.util.Calendar;

public class CalendarSelector {
	public static String get_xpath_from_day() {
		Calendar now = Calendar.getInstance();
		int today = now.get(Calendar.DATE);
		int tomorrow = today++;
		
		return "";
	}
}
