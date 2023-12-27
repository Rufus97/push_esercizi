class Rettangolo extends Forma{
    private double base=10;
    private double altezza=1;
    public Rettangolo(double base1, double altezzoso){
        this.base=base1;
        this.altezza=altezzoso;
    }
    public double calcolaArea(){
        return this.base*this.altezza;

    }
}

