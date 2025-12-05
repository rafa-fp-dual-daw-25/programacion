public class Avion {

    private int numAsientos;
    private boolean motor = false;
    private int numAsientosDefault = 100;
    private boolean luces = false;

    public Avion(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public Avion() {
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        if(numAsientos < 0){
            this.numAsientos = numAsientosDefault;
        }else{
            this.numAsientos = numAsientos;
        }
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public boolean isLuces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }

    public void despegar(){
        setMotor(true);
        setLuces(true);
        System.out.println("Estamos despegando...!!");
    }

    public void aterrizar(){
        System.out.println("Estamos aterrizando...!!");
        setMotor(false);
        setLuces(false);
    }
}