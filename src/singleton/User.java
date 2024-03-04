package singleton;

public class User {
    private String nome;
    private int eta;
    private static User instance = null;

    private User() {
        this.nome = "Default";
        this.eta = 0;
    }

    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

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

    public void stampaInformazioni() {
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
    }
}
