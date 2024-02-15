package hashSet_3;

//Scrivere una funzione che restituisca un hashset riempito
//Leggere l'hashSet e stampre grandezza ed elementi
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		HashSet<Cars> catalogo = new HashSet<Cars>();
		Cars autoProva = new Cars("verde", 3);
		Cars.riempiCatalogo(catalogo, new Cars("rosso", 4));
		Cars.riempiCatalogo(catalogo, new Cars("verde", 3));
		Cars.riempiCatalogo(catalogo, new Cars("blu", 2));
		System.out.println(catalogo.size());
		System.out.println(catalogo);
		Cars.riempiCatalogo(catalogo, autoProva);
		Cars.verificaEsistenza(catalogo, autoProva);
		Cars.riempiCatalogo(catalogo, autoProva);
	}

}
