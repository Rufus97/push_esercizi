package Testing_3;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        OffsetDateTime dataISO = OffsetDateTime.parse(data);
        

        DateTimeFormatter dataLong = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        System.out.println("Data formattata: " + dataISO.format(dataLong));
    }
}

