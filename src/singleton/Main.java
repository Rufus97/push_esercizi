package singleton;

public class Main {
    public static void main(String[] args) {

        User user1 = User.getIstanza();
        User user2 = User.getIstanza();


        System.out.println("Informazioni di default per il primo utente:");
        user1.stampaInformazioni();
        System.out.println();

        user2.setNome("Alice");
        user2.setEta(25);

        System.out.println("Nuove informazioni per il secondo utente:");
        user2.stampaInformazioni();

    }
}
