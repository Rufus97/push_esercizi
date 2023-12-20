import javax.xml.namespace.QName;

public class Main {
    public static void main (String [] Args){
        Students studente1 = new Students ("Manuel", "Gomez",22);

        System.out.println(studente1.getName());
        System.out.println(studente1.getSurname());
        System.out.println(studente1.getId());
        System.out.println(studente1);
    }
}
