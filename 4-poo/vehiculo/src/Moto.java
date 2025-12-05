public class Moto extends Vehiculo {

    private boolean manillar = true;

    public Moto(int ruedas, boolean motor, String color) {
        super(ruedas, motor, color);
    }

    public Moto(int ruedas, boolean motor, String color, boolean manillar) {
        super(ruedas, motor, color);
        this.manillar = manillar;
    }

    public boolean isManillar() {
        return manillar;
    }

    public void setManillar(boolean manillar) {
        this.manillar = manillar;
    }

    @Override
    public void girar() {
        if (manillar) {
            System.out.println("Estoy girando el manillar");
        } else {
            System.out.println("No puede girar, le falta el manillar");
        }
    }
}
