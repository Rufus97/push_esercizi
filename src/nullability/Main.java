package nullability;

public class Main {
    public static void main(String[] args) {
        // Blocco 1: Utilizzo della funzione con numeratore e denominatore validi
        try {
            int numeratore1 = 10;
            int denominatore1 = 2;
            divisione(numeratore1, denominatore1);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
        
        // Blocco 2: Utilizzo della funzione con denominatore uguale a zero
        try {
            int numeratore2 = 10;
            int denominatore2 = 0;
            divisione(numeratore2, denominatore2);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static void divisione(int numeratore, int denominatore) {
        // Controllo se il denominatore è zero
        if (denominatore == null) {
            throw new ArithmeticException("Divisione per zero non consentita");
        }

        // Esegue la divisione
        int risultato = numeratore / denominatore;
        System.out.println("Il risultato della divisione è: " + risultato);
    }
}

