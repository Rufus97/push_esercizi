import javax.xml.namespace.QName;

public class Main {
    public static void main (String [] Args){
        Students studente = new Students ("Manuel", "Gomez",22);

        System.out.println(studente.getName());
        System.out.println(studente.getSurname());
        System.out.println(studente.getId());
//studente.setName("Mario");
//        System.out.println(studente.getName());

    }
}
