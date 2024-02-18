package boxing;

public class Main {

	public static void main(String[] args) {
		int intVal1 = 5;
		int intVal2 = 15;
		double doubleVal = 6.69;
		char charVal = 'A';
		Integer integerVal1 = 6;
		Integer integerVal2 = 16;
		Double doubleeVal = 7.69;
		Character characterVal = 'B';

		stampaSommaint(intVal1, intVal2);
		stampachar(charVal);
		stampaSommaInteger(integerVal1, integerVal2);
		stampaCharacter(characterVal);

		// autoboxing
		Integer boxedInt = intVal1;
		Double boxedDouble = doubleVal;
		Character boxedChar = charVal;

		// unboxing
		int unboxedInt = integerVal1;
		double unboxedDouble = doubleeVal;
		char unboxedChar = characterVal;
	}

	// due int
	public static void stampaSommaint(int a, int b) {
		System.out.println("Somma di " + a + " e " + b + " = " + (a + b));
	}

	// char
	public static void stampachar(char c) {
		System.out.println("Carattere: " + c);
	}

	// due Integer
	public static void stampaSommaInteger(Integer a, Integer b) {
		System.out.println("Somma di " + a + " e " + b + " = " + (a + b));
	}

	// Character
	public static void stampaCharacter(Character c) {
		System.out.println("Carattere: " + c);
	}
}
