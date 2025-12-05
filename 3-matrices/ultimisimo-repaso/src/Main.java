import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int[][] matrix = new int[2][2];
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print("Ingresa un numero: ");
//                matrix[i][j] = sc.nextInt();
//            }
//        }

        int[][] matrix2 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};

        int[] array = {1, 3, 2, 9, 7, 10, 8};
        String parImpar = "impar";
        int num = 7;
        double bytes = 1000000000000.0;

//        llenarMatriz(matrix);
//        System.out.println((sumMatrix(matrix)));
//        System.out.println(Arrays.toString(sumRow(matrix)));
//        System.out.println(Arrays.toString(sumCol(matrix)));
//        System.out.println(Arrays.toString(menorMayor(matrix)));
//        System.out.println(Arrays.deepToString(matrizRevertImpares(matrix2)));
//        System.out.println(Arrays.toString(diagonalPorEncima(matrix2)));
//        System.out.println(Arrays.deepToString(matrizTranspuesta(matrix2)));
//        System.out.println(Arrays.toString(numerosDoble(array)));
//        System.out.println(Arrays.toString(generateArray(parImpar)));
//        System.out.println(Arrays.toString(arrayInvert(array)));
//        System.out.println(Arrays.toString(getRandom(num)));
        System.out.println(Arrays.toString(numsOrdenados(array)));
        System.out.println(Arrays.toString(conversorByte(bytes)));
    }

    public static void llenarMatriz(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumMatrix(int[][] matrix) {

        int sumMatrix = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sumMatrix += matrix[i][j];
            }
        }
        return sumMatrix;
    }

    public static int[] sumRow(int[][] matrix) {
        int[] sumRows = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int suma = 0;

            for (int j = 0; j < matrix[0].length; j++) {
                suma += matrix[i][j];
            }
            sumRows[i] = suma;
        }
        return sumRows;
    }

    public static int[] sumCol(int[][] matrix) {
        int[] sumCols = new int[matrix.length];

        for (int j = 0; j < matrix.length; j++) {
            int suma = 0;

            for (int i = 0; i < matrix[0].length; i++) {
                suma += matrix[i][j];
            }
            sumCols[j] = suma;
        }
        return sumCols;
    }

    public static int[][] matrizRevertImpares(int[][] matrix) {

        int[][] matrixRevert = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrixRevert[i][j] = matrix[i][j];
            }
        }
        int[] temp = matrix[0];
        matrix[0] = matrix[matrix.length - 1];
        matrix[matrix.length - 1] = temp;

        int[][] matrixRevertImpares = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    matrixRevertImpares[i][j] = matrix[i][j] + 1;
                } else {
                    matrixRevertImpares[i][j] = matrix[i][j];
                }
            }
        }
        return matrixRevertImpares;
    }

    public static int[] menorMayor(int[][] matrix) {
        int menor = matrix[0][0];
        int mayor = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < menor) {
                    menor = matrix[i][j];
                }
                if (matrix[i][j] > mayor) {
                    mayor = matrix[i][j];
                }
            }
        }
        return new int[]{menor, mayor};
    }

    public static int[] diagonalPorEncima(int[][] matrix) {

        int arrayLenght = 0;

        for (int i = 1; i < matrix.length; i++) {
            arrayLenght += i;
        }

        int[] diagonalPorEncima = new int[arrayLenght];
        int iterador = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                diagonalPorEncima[iterador] = matrix[i][j];
                iterador++;
            }
        }
        return diagonalPorEncima;
    }

    public static int[][] matrizTranspuesta(int[][] matrix) {

        int[][] matrixTranspuesta = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrixTranspuesta[i][j] = matrix[j][i];
            }
        }
        return matrixTranspuesta;
    }

    public static int[] numerosDoble(int[] array) {

        int[] numerosDoble = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            numerosDoble[i] = array[i] * 2;
        }
        return numerosDoble;
    }

    public static int[] generateArray(String parImpar) {
        int[] numeros = new int[20];

        if (parImpar.equals("par")) {
            for (int i = 0; i < 20; i++) {
                numeros[i] = (i * 2) + 2;
            }
        } else if (parImpar.equals("impar")) {
            for (int i = 0; i < 20; i++) {
                numeros[i] = (i * 2) + 1;
            }
        }
        return numeros;
    }

    public static int[] arrayInvert(int[] array) {
        int[] arrayInvert = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayInvert[array.length - i - 1] = array[i];
        }
        return arrayInvert;
    }

    public static int[] getRandom(int num) {
        int[] random = new int[num];

        for (int i = 0; i < num; i++) {
            random[i] = (int) (Math.random() * 101);
        }
        return random;
    }

    public static int[] numsOrdenados(int[] array) {
        //IMPORTAR (import java.util.Arrays;)
        Arrays.sort(array);
        return array;
    }

    public static double[] conversorByte(double bytes) {
        double[] conversorByte = new double[5];

        double kilobytes = bytes / 1024;
        double megabytes = bytes / Math.pow(1024, 2); //(1024 * 1024)
        double gigabytes = bytes / Math.pow(1024, 3); //(1024 * 1024 * 1024)
        double terabytes = bytes / Math.pow(1024, 4); //1024 * 1024 * 1024 * 1024)

        conversorByte[0] = terabytes;
        conversorByte[1] = gigabytes;
        conversorByte[2] = megabytes;
        conversorByte[3] = kilobytes;
        conversorByte[4] = bytes;

        return conversorByte;
    }
}