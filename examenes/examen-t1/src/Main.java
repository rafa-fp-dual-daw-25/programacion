public class Main {

    public static void main(String[] args) {
        System.out.println("Buena suerte cracks!");
    }

    public static double getPrice(int num, int age) {
        double totalPrice = num * 60;
        double discount = 0;

        if (age >= 35 && age < 50) {
            discount = (totalPrice * 20) / 100;
        } else if (age >= 50) {
            discount = (totalPrice * 40) / 100;
        }
        return totalPrice - discount;
    }

    public static int getTotalMul(int[] array) {
        int totalMult = array[0];

        for (int i = 1; i < array.length; i++) {
            totalMult *= array[i];
        }
        return totalMult;
    }

    public static int[] getEvenArray(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        int[] arrayPares = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayPares[index] = array[i];
                index++;
            }
        }
        return arrayPares;
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] arraySuma = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            arraySuma[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            arraySuma[i + array1.length] = array2[i];
        }
        return arraySuma;
    }

    public static boolean isPrimeMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int num = matrix[i][j];

                // Verificar si el número es primo
                if (!isPrime(num)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Metodo auxiliar para verificar si un número es primo
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int getMaxInvertedDiagonal(int[][] matrix) {
        int mayor = matrix[0][matrix.length - 1];

        for (int i = 0; i < matrix.length; i++) {
            int currentIndex = matrix[i][matrix.length - 1 - i];
            if (currentIndex > mayor) {
                mayor = currentIndex;
            }
        }
        return mayor;
    }
}