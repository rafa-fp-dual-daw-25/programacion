import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(Arrays.toString(desplazaUno(numeros)));

        //2
        int[] total = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        imprimirRandomParesImpares(total);

        //3
        Scanner sc = new Scanner(System.in);
        int[] desordenados = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa el " + i + 1 + "º numero: ");
            desordenados[i] = sc.nextInt();
        }
        Arrays.sort(desordenados);
        System.out.println(Arrays.toString(desordenados));

        //4

    }

    public static int[] desplazaUno(int[] numeros) {
        int ultimo = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;
        return numeros;
    }

    public static void imprimirRandomParesImpares(int[] numeros) {

        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        int[] arrayPares = new int[contadorPares];
        int[] arrayImpares = new int[contadorImpares];

        int p = 0, x = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                arrayPares[p] = numeros[i];
                p++;
            } else {
                arrayImpares[x] = numeros[i];
                x++;
            }
        }
        System.out.println(Arrays.toString(arrayPares));
        System.out.println(Arrays.toString(arrayImpares));
    }
    
}