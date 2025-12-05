import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] nombres = {
                "Ruben Dario Anzola Sánchez",
                "David Arranz González",
                "Alexei Benitez Ortega",
                "Juan Gabriel Callejo Vidal",
                "Marcos Cordeiro Paz",
                "Noelia Costas Piñeiro",
                "Natasha da Silva Fernandes",
                "Izzan Fernández Lareu",
                "Candela Fernández Lombar",
                "José Argenis García Valderrama",
                "Lorena Goberna Milego",
                "Castor Gonzalez de Araujo",
                "Ángel Iglesias Martínez",
                "Rafael Mendoza Ferreira",
                "Carolina Míguez Baquero",
                "Yelena Pazos Gonzalez",
                "Santiago Pérez Carral",
                "Francisco Javier Rodríguez Suarez",
                "Gabriel Villar Fernández"
        };

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // Barajar el array
        for (int i = nombres.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            String temp = nombres[i];
            nombres[i] = nombres[j];
            nombres[j] = temp;
        }

        // Imprimir parejas
        for (int i = 0; i < nombres.length; i += 2) {
            if (i == nombres.length - 1) {
                // Si queda uno solo al final
                int pareja = rand.nextInt(nombres.length - 1);
                System.out.println("⚠ Queda sin pareja: " + nombres[i]);
                System.out.println(nombres[i] + " se une a -> " + nombres[pareja]);
            } else {
                System.out.println(nombres[i] + " ---- " + nombres[i + 1]);
                sc.nextLine();
            }
        }

        sc.close();

    }
}


