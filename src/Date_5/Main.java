package Date_5;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Main {

	public static void main(String[] args) {
		String data1 = "2023-03-01T13:00:00Z";
		String data2 = "2024-03-01T13:00:00Z";
		OffsetDateTime dataAttuale = OffsetDateTime.now(ZoneOffset.UTC);
		OffsetDateTime dataIn1 = OffsetDateTime.parse(data1);
		OffsetDateTime dataIn2 = OffsetDateTime.parse(data2);
		

		boolean condizione1 = dataIn1.isBefore(dataIn2);
		boolean condizione2 = dataIn2.isAfter(dataIn1);
		boolean primaDataUgualeOra = dataIn1.isEqual(dataAttuale);
		boolean secondaDataUgualeOra = dataIn1.isEqual(dataAttuale);

		System.out.println("La prima data è precedente alla seconda? " + condizione1);
		System.out.println("La seconda data è successiva alla prima? " + condizione2);
		System.out.println("La prima data è uguale all'ora attuale? " + primaDataUgualeOra);
		System.out.println("La seconda data è uguale all'ora attuale? " + secondaDataUgualeOra);

	}
}
