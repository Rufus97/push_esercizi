package Exceptions_2;


public class Main {

    public static void main(String[] args) {
        int number = 22;
        int min = 10;
        int max = 20;
        
        try {
            if (number < min || number > max) {
                throw new IllegalArgumentException("Il numero non è compreso nell'intervallo specificato.");
            } else {
                System.out.println("Il numero è compreso nell'intervallo.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
