package singleton;

public class Main {
    public static void main(String[] args) {
        User user1 = User.getInstance();
        System.out.println("Informazioni per il primo utente:");
        user1.stampaInformazioni();
        User user2 = User.getInstance();
        user2.setNome("Mario");
        user2.setEta(30);
        System.out.println("Informazioni per il secondo utente:");
        user2.stampaInformazioni();
        user1.stampaInformazioni();//boh sono la stessa persona essendo una singleton
    }
}
