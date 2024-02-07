public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(5,10);
        Triangolo triangolo1 = new Triangolo(3,3);

        System.out.println(rettangolo1.calcolaArea());
        System.out.println(triangolo1.calcolaArea());
    }
}