package Exceptions_3;

public class Main {
    public static void main(String[] args) {
    	int dividendo = 0;
    	int input = 100;
        try {
            divisionePer(dividendo,input);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static void divisionePer(int numero, int input) {
        if (numero == 0) {
            throw new ArithmeticException("Divisione per zero non consentita");
        }
        int risultato = input / numero;
        System.out.println("Il risultato della divisione è: " + risultato);
    }
}
