package enume;

class Rettangolo extends Forma {
    double base;
    double altezza;

    public Rettangolo(double base, double altezza) {
        super(TipoForma.RETTANGOLO);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}