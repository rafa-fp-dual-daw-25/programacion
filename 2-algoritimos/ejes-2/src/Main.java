public class Main {
    public static void main(String[] args) {

    }

    public static int checkWordLength(String word) {
        return word.length();
    }

    public static int NumOfVowels(String word) {
        char[] chars = word.toLowerCase().toCharArray();
        int contador = 0;

        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] == 'a') || (chars[i] == 'e') || (chars[i] == 'i') || (chars[i] == 'o') || (chars[i] == 'u')) {
                contador++;
            }
        }
        return contador;
    }

    public static int checkNumberOfPrimes(int[] numbers) {
        int primos = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (isPrime(numbers[i])) {
                primos++;
            }
        }
        return primos;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIdentityMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j && matrix[i][j] != 1) {
                    return false;
                } else if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
