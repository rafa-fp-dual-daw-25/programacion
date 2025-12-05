/**
 * MANEJADOR DE CADENAS Y ARRAYS
 * <p>
 * Este programa demuestra el uso de métodos útiles para:
 * - Manipulación de arrays con la clase Arrays
 * - Operaciones con cadenas de texto (String)
 * - Conversiones entre cadenas y arrays
 * - Métodos de comparación y ordenación
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MANEJADOR DE CADENAS Y ARRAYS ===");
        System.out.println();

        // =================================================================
        // 1. MANIPULACIÓN DE ARRAYS CON ARRAYS
        // =================================================================
        System.out.println("1. MANIPULACIÓN DE ARRAYS");
        System.out.println("=========================");

        // Crear arrays de ejemplo
        int[] array1 = {5, 2, 8, 1, 9};
        int[] array2 = {5, 2, 8, 1, 9};
        int[] array3 = {1, 2, 3, 4, 5};
        String[] nombres = {"Ana", "Carlos", "Beatriz", "David"};

        // Arrays.toString() - Convertir array a cadena
        System.out.println();
        System.out.println("--- CONVERSIÓN A CADENA (Arrays.toString()) ---");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Array3: " + Arrays.toString(array3));
        System.out.println("Nombres: " + Arrays.toString(nombres));

        // Arrays.equals() - Comparar arrays
        System.out.println();
        System.out.println("--- COMPARACIÓN DE ARRAYS (Arrays.equals()) ---");
        System.out.println("array1.equals(array2): " + array1.equals(array2)); // array1.equals(array2) compara las DIRECCIONES DE MEMORIA, no el contenido. Por eso devulve "false"
        System.out.println("Arrays.equals(array1, array2): " + Arrays.equals(array1, array2)); // Arrays.equals(array1, array2) compara el CONTENIDO elemento por elemento. Por eso devulve "true"
        System.out.println("Arrays.equals(array1, array3): " + Arrays.equals(array1, array3));

        // Arrays.sort() - Ordenar arrays
        System.out.println();
        System.out.println("--- ORDENACIÓN DE ARRAYS (Arrays.sort()) ---");
        System.out.println("Array1 antes de ordenar: " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Array1 después de ordenar: " + Arrays.toString(array1));

        System.out.println("Nombres antes de ordenar: " + Arrays.toString(nombres));
        Arrays.sort(nombres);
        System.out.println("Nombres después de ordenar: " + Arrays.toString(nombres));


        // =================================================================
        // 2. OPERACIONES CON CADENAS (STRING)
        // =================================================================
        System.out.println();
        System.out.println();
        System.out.println("2. OPERACIONES CON CADENAS");
        System.out.println("=========================");

        String texto = "Hola Mundo Java";
        String texto2 = "Programación en Java";

        // String.length() - Longitud de la cadena
        System.out.println();
        System.out.println("--- LONGITUD DE CADENA (String.length()) ---");
        System.out.println("Texto: \"" + texto + "\"");
        System.out.println("Longitud: " + texto.length() + " caracteres");
        System.out.println("Texto2: \"" + texto2 + "\"");
        System.out.println("Longitud: " + texto2.length() + " caracteres");

        // String.charAt() - Obtener carácter en posición específica
        System.out.println();
        System.out.println("--- CARÁCTER EN POSICIÓN (String.charAt()) ---");
        System.out.println("Texto: \"" + texto + "\"");
        for (int i = 0; i < texto.length(); i++) {
            System.out.println("Posición " + i + ": '" + texto.charAt(i) + "'");
        }

        // String.toCharArray() - Convertir cadena a array de caracteres
        System.out.println();
        System.out.println("--- CONVERSIÓN A ARRAY DE CARACTERES (String.toCharArray()) ---");
        char[] caracteres = texto.toCharArray();
        System.out.println("Array de caracteres: " + Arrays.toString(caracteres));


        // =================================================================
        // 3. MÉTODOS DE TRANSFORMACIÓN DE CADENAS
        // =================================================================
        System.out.println();
        System.out.println();
        System.out.println("3. TRANSFORMACIÓN DE CADENAS");
        System.out.println("============================");

        String textoMixto = "Java Programming 2024";

        // String.toUpperCase() y String.toLowerCase()
        System.out.println();
        System.out.println("--- CONVERSIÓN MAYÚSCULAS/MINÚSCULAS ---");
        System.out.println("Texto original: \"" + textoMixto + "\"");
        System.out.println("En MAYÚSCULAS: \"" + textoMixto.toUpperCase() + "\"");
        System.out.println("En minúsculas: \"" + textoMixto.toLowerCase() + "\"");

        // String.split() - Dividir cadena en array
        System.out.println();
        System.out.println("--- DIVISIÓN DE CADENAS (String.split()) ---");
        String frase = "Java,Python,C++,JavaScript";
        System.out.println("Frase original: \"" + frase + "\"");

        String[] lenguajes = frase.split(",");
        System.out.println("Array resultante: " + Arrays.toString(lenguajes));
        System.out.println("Número de elementos: " + lenguajes.length);

        String oracion = "Hola mundo desde Java programming";
        System.out.println();
        System.out.println("Oración: \"" + oracion + "\"");
        String[] palabras = oracion.split(" ");
        System.out.println("Palabras: " + Arrays.toString(palabras));


        // =================================================================
        // 4. EJEMPLOS PRÁCTICOS COMBINADOS
        // =================================================================
        System.out.println();
        System.out.println();
        System.out.println("4. EJEMPLOS PRÁCTICOS COMBINADOS");
        System.out.println("================================");

        // Ejemplo 1: Contador de vocales en un texto
        System.out.println();
        System.out.println("--- CONTADOR DE VOCALES ---");
        String textoEjemplo = "Programación en Java";
        System.out.println("Texto: \"" + textoEjemplo + "\"");

        int contadorVocales = 0;
        char[] chars = textoEjemplo.toLowerCase().toCharArray();
        for (char c : chars) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("Número de vocales: " + contadorVocales);

        // Ejemplo 2: Palíndromo (texto que se lee igual al derecho y al revés)
        System.out.println();
        System.out.println("--- VERIFICADOR DE PALÍNDROMOS ---");
        String posiblePalindromo = "Anita lava la tina";
        System.out.println("Frase: \"" + posiblePalindromo + "\"");

        // Limpiar la frase: quitar espacios y convertir a minúsculas
        String fraseLimpia = posiblePalindromo.replace(" ", "").toLowerCase();
        char[] caracteresFrase = fraseLimpia.toCharArray();
        boolean esPalindromo = true;

        for (int i = 0; i < caracteresFrase.length / 2; i++) {
            if (caracteresFrase[i] != caracteresFrase[caracteresFrase.length - 1 - i]) {
                esPalindromo = false;
                break;
            }
        }
        System.out.println("¿Es palíndromo? " + esPalindromo);


        // =================================================================
        // 5. INTERACCIÓN CON EL USUARIO
        // =================================================================
        System.out.println();
        System.out.println();
        System.out.println("5. INTERACCIÓN CON EL USUARIO");
        System.out.println("============================");

        scanner.nextLine(); // Limpiar buffer

        System.out.println();
        System.out.print("Ingresa una frase: ");
        String fraseUsuario = scanner.nextLine();

        System.out.println();
        System.out.println("--- ANÁLISIS DE TU FRASE ---");
        System.out.println("Longitud: " + fraseUsuario.length() + " caracteres");
        System.out.println("En mayúsculas: " + fraseUsuario.toUpperCase());
        System.out.println("En minúsculas: " + fraseUsuario.toLowerCase());

        // Dividir la frase en palabras
        String[] palabrasUsuario = fraseUsuario.split(" ");
        System.out.println("Número de palabras: " + palabrasUsuario.length);
        System.out.println("Palabras: " + Arrays.toString(palabrasUsuario));

        // Mostrar caracteres en posiciones específicas
        if (fraseUsuario.length() > 0) {
            System.out.println();
            System.out.println("Primer carácter: '" + fraseUsuario.charAt(0) + "'");
            System.out.println("Último carácter: '" + fraseUsuario.charAt(fraseUsuario.length() - 1) + "'");

            if (fraseUsuario.length() >= 5) {
                System.out.println("Carácter en posición 5: '" + fraseUsuario.charAt(4) + "'");
            }
        }

        // Ejemplo adicional: Ordenar palabras alfabéticamente
        if (palabrasUsuario.length > 0) {
            Arrays.sort(palabrasUsuario);
            System.out.println();
            System.out.println("Palabras ordenadas alfabéticamente: " + Arrays.toString(palabrasUsuario));
        }

        scanner.close();

        System.out.println();
        System.out.println("=== FIN DEL MANEJADOR DE CADENAS Y ARRAYS ===");
    }
}