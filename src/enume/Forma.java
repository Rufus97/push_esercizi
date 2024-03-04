package enume;
abstract class Forma {
    TipoForma tipoForma;

    // Costruttore
    public Forma(TipoForma tipoForma) {
        this.tipoForma = tipoForma;
    }

    // Metodo astratto per calcolare l'area
    public abstract double calcolaArea();
}