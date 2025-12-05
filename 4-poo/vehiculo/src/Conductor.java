import java.util.ArrayList;

public class Conductor {
    private int edad;
    private String nombre;
    public ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public Conductor(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void addVehiculos(Vehiculo v) {
        this.vehiculos.add(v);
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", vehiculos=" + vehiculos.size() +
                '}';
    }
}
