import java.util.Scanner;

public class Romani {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();
        String numeroConvertito = conversione(numero);
        System.out.println("Il numero romano è: " + numeroConvertito);
        scanner.close();
        System.out.println();
    }
    public static String conversione(int numeroInput) {
        String numeroConvertito = "";
        String[] numeriRomani = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] numeriArabi = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        for (int i = numeriRomani.length - 1; i >= 0; i--) {
            while (numeroInput >= numeriArabi[i]) {
                numeroConvertito += numeriRomani[i];
                numeroInput -= numeriArabi[i];
            }
        }

        return numeroConvertito;
    }
}
