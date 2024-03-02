package arrayList_2;

import java.util.ArrayList;
import java.util.Comparator;

//Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//Mettere in ordine la collezione e stampare il risultato
public class Main {
	public static void main(String[] args) {
		// Creazione dell'ArrayList di Studenti
		ArrayList<Student> studenti = new ArrayList<>();
		studenti.add(new Student("manuel", 20));
		studenti.add(new Student("marco", 22));
		studenti.add(new Student("gianni", 21));
		studenti.add(new Student("fabios", 19));
		studenti.add(new Student("fabio", 35));
		studenti.add(new Student("mary", 29));
		studenti.add(new Student("simona", 19));
		studenti.add(new Student("derrik", 21));
		studenti.add(new Student("pasqualone", 20));
		studenti.add(new Student("daniel", 18));
		studenti.add(new Student("alfredone", 34));
		studenti.add(new Student("alessandro", 28));

		System.out.println("ArrayList non ordinato:");
		for (Student giovini : studenti) {
			System.out.println(giovini);
		}

		studenti.sort(Comparator.comparingInt(Student::getAge));
		// Stampare l'ArrayList ordinato
		System.out.println("ArrayList ordinato per età:");
		for (Student giovaniOrdinati : studenti) {
			System.out.println(giovaniOrdinati);
		}
	}
}
