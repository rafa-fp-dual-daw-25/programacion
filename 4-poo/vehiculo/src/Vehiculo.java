public abstract class Vehiculo {
    private int ruedas;
    private boolean motor;
    private String color;
    private Conductor conductor;

    public Vehiculo(int ruedas, boolean motor, String color) {
        this.ruedas = ruedas;
        this.motor = motor;
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public void girar() {
    }
}
