//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {3, 4, 6, 78},
                {1, 2, 5, 7},
                {10, 200, 1, 0},
                {0, 0, 2, 1}
        };
        System.out.println(getMaxRow(matrix));
    }

    public static int getMaxRow(int[][] matrix) {

        int max = 0;
        int row = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sumRows = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumRows += matrix[i][j];
            }
            if (sumRows > max) {
                max = sumRows;
                row = i;
            }
        }
        return row + 1;
    }
}