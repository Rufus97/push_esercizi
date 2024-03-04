package enume;

public class Main {
    public static void main(String[] args) {

        Triangolo triangolo = new Triangolo(5, 3);
        System.out.println("Area del triangolo: " + triangolo.calcolaArea());


        Rettangolo rettangolo = new Rettangolo(4, 6);
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
    }
}