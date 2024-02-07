package Testing_5;

import java.time.OffsetDateTime;

public class Main {
	

	public static int addYear(OffsetDateTime dataISO,int input) {
		return dataISO.getYear()+input;
	}

	public static int addMonth(OffsetDateTime dataISO,int input) {
		return dataISO.getMonthValue()+input;
	}

	public static int addWeek(OffsetDateTime dataISO,int input) {
        return dataISO.getDayOfMonth()+input*7;
	}
	
	
}