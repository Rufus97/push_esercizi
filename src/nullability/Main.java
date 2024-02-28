package nullability;

public class Main {
	public static void main(String[] args) {
		System.out.println("Prima divisione: ");
		try {
			Integer numeratore1 = 10;
			Integer denominatore1 = null;
			divisione(numeratore1, denominatore1);
		} catch (ArithmeticException e) {
			System.out.println("Errore: " + e.getMessage());
		}

		System.out.println("Seconda divisione: ");
		try {
			Integer numeratore2 = 10;
			Integer denominatore2 = 3;
			divisione(numeratore2, denominatore2);
		} catch (ArithmeticException e) {
			System.out.println("Errore: " + e.getMessage());
		}
	}

	public static void divisione(Integer numeratore, Integer denominatore) {
		if (denominatore == null | numeratore == null) {
			throw new ArithmeticException("Non è possibile effettuare la divisione con null");
		}

		int risultato = numeratore / denominatore;
		System.out.println("Il risultato della divisione è: " + risultato);
	}
}