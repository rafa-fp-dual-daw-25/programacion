import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Coche> listaCoches = new ArrayList<>();

        Motor motorDiesel = new Motor(1000, 2);
        Motor motorGasolina = new Motor(1200, 8);

        Coche coche1 = new Coche("Golf", "Volkswagen", motorDiesel);
        Coche coche2 = new Coche("Focus", "Ford", motorDiesel);
        Coche coche3 = new Coche("Civic", "Honda", motorGasolina);
        Coche coche4 = new Coche("Model S", "Tesla");


        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);
        listaCoches.add(coche4);

        for (Coche coche : listaCoches) {
            if (coche.getMotor() == null) {
                coche.setMotor(motorGasolina);
                System.out.println("Motor añadido a: " + coche.getMarca() + " " + coche.getModelo());
            }
        }

        System.out.println("\n=== Punto 14: ENCENDER todos los coches ===");
        for (Coche coche : listaCoches) {
            System.out.print(coche.getMarca() + " " + coche.getModelo() + ": ");
            coche.arrancar();
            System.out.println();
        }

        System.out.println("\n=== Punto 15: DETENER todos los coches ===");
        for (Coche coche : listaCoches) {
            System.out.print(coche.getMarca() + " " + coche.getModelo() + ": ");
            coche.detener();
            System.out.println();
        }
    }
}