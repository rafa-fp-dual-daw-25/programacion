import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1
        int a = 10, b = 15, c = 20;
        menorMayor(a, b, c);
        System.out.println();

        //2
        figuraUno();
        System.out.println();

        //3
        figuraDos();
        System.out.println();

        //4
        figuraTres();
        System.out.println("\n");

        //5
        System.out.println("Calcula tu número de la suerte: ");
        System.out.println("Ingresa el día de nacimiento: ");
        int dia = sc.nextInt();
        System.out.println("Ingresa el mes de nacimiento: ");
        int mes = sc.nextInt();
        System.out.println("Ingresa el año de nacimiento (4 digitos): ");
        int ano = sc.nextInt();

        System.out.println("Tu número de la suerte es: " + luckNumber(dia, mes, ano) + "\n");

        //6
        tablas();
        System.out.println();

        //7
        numeroRandom();

        //8
        System.out.println(decimalToRomano(1982));
        System.out.println();

        //9
        esOmirp(941);

        //10


        //11
        cincuentaPares();

        //12
        imprimirSinMultiplosDe5();

        sc.close();
    }

    public static void menorMayor(int a, int b, int c) {
        if (a == b || b == c || a == c) {
            System.out.println("Hay numeros iguales");
        } else {
            //***** OPCION OPTIMIZADA *****
            int menor = Math.min(a, Math.min(b, c));
            int mayor = Math.max(a, Math.max(b, c));

            System.out.println("El menor numero es: " + menor);
            System.out.println("El mayor numero es: " + mayor);
        }
    }

    public static void figuraUno() {

        int filas = 5;

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void figuraDos() {

        for (int i = 0; i < 4; i++) {
            System.out.print(" ".repeat(3 - i));
            System.out.println("*".repeat((2 * i) + 1));
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(" ".repeat(i + 1));
            System.out.println("*".repeat(5 - (2 * i)));
        }
    }

    public static void figuraTres() {
        for (int i = 0; i < 4; i++) {
            System.out.print(" ".repeat(3 - i));
            System.out.print("*");
            if (i > 0) {
                System.out.print(" ".repeat((2 * i) - 1));
                System.out.println("*");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(" ".repeat(i + 1));
            System.out.print("*");
            if (i < 2) {
                System.out.print(" ".repeat(3 - (2 * i)));
                System.out.println("*");
            }
        }
    }

    public static int luckNumber(int dia, int mes, int ano) {

        int numeroSuerte = dia + mes + ano;

        while (numeroSuerte > 9) {
            int suma = 0;
            String strNum = String.valueOf(numeroSuerte);

            // *** EXPLICACIÓN DEL FOR ***
            // Para cada carácter 'c' en el array de caracteres de strNum:
            // - Convierte el carácter a su valor numérico real
            // - Suma ese valor a la variable 'suma'
            for (char c : strNum.toCharArray()) {
                suma += Character.getNumericValue(c);
            }

            numeroSuerte = suma;

        }

        return numeroSuerte;
    }

    public static void tablas() {
        int multiplicador = 1;
        do {
            System.out.println("=== Tabla del " + multiplicador + " ===");
            System.out.println("--------------------");

            for (int i = 1; i <= 10; i++) {
                System.out.println(multiplicador + " x " + i + " = " + (multiplicador * i));
            }

            multiplicador++;
            System.out.println();
        } while (multiplicador <= 10);
    }

    public static void numeroRandom() {
        Random rnd = new Random();
        int valor = rnd.nextInt(101) + 100;

        if (valor % 2 == 0) {
            System.out.println("El valor " + valor + " es par.\n");
        } else {
            System.out.println("El valor " + valor + " es impar.\n");
        }
    }

    public static String decimalToRomano(int num) {
        int[] valoresDecimales = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolosRomanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < valoresDecimales.length; i++) {
            while (num >= valoresDecimales[i]) {
                num -= valoresDecimales[i];
                resultado.append(simbolosRomanos[i]);
            }
        }
        return resultado.toString();
    }

    public static void esOmirp(int num) {
        // Verificar si el número original es primo
        boolean primoOriginal = true;
        if (num <= 1) {
            primoOriginal = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primoOriginal = false;
                    break;
                }
            }
        }

        if (!primoOriginal) {
            System.out.println("El número normal " + num + " NO es primo.");
            return;
        }
        System.out.println("El número normal " + num + " ES primo.");

        // Invertir el número
        String numStr = String.valueOf(num);
        String numStrInvert = new StringBuilder(numStr).reverse().toString();
        int numInvert = Integer.parseInt(numStrInvert);

        // Verificar si el número invertido es primo
        boolean primoInvertido = true;
        if (numInvert <= 1) {
            primoInvertido = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numInvert); i++) {
                if (numInvert % i == 0) {
                    primoInvertido = false;
                    break;
                }
            }
        }

        if (!primoInvertido) {
            System.out.println("El número invertido " + numInvert + " NO es primo.");
        } else {
            System.out.println("El número invertido " + numInvert + " ES primo.");
        }

        // Resultado final
        if (primoOriginal && primoInvertido && num != numInvert) {
            System.out.println("¡El número " + num + " ES Omirp!\n");
        } else {
            System.out.println("El número " + num + " NO es Omirp.\n");
        }
    }



    public static void cincuentaPares() {
        for (int i = 1; i <= 50; i++) {
            System.out.print(i * 2 + " ");
        }
        System.out.println("\n");
    }

    public static void imprimirSinMultiplosDe5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) continue;
            System.out.print(i + " ");
        }
    }
}

