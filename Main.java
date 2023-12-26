public class Main {
    public static void main (String ... args){
        Forma formaggio = new Forma();
        int area= formaggio.calcoloArea();
        System.out.println("area triangolo " + area);
        Rettangolo formaRettangolare = new Rettangolo();
        area = formaRettangolare.calcoloArea();
        System.out.println(area);

    }
}
