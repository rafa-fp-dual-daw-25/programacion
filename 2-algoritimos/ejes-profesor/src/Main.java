import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Secuencia creciente:

/*        int[] numeros = new int[15];
        int i = 0;
        int num = 0;

        do {
            System.out.println("Número (0 = fin): ");
            num = sc.nextInt();
            numeros[i] = num;
            i++;
        } while (num != 0);

        secuenciaCreciente(numeros);*/

        // Patrones de dígitos:

/*        String numLargo = "";

        do {
            System.out.println("Numero de 10 dígitos (0 = fin): ");
            numLargo = sc.nextLine();

            if (numLargo.equals("0")) {
                System.out.println("Programa finalizado");
                return;
            }

            if (numLargo.length() != 10) {
                System.out.println("El número debe tener exactamente 10 dígitos!");
            }

        } while (numLargo.length() != 10);

        System.out.println("Numero ingresado: " + numLargo);

        patronesDigitos(numLargo);*/

        //Temperaturas diarias:

        int[] temperaturas = new int[31];
        int i = 0;
        int temp;

        do {
            System.out.println("Temperatura dia " + (i + 1) + " (70 = fin): ");
            temp = sc.nextInt();
            if (temp != 70) {
                temperaturas[i] = temp;
                i++;
            }
        } while (temp != 70 && i < 31);

        int racha = rachaCalor(temperaturas, i);
        System.out.println("Racha mas larga >30°C: " + racha + " dias");

        sc.close();
    }

    public static void secuenciaCreciente(int[] arrayNum) {
        int contador = 0;
        int secuencia = 0;

        for (int j = 0; j < arrayNum.length - 1; j++) {
            if (arrayNum[j] < arrayNum[j + 1]) {
                contador++;

            }
            if (arrayNum[j] > arrayNum[j + 1]) {
                if (contador >= 2) {
                    secuencia++;
                }
                contador = 0;
            }
            System.out.println("contador: " + contador + " secuencia: " + secuencia);
        }
    }

    public static void patronesDigitos(String num) {

        int contador = 0;
        int subSec = 0;

        for (int i = 0; i < num.length(); i++) {
            char digitoChar = num.charAt(i);
            int digito = digitoChar - '0';

            if (digito % 2 == 0) {
                contador++;
                if (contador > subSec) {
                    subSec = contador;
                }
            } else {
                contador = 0;
            }
        }
        System.out.println("Secuencia de numeros pares más larga: " + subSec);
    }

    public static int rachaCalor(int[] temps, int dias) {
        int maxRacha = 0;
        int rachaActual = 0;

        for (int j = 0; j < dias; j++) {
            if (temps[j] > 30) {
                rachaActual++;
                if (rachaActual > maxRacha) {
                    maxRacha = rachaActual;
                }
            } else {
                rachaActual = 0;
            }
        }
        return maxRacha;
    }
}
