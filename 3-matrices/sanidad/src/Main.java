import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Prueba checkReset ===");
        int[] original = {10, 25, 50, 72, 90};
        int[] actual = {12, 28, 55, 68, 100};
        System.out.println("Se necesitó reset? " + (checkReset(actual, original)));

        System.out.println("\n=== Prueba hasCovid ===");
        char[] analitica1 = {'A', 'B', 'C', 'C', 'H', 'H', 'H', 'C', 'O'};
        char[] analitica2 = {'X', 'C', 'H', 'H', 'H', 'C', 'X'};
        System.out.println("Analítica 1 tiene COVID: " + hasCovid(analitica1));
        System.out.println("Analítica 1 tiene COVID: " + hasCovid(analitica2));

        System.out.println("\n=== Prueba historico ===");
        String[] pacientes = {"Juan Pérez", "María García", "Carlos López", "Ana Martínez"};
        String nombreBuscado = "maría garcía";
        System.out.println("Está " + nombreBuscado + " en la lista? " +
                checkHistory(pacientes, nombreBuscado));
    }

    public static boolean checkReset(int[] actual, int[] original) {
        boolean checkReset = false;

        for (int i = 0; i < actual.length; i++) {
            int diferencia = Math.abs(actual[i] - original[i]);

            if (diferencia > 5) {
                actual[i] = original[i];
                checkReset = true;
            }
        }
        System.out.println(("Array original: " + Arrays.toString(original)));
        System.out.println(("Array actual: " + Arrays.toString(actual)));
        return checkReset;
    }

    public static boolean hasCovid(char[] array) {
        char[] pattern = {'C', 'C', 'H', 'H', 'H', 'C', 'O'};
        if (array.length < pattern.length) {
            return false;
        }

        for (int i = 0; i <= array.length - pattern.length; i++) {
            boolean match = true;

            for (int j = 0; j < pattern.length; j++) {
                if (array[i + j] != pattern[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkHistory(String[] pacientes, String nombre) {
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i].equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
}