package enume;


class Triangolo extends Forma {
    double base;
    double altezza;

    public Triangolo(double base, double altezza) {
        super(TipoForma.TRIANGOLO);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return (base * altezza) / 2;
    }
}
