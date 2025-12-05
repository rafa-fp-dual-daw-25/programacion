public class Finanzas {
    private double cambio;

    public Finanzas() {
        this.cambio = 1.36;
    }

    public Finanzas(double cambio) {
        this.cambio = cambio;
    }

    public double dolaresToEuros(double dolares) {
        return (double) dolares / cambio;
    }

    public double eurosToDolares(double euros) {
        return (double) euros * cambio;
    }
}
