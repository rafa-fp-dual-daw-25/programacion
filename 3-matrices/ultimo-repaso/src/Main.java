import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {13, 10, 27, 2},
                {7, 15, 12, 40},
                {34, 5, 65, 12}
        };

        System.out.println(Arrays.toString(getMinColumNum(matrix)));
        System.out.println(Arrays.toString(getMaxNums(matrix)));

    }

    public static int[] getMinColumNum(int[][] matrix) {
        int[] minColumnas = new int[matrix[0].length];

        for (int i = 0; i < matrix[0].length; i++) {
            minColumnas[i] = matrix[0][i];
        }

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] < minColumnas[i]) {
                    minColumnas[i] = matrix[j][i];
                }
            }
        }
        return minColumnas;
    }

    public static int[] getMaxNums(int[][] matrix) {
        int contador = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 10) {
                    contador++;
                }
            }
        }

        int[] mayoresDiez = new int[contador];
        int index = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 10) {
                    mayoresDiez[index] = matrix[i][j];
                    index++;
                }
            }
        }

        return mayoresDiez;
    }
}