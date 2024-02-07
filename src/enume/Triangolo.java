public class Triangolo implements Forma{

    private double base;
    private double altezza;

    public Triangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }

    @java.lang.Override
    public double calcolaArea() {
        double areaTriangolo = base * altezza /2;
        return areaTriangolo;
    }
}
