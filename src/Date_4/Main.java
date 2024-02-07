 package Date_4;
import java.time.OffsetDateTime;

public class Main {

    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        OffsetDateTime dataISO = OffsetDateTime.parse(data);
        
        int anno = dataISO.getYear();
        int mese = dataISO.getMonthValue();
        int giorno = dataISO.getDayOfMonth();
        String giornoSettimana = dataISO.getDayOfWeek().toString();


        System.out.println("Anno; " + anno);
        System.out.println("Mese: " + mese);
        System.out.println("Giorno: " + giorno);
        System.out.println("Giorno della settimana: " + giornoSettimana);
    }
}
