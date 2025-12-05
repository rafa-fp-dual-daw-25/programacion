public class Coche {

    private String modelo;
    private String marca;
    private Motor motor;

    public Coche(String modelo, String marca, Motor motor) {
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
    }

    public Coche(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        this.motor = null;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void arrancar() {
        System.out.println("Arrancando el coche");
        if (motor != null) {
            motor.encender(); // Asociación en acción
        }
    }

    public void detener() {
        System.out.println("Deteniendo el coche");
        if (motor != null) {
            motor.apagar(); // Asociación en acción
        }
    }

}
