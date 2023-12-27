//Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo astratto chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed implementano il metodo per il calcolo dell'area
// in maniera specifica.

public class Main {
    public static void main (String ... args){
        Rettangolo formaRettangolare = new Rettangolo(2.5,1.3);
        double area= formaRettangolare.calcolaArea();
       // Forma forma = new Forma();
          int return1 = Forma.cavallo()   ;
        System.out.println(return1);
    }
}

