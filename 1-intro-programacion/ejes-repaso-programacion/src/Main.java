public class Main {
    public static void main(String[] args) {

        //*************** Eje1 ***************
        /*int[] numeros = {1, 5, 7, -3, -8};
        boolean resultado = hayNegativo(numeros);

        if (resultado) {
            System.out.println("Hay numero(s) negativos");
        } else {
            System.out.println("No hay numero(s) negativos");
        }*/

        //*************** Eje2 ***************
        /*int[] multiplos = {2, 4, 5, 11};
        boolean resultado = esMultiplo(multiplos);

        if (resultado) {
            System.out.println("Hay numero(s) multiplos de 3.");
        } else {
            System.out.println("-1");
        }*/

        //*************** Eje3 ***************

        /*int[] numeros = {3, 5, 7, 10, 15};
        mostrarInverso(numeros); // otra manera de hacer: imprime dentro de la funcion*/

        //*************** Eje4 ***************

        String palabra = "reconocer";
        if (esPalindromo(palabra)) {
            System.out.println("'" + palabra + "' ES un palíndromo");
        } else {
            System.out.println("'" + palabra + "' NO es un palíndromo");
        }
    }




    /*public static boolean hayNegativo(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                return true;
            }
        }
        return false;
    }*/

    /*public static boolean esMultiplo(int[] n) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 3 == 0) {
                return true;
            }
        }
        return false;
    }*/

    /*public static void mostrarInverso(int[] n) {
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.println(n[i]);
        }
    }*/

    public static boolean esPalindromo(String palabra) {
        // Convertir a minúsculas para que sea case-insensitive
        palabra = palabra.toLowerCase();

        // Recorrer solo hasta la mitad de la palabra
        for (int i = 0; i < palabra.length() / 2; i++) {
            char caracterInicio = palabra.charAt(i);
            char caracterFinal = palabra.charAt(palabra.length() - 1 - i);

            System.out.println("Comparando: " + caracterInicio + " con " + caracterFinal);

            // Si los caracteres no son iguales, no es palíndromo
            if (caracterInicio != caracterFinal) {
                return false;
            }
        }
        // Si llegamos aquí, todos los caracteres coinciden
        return true;
    }
}


