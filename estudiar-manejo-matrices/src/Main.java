/**
 * EJEMPLO COMPLETO DE MANEJO DE MATRICES EN JAVA
 * <p>
 * Este programa demuestra diferentes formas de:
 * - Declarar e inicializar matrices
 * - Recorrer matrices de diversas maneras
 * - Realizar operaciones comunes con matrices
 * - Trabajar con matrices irregulares
 * - Aplicaciones prácticas con datos reales
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== EJEMPLOS COMPLETOS DE MATRICES EN JAVA ===");
        System.out.println();

        // =================================================================
        // 1. DECLARACIÓN E INICIALIZACIÓN DE MATRICES
        // =================================================================
        System.out.println("1. DECLARACIÓN E INICIALIZACIÓN DE MATRICES");
        System.out.println("============================================");

        // FORMA 1: Inicialización directa con valores
        // Matriz 3x3 - 3 filas y 3 columnas
        int[][] matrizCuadrada = {
                {1, 2, 3},      // Fila 0: índices [0][0]=1, [0][1]=2, [0][2]=3
                {4, 5, 6},      // Fila 1: índices [1][0]=4, [1][1]=5, [1][2]=6
                {7, 8, 9}       // Fila 2: índices [2][0]=7, [2][1]=8, [2][2]=9
        };

        // FORMA 2: Declaración primero, luego asignación de tamaño
        // Matriz 2x4 - 2 filas y 4 columnas (inicializada con ceros)
        int[][] matrizRectangular = new int[2][4];

        // FORMA 3: Matriz irregular - cada fila puede tener diferente número de columnas
        int[][] matrizIrregular = {
                {1, 2},                 // Fila 0: 2 columnas
                {3, 4, 5, 6},           // Fila 1: 4 columnas
                {7},                    // Fila 2: 1 columna
                {8, 9, 10}              // Fila 3: 3 columnas
        };

        // FORMA 4: Matriz de strings (nombres)
        String[][] matrizNombres = {
                {"Ana", "Luis", "Carlos"},
                {"María", "Pedro", "Sofía"},
                {"Juan", "Elena", "David"}
        };

        System.out.println("Matriz Cuadrada 3x3:");
        imprimirMatriz(matrizCuadrada);

        System.out.println();
        System.out.println("Matriz Irregular:");
        imprimirMatriz(matrizIrregular);

        System.out.println();
        System.out.println("Matriz de Nombres:");
        imprimirMatrizString(matrizNombres);


        // =================================================================
        // 2. DIFERENTES FORMAS DE RECORRER MATRICES
        // =================================================================
        System.out.println();
        System.out.println();
        System.out.println("2. MÉTODOS DE RECORRIDO DE MATRICES");
        System.out.println("====================================");

        System.out.println("MÉTODO 1: For clásico por filas (más control)");
        System.out.println("------------------------------------------------");
        recorridoPorFilas(matrizCuadrada);

        System.out.println();
        System.out.println("MÉTODO 2: For-each (más legible)");
        System.out.println("-----------------------------------");
        recorridoForEach(matrizCuadrada);

        System.out.println();
        System.out.println("MÉTODO 3: Por columnas");
        System.out.println("------------------------");
        recorridoPorColumnas(matrizCuadrada);

        System.out.println();
        System.out.println("MÉTODO 4: En espiral (avanzado)");
        System.out.println("---------------------------------");
        recorridoEspiral(matrizCuadrada);


        // =================================================================
        // 3. OPERACIONES COMUNES CON MATRICES
        // =================================================================
        System.out.println();
        System.out.println();
        System.out.println("3. OPERACIONES CON MATRICES");
        System.out.println("============================");

        // Crear segunda matriz para operaciones
        int[][] matrizB = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        System.out.println("OPERACIÓN 1: Suma de matrices");
        System.out.println("------------------------------");
        System.out.println("Matriz A:");
        imprimirMatriz(matrizCuadrada);
        System.out.println("Matriz B:");
        imprimirMatriz(matrizB);

        int[][] suma = sumarMatrices(matrizCuadrada, matrizB);
        System.out.println("Resultado de A + B:");
        imprimirMatriz(suma);

        System.out.println();
        System.out.println("OPERACIÓN 2: Transpuesta de matriz");
        System.out.println("------------------------------------");
        int[][] transpuesta = obtenerTranspuesta(matrizCuadrada);
        System.out.println("Matriz original:");
        imprimirMatriz(matrizCuadrada);
        System.out.println("Matriz transpuesta:");
        imprimirMatriz(transpuesta);

        System.out.println();
        System.out.println("OPERACIÓN 3: Búsqueda en matriz");
        System.out.println("--------------------------------");
        System.out.print("Ingresa un número a buscar en la matriz: ");
        int numeroBuscado = scanner.nextInt();
        buscarElemento(matrizCuadrada, numeroBuscado);

        System.out.println();
        System.out.println("OPERACIÓN 4: Diagonal principal");
        System.out.println("--------------------------------");
        System.out.print("Diagonal principal: ");
        obtenerDiagonal(matrizCuadrada);


        // =================================================================
        // 4. EJEMPLO PRÁCTICO: SISTEMA DE NOTAS
        // =================================================================
        System.out.println();
        System.out.println();
        System.out.println("4. EJEMPLO PRÁCTICO: SISTEMA DE NOTAS");
        System.out.println("======================================");

        // Matriz: 4 alumnos x 4 asignaturas
        double[][] notasAlumnos = {
                {8.5, 7.0, 9.2, 6.8},  // Alumno 0: Ana
                {6.0, 8.5, 7.8, 9.0},   // Alumno 1: Luis
                {9.5, 8.0, 7.2, 8.8},   // Alumno 2: María
                {7.8, 6.5, 8.9, 7.2}    // Alumno 3: Carlos
        };

        String[] nombresAlumnos = {"Ana", "Luis", "María", "Carlos"};
        String[] nombresAsignaturas = {"Matemáticas", "Historia", "Inglés", "Programación"};

        System.out.println("Tabla de notas completa:");
        imprimirMatrizNotas(notasAlumnos, nombresAlumnos, nombresAsignaturas);

        System.out.println();
        System.out.println("--- ESTADÍSTICAS ---");
        promedioPorAlumno(notasAlumnos, nombresAlumnos);
        promedioPorAsignatura(notasAlumnos, nombresAsignaturas);
        mejorNotaPorAsignatura(notasAlumnos, nombresAsignaturas, nombresAlumnos);

        scanner.close();
    }

    // =====================================================================
    // MÉTODOS AUXILIARES PARA IMPRIMIR MATRICES
    // =====================================================================

    /**
     * Imprime una matriz de enteros de forma formateada
     */
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Fila " + i + ": [ ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
    }

    /**
     * Imprime una matriz de strings de forma formateada
     */
    public static void imprimirMatrizString(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Fila " + i + ": [ ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
    }

    /**
     * Imprime la matriz de notas con formato de tabla
     */
    public static void imprimirMatrizNotas(double[][] notas, String[] alumnos, String[] asignaturas) {
        // Imprimir cabecera
        System.out.print("Alumno/Asig.\t");
        for (String asignatura : asignaturas) {
            System.out.print(asignatura + "\t");
        }
        System.out.println();

        // Imprimir filas con datos
        for (int i = 0; i < notas.length; i++) {
            System.out.print(alumnos[i] + "\t\t");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(Math.round(notas[i][j] * 10.0) / 10.0 + "\t");
            }
            System.out.println();
        }
    }


    // =====================================================================
    // MÉTODOS DE RECORRIDO
    // =====================================================================

    /**
     * Recorrido tradicional usando for anidado
     * Ventaja: Tenemos acceso a los índices i y j
     */
    public static void recorridoPorFilas(int[][] matriz) {
        System.out.println("Recorriendo por filas...");
        for (int i = 0; i < matriz.length; i++) {           // i recorre las filas
            for (int j = 0; j < matriz[i].length; j++) {    // j recorre las columnas
                System.out.println("  matriz[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
    }

    /**
     * Recorrido usando for-each (enhanced for)
     * Ventaja: Más legible y menos propenso a errores de índice
     * Desventaja: No tenemos los índices directamente
     */
    public static void recorridoForEach(int[][] matriz) {
        System.out.println("Recorriendo con for-each...");
        int numFila = 0;
        for (int[] fila : matriz) {         // Cada elemento es una fila (array unidimensional)
            int numColumna = 0;
            for (int elemento : fila) {     // Cada elemento dentro de la fila
                System.out.println("  Fila " + numFila + ", Col " + numColumna + " = " + elemento);
                numColumna++;
            }
            numFila++;
        }
    }

    /**
     * Recorrido por columnas en lugar de por filas
     * Útil cuando necesitamos procesar datos por columnas
     */
    public static void recorridoPorColumnas(int[][] matriz) {
        System.out.println("Recorriendo por columnas...");
        // Asumimos que todas las filas tienen el mismo número de columnas
        int numColumnas = matriz[0].length;

        for (int j = 0; j < numColumnas; j++) {        // j recorre columnas primero
            for (int i = 0; i < matriz.length; i++) {  // i recorre filas después
                System.out.println("  Columna " + j + ", Fila " + i + " = " + matriz[i][j]);
            }
        }
    }

    /**
     * Recorrido en espiral: empieza en esquina superior izquierda y gira en espiral
     * Algoritmo más avanzado para recorridos especiales
     */
    public static void recorridoEspiral(int[][] matriz) {
        System.out.println("Recorrido en espiral:");

        int filaInicio = 0, filaFin = matriz.length - 1;
        int colInicio = 0, colFin = matriz[0].length - 1;

        while (filaInicio <= filaFin && colInicio <= colFin) {
            // 1. Recorrer de izquierda a derecha (fila superior)
            for (int j = colInicio; j <= colFin; j++) {
                System.out.print(matriz[filaInicio][j] + " ");
            }
            filaInicio++; // Eliminamos la fila superior ya recorrida

            // 2. Recorrer de arriba a abajo (columna derecha)
            for (int i = filaInicio; i <= filaFin; i++) {
                System.out.print(matriz[i][colFin] + " ");
            }
            colFin--; // Eliminamos la columna derecha ya recorrida

            // 3. Recorrer de derecha a izquierda (fila inferior)
            if (filaInicio <= filaFin) {
                for (int j = colFin; j >= colInicio; j--) {
                    System.out.print(matriz[filaFin][j] + " ");
                }
                filaFin--; // Eliminamos la fila inferior ya recorrida
            }

            // 4. Recorrer de abajo a arriba (columna izquierda)
            if (colInicio <= colFin) {
                for (int i = filaFin; i >= filaInicio; i--) {
                    System.out.print(matriz[i][colInicio] + " ");
                }
                colInicio++; // Eliminamos la columna izquierda ya recorrida
            }
        }
        System.out.println(); // Salto de línea final
    }


    // =====================================================================
    // OPERACIONES CON MATRICES
    // =====================================================================

    /**
     * Suma dos matrices del mismo tamaño
     * Condición: Ambas matrices deben tener las mismas dimensiones
     */
    public static int[][] sumarMatrices(int[][] a, int[][] b) {
        int filas = a.length;
        int columnas = a[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }
        return resultado;
    }

    /**
     * Obtiene la matriz transpuesta
     * La transpuesta intercambia filas por columnas
     * Ejemplo: Si A es 3x2, A^T será 2x3
     */
    public static int[][] obtenerTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas]; // Dimensiones invertidas

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j]; // Intercambiamos índices
            }
        }
        return transpuesta;
    }

    /**
     * Busca un elemento en la matriz
     * Si lo encuentra, muestra su posición
     * Si no, informa que no se encontró
     */
    public static void buscarElemento(int[][] matriz, int objetivo) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == objetivo) {
                    System.out.println("✓ Elemento " + objetivo + " encontrado en posición [" + i + "][" + j + "]");
                    return; // Salimos del método al encontrar el elemento
                }
            }
        }
        System.out.println("✗ Elemento " + objetivo + " no encontrado en la matriz");
    }

    /**
     * Obtiene e imprime la diagonal principal de una matriz cuadrada
     * La diagonal principal son los elementos donde fila = columna
     */
    public static void obtenerDiagonal(int[][] matriz) {
        // Solo funciona para matrices cuadradas
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " "); // i,i son los elementos de la diagonal
        }
        System.out.println();
    }


    // =====================================================================
    // MÉTODOS PARA EL EJEMPLO PRÁCTICO DE NOTAS
    // =====================================================================

    /**
     * Calcula y muestra el promedio de notas por alumno
     */
    public static void promedioPorAlumno(double[][] notas, String[] alumnos) {
        System.out.println();
        System.out.println("PROMEDIO POR ALUMNO:");
        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            System.out.println("  " + alumnos[i] + ": " + Math.round(promedio * 100.0) / 100.0);
        }
    }

    /**
     * Calcula y muestra el promedio de notas por asignatura
     */
    public static void promedioPorAsignatura(double[][] notas, String[] asignaturas) {
        System.out.println();
        System.out.println("PROMEDIO POR ASIGNATURA:");
        for (int j = 0; j < notas[0].length; j++) {
            double suma = 0;
            for (int i = 0; i < notas.length; i++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas.length;
            System.out.println("  " + asignaturas[j] + ": " + Math.round(promedio * 100.0) / 100.0);
        }
    }

    /**
     * Encuentra y muestra la mejor nota por cada asignatura
     */
    public static void mejorNotaPorAsignatura(double[][] notas, String[] asignaturas, String[] alumnos) {
        System.out.println();
        System.out.println("MEJOR NOTA POR ASIGNATURA:");
        for (int j = 0; j < notas[0].length; j++) {
            double mejorNota = -1;
            int indiceMejorAlumno = -1;

            for (int i = 0; i < notas.length; i++) {
                if (notas[i][j] > mejorNota) {
                    mejorNota = notas[i][j];
                    indiceMejorAlumno = i;
                }
            }
            System.out.println("  " + asignaturas[j] + ": " + alumnos[indiceMejorAlumno] + " con " + mejorNota);
        }
    }
}