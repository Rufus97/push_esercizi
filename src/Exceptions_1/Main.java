package Exceptions_1;

//Scrivere una funzione che controlli se un numero int è in un determinato range. Se lo, è ritorna true ; se non lo è, lancia un'eccezione.

public class Main {

	public static void main(String[] args) {
		try {
			int number = 15;
			int min = 1;
			int max = 10;
			if (checkInRange(number, min, max)) {
				System.out.println(number + " è nel range [" + min + ", " + max + "]");
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Il codice ha rivelato un errore : " + e);
		
		} catch (Exception e) {
			System.out.println("Il codice ha rivelato un errore : " + e);
		}

	}

	public static boolean checkInRange(int number, int min, int max) {
		if (number < min || number > max) {
			throw new IllegalArgumentException("Il numero " + number + " non è nel range [" + min + ", " + max + "]");
		}
		return true;
	}

}