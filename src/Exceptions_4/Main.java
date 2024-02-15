package Exceptions_4;

public class Main {
    public static void main(String[] args) {
        int[] divisori = {10, 5, 0, 20};
        int dividendo = 2;
        int index = 12;
        try {
            divisione(divisori, dividendo, index);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void divisione(int[] arrayIn, int number, int index) {
        if (index < 0 || index >= arrayIn.length) {
            throw new ArrayIndexOutOfBoundsException("Indice non presente nell'array: " + index);
        }
        if (arrayIn[index-1]== 0) {
            throw new ArithmeticException("Errore: divisione per zero.");
        }
        int result = arrayIn[index] / number;
        System.out.println("Il risultato della divisione tra " + number + " e "+ arrayIn[index] +" è: " + result);
 
    }
}
