import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix1 = {
                {8, 9, 8, 9, 10},
                {6, 6, 6, 8, 5},
                {7, 7, 7, 9, 10},
                {3, 1, 8, 9, 10},
                {3, 2, 1, 9, 10},
                {3, 7, 7, 9, 10}
        };
        int[][] matrix2 = {
                {8, 9, 8, 9, 10},
                {6, 6, 6, 8, 5},
                {7, 7, 7, 9, 10},
                {3, 1, 8, 9, 10},
                {3, 2, 1, 9, 10},
                {3, 7, 7, 9, 10}
        };

        int[][] newMatrix = sumarMatrices(matrix1, matrix2);
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] sumarMatrices(int[][] matrix1, int[][] matrix2) {

        int[][] matrixSuma = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrixSuma[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrixSuma;
    }
}