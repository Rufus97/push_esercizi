package Testing_1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

class test {

    @Test
    public void testParsingData() {
        String data = "2002-03-01T13:00:00+02:00";
        ZonedDateTime dataISO = OffsetDateTime.parse(data).atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        assertNotNull(dataISO);
	}

}
