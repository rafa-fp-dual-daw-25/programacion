public class Coche extends Vehiculo {
    private int puertas;

    public Coche(int ruedas, boolean motor, String color, int puertas) {
        super(ruedas, motor, color);
        this.puertas = puertas;

    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public void girar() {
        System.out.println("Estoy girando el volante");
    }


}
