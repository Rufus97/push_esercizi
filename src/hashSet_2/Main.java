package hashSet_2;
//Scrivere una funzione che restituisca un hashset riempito
//Leggere l'hashSet e stampre grandezza ed elementi
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		Cars auto1 = new Cars("rosso", 4);
		Cars auto2= new Cars("verde", 3);
		Cars auto3= new Cars("blu", 3);
		HashSet<Cars> catalogo = new HashSet<Cars>();
		Cars autoProva= new Cars("giallo",4);
		Cars.riempiCatalogo(catalogo, auto1);
		Cars.riempiCatalogo(catalogo, auto2);
		Cars.riempiCatalogo(catalogo, auto3);
		System.out.println(catalogo.size());
		System.out.println(catalogo);
		Cars.verificaEsistenza(catalogo, autoProva);
	}

		
	}



