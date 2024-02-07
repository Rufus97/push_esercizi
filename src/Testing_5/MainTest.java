package Testing_5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.time.OffsetDateTime;

public class MainTest {

	OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

	@Test
	public void testAddYear() {
		assertEquals(2024, Main.addYear(data, 1));
	}

}