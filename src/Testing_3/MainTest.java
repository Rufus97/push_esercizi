package Testing_3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.OffsetDateTime;

import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void testFormatting() {
    	  String data = "2023-03-01T13:00:00Z";
          OffsetDateTime dataISO = OffsetDateTime.parse(data);
          

          DateTimeFormatter dataLong = DateTimeFormatter.ofPattern("dd MMMM yyyy");
          String dataTest= dataISO.format(dataLong);

          System.out.println("Data formattata: " + dataISO.format(dataLong));
          assertEquals("01 marzo 2023",dataTest);
	}

}
