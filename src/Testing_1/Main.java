package Testing_1;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

	public static void main(String[] args) {
		String data = "2002-03-01T13:00:00+02:00";

		ZonedDateTime dataISO = OffsetDateTime.parse(data).atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
		DateTimeFormatter dataLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dataMedium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateTimeFormatter dataShort = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

		System.out.println("Data formattata (SHORT): " + dataISO.format(dataShort));
		System.out.println("Data formattata (MEDIUM): " + dataISO.format(dataMedium));
		System.out.println("Data formattata (LONG): " + dataISO.format(dataLong));
	}

}