import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        numerosEntre();
//        numerosImparesEntre();
//        numerosEntreCantidad();
//        numerosHastaTresMil();

        System.out.println("Escribe tu DNI: ");
        String dni = sc.next();
        if (validarDni(dni)) {
            System.out.println("DNI válido");
        } else {
            System.out.println("DNI inválido - revisalo.");
        }

    }

    public static void numerosEntre() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa dos números para imprimir los números que estén entre ambos.");
        int num1, num2;

        do {
            System.out.println("==========================");
            System.out.println("Ingresa el primero número: ");
            num1 = sc.nextInt();
            System.out.println("Ingresa el segundo número: ");
            num2 = sc.nextInt();

            int numIni = Math.min(num1, num2);
            int numFin = Math.max(num1, num2);

            if (num1 == num2) {
                System.out.println("Los números son iguales.");
            } else {
                System.out.println("Números entre " + numIni + " y " + numFin + ".");
                System.out.println("==========================");
                for (int i = numIni + 1; i < numFin; i++) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } while (num1 != num2);

        sc.close();
    }

    public static void numerosImparesEntre() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa dos números para imprimir los números IMPARES que estén entre ambos.");
        int num1, num2;

        do {

            System.out.println("==========================");
            System.out.println("Ingresa el primero número: ");
            num1 = sc.nextInt();
            System.out.println("Ingresa el segundo número: ");
            num2 = sc.nextInt();

            int numIni = Math.min(num1, num2);
            int numFin = Math.max(num1, num2);

            if (num1 == num2) {
                System.out.println("Los números son iguales.");
            } else {
                System.out.println("Números IMPARES entre " + numIni + " y " + numFin + ".");
                System.out.println("==========================");
                for (int i = numIni + 1; i < numFin; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
        } while (num1 != num2);

        sc.close();
    }

    public static void numerosEntreCantidad() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa dos números para contar cuantos son pares entre ambos.");
        int num1, num2;
        int contadorPares = 0;

        do {
            System.out.println("==========================");
            System.out.println("Ingresa el primero número: ");
            num1 = sc.nextInt();
            System.out.println("Ingresa el segundo número: ");
            num2 = sc.nextInt();

            int numIni = Math.min(num1, num2);
            int numFin = Math.max(num1, num2);

            if (num1 == num2) {
                System.out.println("Los números son iguales.");
            } else {
                for (int i = numIni + 1; i < numFin; i++) {
                    if (i % 2 == 0) {
                        contadorPares++;
                    }
                }
            }
            System.out.println();
        } while (num1 != num2);

        System.out.println("Total de pares: " + contadorPares);

        sc.close();
    }

    public static void numerosHastaTresMil() {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int sumaArray = 0;
        int sumaTotal = 0;
        int contador = 0;

        System.out.println("Suma de 5 numeros hasta 3000.");
        System.out.println("=============================");

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            sumaArray += numeros[i];
        }

        do {
            sumaTotal += sumaArray;
            contador++;
        } while (sumaTotal < 3000);

        System.out.println("Suma total alcanzada: " + sumaTotal);
        System.out.println("Hay que sumar: " + numeros[0] + " + " + numeros[1] + " + " + numeros[2] + " + " + numeros[3] + " + " + numeros[4] + " al menos " + contador + " veces, para llegar a 3000.");
    }

    public static boolean validarDni(String dni) {
        if (dni == null || dni.length() != 9) {
            return false;
        }

        if (dni.equals("00000000T") || dni.equals("00000001R") || dni.equals("99999999R")) {
            return false;
        }

        String numeroStr = dni.substring(0, 8);
        String letra = dni.substring(8).toUpperCase();

        try {
            int numero = Integer.parseInt(numeroStr);
            String letrasValidas = "TRWAGMYFPDXBNJZSQVHLCKE";
            int resto = numero % 23;
            char letraCorrecta = letrasValidas.charAt(resto);

            return letra.charAt(0) == letraCorrecta;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}