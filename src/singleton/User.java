package singleton;


public class User {
    private static User istanza; // istanza unica
    private String nome;
    private int eta;

    // Costruttore privato per impedire la creazione di istanze esterne
    private User(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // Metodo statico per ottenere l'istanza unica della classe User
    public static User getIstanza() {
        if (istanza == null) {
        	istanza = new User("Default", 0); // Valori predefiniti per il primo accesso
        }
        return istanza;
    }

    // Metodo per stampare le informazioni dell'utente
    public void stampaInformazioni() {
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
    }

    // Metodi getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}
