public class Consumo {
    private int km;
    private double litros;
    private double vmed;
    private double pgas;

    public Consumo(int km, double litros, double vmed, double pgas) {
        this.km = km;
        this.litros = litros;
        this.vmed = vmed;
        this.pgas = pgas;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getVmed() {
        return vmed;
    }

    public void setVmed(double vmed) {
        this.vmed = vmed;
    }

    public double getPgas() {
        return pgas;
    }

    public void setPgas(double pgas) {
        this.pgas = pgas;
    }

    public double getTiempo() {
        return (double) km / vmed;
    }

    public double consumoMedio() {
        return (double) (litros / km) * 100;
    }

    public double consumoEuros() {
        return consumoMedio() * pgas;
    }
}
