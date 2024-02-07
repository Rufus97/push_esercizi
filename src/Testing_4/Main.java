package Testing_4;

import java.time.OffsetDateTime;

public class Main {

    public static int getYear(OffsetDateTime dataISO) {
        return dataISO.getYear();
    }

    public static int getMonth(OffsetDateTime dataISO) {
        return dataISO.getMonthValue();
    }

    public static int getDay(OffsetDateTime dataISO) {
        return dataISO.getDayOfMonth();
    }

    public static String getDayOfWeek(OffsetDateTime dataISO) {
        return dataISO.getDayOfWeek().toString();
    }
}