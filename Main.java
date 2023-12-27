public class Main {
    public static void main (String ... args){
        Forma forma = new Forma();
        Rettangolo quadrato = new Rettangolo();
        Triangolo triangolo = new Triangolo();
        int result = quadrato.calcoloArea();
        System.out.println (result);
        result = triangolo.calcoloArea();
        System.out.println (result);
    }
}
