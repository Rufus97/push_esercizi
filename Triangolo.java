class Triangolo implements Forma{
protected double lato;
protected double altezza;
    public Triangolo(double lato, double altezza){
        this.lato = lato;
        this.altezza = altezza;
    }
    @java.lang.Override
    public double calcolaArea() {
        return this.lato*this.altezza/2;
    }




}

