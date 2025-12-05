import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EjeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. La NASA está probando sensores de temperatura en las alas de un avión experimental. Crea un array de enteros que represente las temperaturas registradas en cada ala. Recorre el array y muestra únicamente las temperaturas que superan los 100 grados.

        int[] alaD = new int[]{99, 44, 88};
        int[] alaI = new int[]{10, 20, 99};
        boolean flagAlaD = true; //boolean para verificar funcionamiento normal
        boolean flagAlaI = true; //boolean para verificar funcionamiento normal

        for (int i = 0; i < alaD.length; i++) {
            if (alaD[i] > 100) {
                flagAlaD = false;
                System.out.println("Dato " + i + " del sensor de la ala derecha: " + alaD[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < alaI.length; i++) {
            if (alaI[i] > 100) {
                flagAlaI = false;
                System.out.println("Dato " + i + " del sensor de la ala derecha: " + alaI[i]);
            }
        }

        if (flagAlaD) {
            System.out.println("Ala derecha en perfecto funcionamiento.");
        }

        System.out.println();

        if (flagAlaI) {
            System.out.println("Ala izquierda en perfecto funcionamiento.");
        }

        //2. Un streamer guarda la cantidad de espectadores en cada hora de transmisión en un array. Recorre el array e imprime en qué horas el número de espectadores fue mayor a 1000. Además, cuenta cuántas veces se superó esa cifra.

        int[] users = new int[]{3500, 200, 1800, 900};
        int highViewCount = 0;

        for (int i = 0; i < users.length; i++) {
            if (users[i] > 1000) {
                System.out.println("A las " + i + " horas " + users[i] + " usuarios online");
                highViewCount += +1;
            }
        }

        if (highViewCount > 0) {
            System.out.println("Esta transmisión superó 1000 espectadores en " + highViewCount + " momentos.");
        } else {
            System.out.println("Esta transmisión tuvo pocos espectadores.");
        }

        //3. Un banco registra en un array los movimientos de una cuenta (positivos ingresos,
        //negativos gastos). Recorre el array y calcula el saldo final. Muestra también cuántos
        //movimientos fueron ingresos y cuántos fueron gastos.

        double[] movimientos = new double[]{200, -100, -200, 400, 550.50};
        double ingresos = 0;
        int cantIngresos = 0;

        double gastos = 0;
        int cantGastos = 0;

        for (int i = 0; i < movimientos.length; i++) {
            if (movimientos[i] > 0) {
                ingresos += movimientos[i];
                cantIngresos += +1;
            } else {
                gastos -= movimientos[i];
                cantGastos += +1;
            }
        }

        double saldo = ingresos - gastos;
        System.out.println(cantIngresos + " ingresos en el período.");
        System.out.println(cantGastos + " gastos en el período.");
        System.out.println("Saldo actual: " + saldo + " €.");

        //4. Un profesor guarda las notas de 20 alumnos en un array. Recorre el array y determina cuántos alumnos han aprobado (nota >= 5). Crea una función que reciba una nota y devuelva si es aprobado o suspenso.

        double[] notas = new double[]{7, 6, 4.5, 3, 10, 9, 8, 7, 9, 2.5, 4, 7.5, 10, 9, 8, 6, 3.5, 8.5, 10, 9.5};
        int countAprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            if (aprobado(notas[i])) {
                countAprobados++;
                System.out.println("Alumno " + (i) + " - Nota: " + notas[i] + " - APROBADO");
            } else {
                System.out.println("Alumno " + (i) + " - Nota: " + notas[i] + " - SUSPENSO");
            }
        }
        System.out.println("Aprobados: " + countAprobados);


        //5. Tienes un array con el tiempo de ejecución (en milisegundos) de varios algoritmos. Recorre el array y encuentra cuál fue el tiempo más rápido y el más lento.

        double[] algoritimos = new double[]{1560, 2444, 177, 5000};

        double menor = Integer.MAX_VALUE; //Inicializar con el mayor valor posible
        double mayor = Integer.MIN_VALUE; //Inicializar con el menor valor posible

        for (
                double algoritimo : algoritimos) {
            if (algoritimo < menor) {
                menor = algoritimo;
            }
            if (algoritimo > mayor) {
                mayor = algoritimo;
            }
        }
        System.out.println("El tiempo más rápido es: " + menor + " milisegundos.");
        System.out.println("El tiempo más lento es: " + mayor + " milisegundos.");
    }

    /// //////////FUNCIONES FUERA DEL MAIN/////////////


    public static boolean aprobado(double n) {
        return n >= 5;
    }
}


