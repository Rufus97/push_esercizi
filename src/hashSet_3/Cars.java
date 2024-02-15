package hashSet_3;

import java.util.HashSet;

//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato
public class Cars {
	public String colore;
	public int ruote;

	public Cars(String colore, int ruote) {
		super();
		this.colore = colore;
		this.ruote = ruote;
	}

	public static void riempiCatalogo(HashSet<Cars> catalogo, Cars sample) {
		catalogo.add(sample);
	}

	public static void verificaEsistenza(HashSet<Cars> catalogo, Cars entita) {
		if (!catalogo.contains(entita)) {
			System.out.println("Auto non presente");
		} else {
			catalogo.remove(entita);
			System.out.println("L'auto " + entita + " si ripete");

		}

	}

	@Override
	public String toString() {
		return "Cars [colore=" + colore + ", ruote=" + ruote + "]";
	}

//	public static void controlloHash(Cars check) {
//
//	}

}
