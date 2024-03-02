package linkedList;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<Fruit> frutti = new LinkedList<>();

		frutti.add(new Fruit("Mela"));
		frutti.add(new Fruit("Banana"));
		frutti.add(new Fruit("Arancia"));

		System.out.println("Lista originale:");
		printFrutti(frutti);

		frutti.addFirst(new Fruit("Limone"));

		frutti.addLast(new Fruit("Ananas"));

		System.out.println("\nLista aggiornata:");
		printFrutti(frutti);
	}

	public static void printFrutti(LinkedList<Fruit> frutti) {
		for (Fruit fruttis : frutti) {
			System.out.println(fruttis.getName());
		}
	}
}