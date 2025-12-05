/**
 * CALCULADORA MATEMÁTICA AVANZADA
 * <p>
 * Este programa demuestra el uso de métodos matemáticos de la clase Math:
 * - Cálculos básicos: valor absoluto, máximo, mínimo
 * - Potencias y raíces: potencia, raíz cuadrada
 * - Funciones trigonométricas y logarítmicas
 * - Constantes matemáticas importantes
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA MATEMÁTICA AVANZADA ===");
        System.out.println();

        // =================================================================
        // 1. CÁLCULOS BÁSICOS CON MATH
        // =================================================================
        System.out.println("1. CÁLCULOS BÁSICOS");
        System.out.println("====================");

        // Ejemplos de Math.abs() - Valor absoluto
        System.out.println();
        System.out.println("--- VALOR ABSOLUTO (Math.abs()) ---");
        int numeroNegativo = -15;
        double decimalNegativo = -7.25;
        System.out.println("Math.abs(" + numeroNegativo + ") = " + Math.abs(numeroNegativo));
        System.out.println("Math.abs(" + decimalNegativo + ") = " + Math.abs(decimalNegativo));
        System.out.println("Math.abs(42) = " + Math.abs(42));

        // Ejemplos de Math.max() - Encontrar el mayor
        System.out.println();
        System.out.println("--- ENCONTRAR EL MAYOR (Math.max()) ---");
        int a = 10, b = 25;
        double x = 7.5, y = 7.8;
        System.out.println("Math.max(" + a + ", " + b + ") = " + Math.max(a, b));
        System.out.println("Math.max(" + x + ", " + y + ") = " + Math.max(x, y));
        System.out.println("Math.max(-5, -10) = " + Math.max(-5, -10));

        // Ejemplos de Math.min() - Encontrar el menor
        System.out.println();
        System.out.println("--- ENCONTRAR EL MENOR (Math.min()) ---");
        System.out.println("Math.min(" + a + ", " + b + ") = " + Math.min(a, b));
        System.out.println("Math.min(" + x + ", " + y + ") = " + Math.min(x, y));
        System.out.println("Math.min(-5, -10) = " + Math.min(-5, -10));


        // =================================================================
        // 2. POTENCIAS Y RAÍCES
        // =================================================================
        System.out.println();
        System.out.println();
        System.out.println("2. POTENCIAS Y RAÍCES");
        System.out.println("=====================");

        // Ejemplos de Math.pow() - Potencia
        System.out.println();
        System.out.println("--- POTENCIAS (Math.pow()) ---");
        System.out.println("Math.pow(2, 3) = 2³ = " + Math.pow(2, 3));
        System.out.println("Math.pow(5, 2) = 5² = " + Math.pow(5, 2));
        System.out.println("Math.pow(10, 0.5) = 10⁰·⁵ = " + Math.pow(10, 0.5));
        System.out.println("Math.pow(16, 0.25) = 16⁰·²⁵ = " + Math.pow(16, 0.25));

        // Ejemplos de Math.sqrt() - Raíz cuadrada
        System.out.println();
        System.out.println("--- RAÍZ CUADRADA (Math.sqrt()) ---");
        System.out.println("Math.sqrt(25) = √25 = " + Math.sqrt(25));
        System.out.println("Math.sqrt(2) = √2 = " + Math.sqrt(2));
        System.out.println("Math.sqrt(100) = √100 = " + Math.sqrt(100));
        System.out.println("Math.sqrt(0.25) = √0.25 = " + Math.sqrt(0.25));


        // =================================================================
        // 3. EJEMPLOS PRÁCTICOS COMBINADOS
        // =================================================================
        System.out.println();
        System.out.println();
        System.out.println("3. EJEMPLOS PRÁCTICOS COMBINADOS");
        System.out.println("================================");

        // Ejemplo 1: Cálculo de distancia entre dos puntos
        System.out.println();
        System.out.println("--- CÁLCULO DE DISTANCIA ENTRE DOS PUNTOS ---");
        double x1 = 1, y1 = 2;
        double x2 = 4, y2 = 6;
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distancia entre (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ") = " + Math.round(distancia * 100.0) / 100.0);

        // Ejemplo 2: Encontrar el número más cercano a cero
        System.out.println();
        System.out.println("--- NÚMERO MÁS CERCANO A CERO ---");
        double num1 = -3.5, num2 = 2.8, num3 = -1.2;
        double masCercano = Math.min(Math.abs(num1), Math.min(Math.abs(num2), Math.abs(num3)));
        System.out.println("Entre " + num1 + ", " + num2 + " y " + num3);
        System.out.println("El más cercano a cero en valor absoluto es: " + masCercano);

        // Ejemplo 3: Cálculo del área de un círculo
        System.out.println();
        System.out.println("--- ÁREA DE UN CÍRCULO ---");
        double radio = 5.0;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Área del círculo con radio " + radio + " = " + Math.round(area * 100.0) / 100.0);


        // =================================================================
        // 4. INTERACCIÓN CON EL USUARIO
        // =================================================================
        System.out.println();
        System.out.println();
        System.out.println("4. CALCULADORA INTERACTIVA");
        System.out.println("=========================");

        System.out.println();
        System.out.print("Ingresa la base para calcular potencia: ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa el exponente: ");
        double exponente = scanner.nextDouble();

        double resultadoPotencia = Math.pow(base, exponente);
        System.out.println();
        System.out.println(base + " elevado a " + exponente + " = " + resultadoPotencia);

        System.out.println();
        System.out.print("Ingresa un número para calcular su raíz cuadrada: ");
        double numeroRaiz = scanner.nextDouble();

        if (numeroRaiz >= 0) {
            double raiz = Math.sqrt(numeroRaiz);
            System.out.println("√" + numeroRaiz + " = " + raiz);
        } else {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo");
        }

        // Ejemplo adicional: Encontrar máximo y mínimo de tres números
        System.out.println();
        System.out.println("--- MÁXIMO Y MÍNIMO DE TRES NÚMEROS ---");
        System.out.print("Ingresa el primer número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double n2 = scanner.nextDouble();
        System.out.print("Ingresa el tercer número: ");
        double n3 = scanner.nextDouble();

        double maximo = Math.max(n1, Math.max(n2, n3));
        double minimo = Math.min(n1, Math.min(n2, n3));

        System.out.println("De los números " + n1 + ", " + n2 + " y " + n3 + ":");
        System.out.println("El MÁXIMO es: " + maximo);
        System.out.println("El MÍNIMO es: " + minimo);

        scanner.close();

        System.out.println();
        System.out.println("=== FIN DE LA CALCULADORA MATEMÁTICA AVANZADA ===");
    }
}