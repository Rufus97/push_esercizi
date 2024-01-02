class Rettangolo implements Forma {
    protected double base = 10;
    protected double altezza = 1;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double calcolaArea() {
        return this.base * this.altezza;
    }
}

