import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        Coche c = new Coche(4, true, "Rojo", 4);
        Moto m = new Moto(2, true, "Azul");
        Moto m2 = new Moto(2, true, "Rojo", false);
        Conductor conductor = new Conductor(47, "Pablo");

        vehiculos.add(c);
        vehiculos.add(m);
        vehiculos.add(m2);

        for (Vehiculo v : vehiculos) {
            conductor.addVehiculos(v);
            v.setConductor(conductor);
            System.out.println(v.getConductor().getNombre());
        }

        System.out.println(conductor);

    }

}