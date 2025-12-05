
public class Main {
    public static void main(String[] args) {
        //Llamadas a la funciones

        System.out.println(letraNota(7));

        System.out.println(esMultiplo(9, 3));

        System.out.println(factorial(5));

        int[] positivos = {1, 3, 4,};
        sumarPositivos(positivos);

        double[] notas = {4.5, 7, 9, 5, 10};
        notaMaxima(notas);

    }

    /**
     * Función para que dada una letra devuelva la nota correspondiente en formato numérico
     *
     * @param nota
     * @return debe devolver en caso de 9-10: A, 7-9: B, 5-7: C, 3-5: D, 0-3: F
     */
    public static String letraNota(int nota) {

        switch (nota) {
            case 10, 9:
                return "A";
            case 8, 7:
                return "B";
            case 6, 5:
                return "C";
            case 4, 3:
                return "D";
            case 2, 1, 0:
                return "F";
            default:
                return "Nota inválida";
        }
    }

    /**
     * Función para saber si un número es multiplo de otro
     *
     * @param dividendo
     * @param divisor
     * @return Debe devolver un true en caso de dividendo sea multiplo de divisor,
     * caso contrario devolver false
     */
    public static boolean esMultiplo(int dividendo, int divisor) {
        if (dividendo % divisor == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Función para devolver el factorial de un número: !n
     *
     * @param n (int)
     * @return Tiene que devolver la suma de todos los números que están entre n y 0.
     * Ejemplo: para n=4 --> tiene que hacer la operación 4*3*2*1 y devolver 24
     */
    public static int factorial(int n) {
        int suma = 1;
        for (int i = n; i > 0; i--) { // Utilizar "i--" por que es factorial y va decreciente
            suma *= i;
        }
        return suma;
    }

    /**
     * Función para que dado un array de números devuelva la suma de unicamente los positivos
     *
     * @param numeros (un array de int)
     * @return devuelve al suma únicamente de los números positivos. Si el array está vacío devuelve 0
     */
    public static int sumarPositivos(int[] numeros) {
        int sumaPos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPos += numeros[i];
            }
        }
        return sumaPos;
    }

    /**
     * Función para dado un array de notas que devuelva unicamente la más alta
     *
     * @param notas (array double)
     * @return debe de devolver la nota máxima dentro del array
     */
    public static double notaMaxima(double[] notas) {
        double notaMax = notas[0]; // Inicializa con la pirmera posicion del array
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notaMax) {
                notaMax = notas[i];
            }
        }
        return notaMax;
    }
}