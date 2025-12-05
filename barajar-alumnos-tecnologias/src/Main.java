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

        String[] tecnologias = {
                "Java", "Python", "JavaScript", "C#", "Go", "Rust",
                "SQL", "NoSQL", "Docker", "AWS", "Azure", "GCP",
                "Redis", "Memcached", "GraphQL", "REST", "GitHub Actions"
        };

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // Barajar el array de nombres
        for (int i = nombres.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            String temp = nombres[i];
            nombres[i] = nombres[j];
            nombres[j] = temp;
        }

        // Barajar el array de tecnologías
        for (int i = tecnologias.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            String temp = tecnologias[i];
            tecnologias[i] = tecnologias[j];
            tecnologias[j] = temp;
        }

        // Imprimir emparejamientos
        for (int i = 0; i < Math.min(nombres.length, tecnologias.length); i++) {
            System.out.println(nombres[i] + " está emparejado con: " + tecnologias[i]);
        }

        // Si quedan nombres sin tecnología
        if (nombres.length > tecnologias.length) {
            for (int i = tecnologias.length; i < nombres.length; i++) {
                System.out.println(nombres[i] + " no tiene tecnología asignada.");
            }
        } else if (tecnologias.length > nombres.length) {
            for (int i = nombres.length; i < tecnologias.length; i++) {
                System.out.println(tecnologias[i] + " no tiene persona asignada.");
            }
        }

        sc.close();
    }
}