package Exceptions_2;

//Scrivere una funzione che controlli se un carattere è un numero, altrimenti lanciare una eccezione.

public class Main {

	public static void main(String[] args) {
		try {
			char test = '3';
			if (checkChar(test)) {
				System.out.println(test + " Non è un numero");
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Il codice ha rivelato un errore : " + e);
		
		} catch (Exception e) {
			System.out.println("Il codice ha rivelato un errore : " + e);
		}

	}

	public static boolean checkChar(char input) {
		if !(input >='0' && input <= '9') {
			throw new IllegalArgumentException("Il carattere" + input + " è un numero");
		}
		return true;
	}

}