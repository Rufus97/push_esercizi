public class Rettangolo implements Forma{

    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }
    @java.lang.Override
    public double calcolaArea() {
        double areaRettangolo = base * altezza;
        return areaRettangolo;
    }
}
