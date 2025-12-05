import java.util.Scanner;

public class EjeRepaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Sistema de Aterrizaje Asistido (Aterrizaje en Múltiples Pistas)

        System.out.println("Indique la pista de aterrizaje: ");
        int pista = sc.nextInt();

        if (pista > 5) {
            do {
                System.out.println(pista + " no es un numero de pista válido.");
                System.out.println("Indique la pista de aterrizaje: ");
                pista = sc.nextInt();
            } while (pista > 5);
        }

        if (pista >= 1 && pista <= 5) {
            System.out.println("Aterrizaje seguro!");
        } else if (pista < 1) {
            System.out.println("Aterrizaje cancelada!");
        }

        //2. Control de Nivel de Oxígeno
    }
}