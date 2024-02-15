package arrayList_1;

import java.util.ArrayList;
import java.util.List;

//Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
public class Main {

	public static void main(String[] args) {
		List<Student> studenti = new ArrayList<Student>();
		studenti.add(new Student("manuel", 26));
		System.out.println(studenti);
		studenti.add(new Student("gianni", 26));
		studenti.add(new Student("alfredo", 22));
		studenti.add(new Student("fabio", 21));
		studenti.add(new Student("marco", 19));
		System.out.println(studenti);

	}

}
