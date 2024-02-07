package Testing_4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.time.OffsetDateTime;

public class MainTest {
	
    OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    public void testPrintYear() {
        assertEquals(2023, Main.getYear(data));
    }

    @Test
    public void testPrintMonth() {
        assertEquals(3, Main.getMonth(data));
    }

    @Test
    public void testPrintDay() {
        assertEquals(1, Main.getDay(data));
    }

    @Test
    public void testPrintDayOfWeek() {
        assertEquals("WEDNESDAY", Main.getDayOfWeek(data));
    }
}