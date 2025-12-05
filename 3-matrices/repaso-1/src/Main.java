import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] frases = {"El sol brilla muy fuerte hoy", "Hoy voy al parque grande", "Me gusta el chocolate dulce", "El niño lee un libro", "Hoy hace mucho calor fuera"};
        String palabraBuscada = "hoy";
        System.out.println(countContainWords(frases, palabraBuscada));

        int num = 3000;
        double percentage = 10.5;
        System.out.println(getFinalNum(num, percentage));

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        int columns = 5;
        System.out.println(Arrays.toString(getFirstRow(matrix, columns)));

    }

    public static int countContainWords(String[] phrases, String wordSearch) {
        int count = 0;

        for (String phrase : phrases) {
            String[] words = phrase.toLowerCase().split(" ");

            for (String word : words) {
                if (word.equals(wordSearch)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static double getFinalNum(int num, double percentage) {

        double result = (num * percentage) / 100;

        if (result > 100 && result < 1000) {
            result /= 3;
        } else if (result < 10) {
            result *= 3;
        }
        return result;
    }

    public static int[] getFirstRow(int[][] matrix, int columns) {

        int[] firstRow = new int[columns];

        for (int i = 0; i < matrix[0].length; i++) {
            firstRow[i] = matrix[0][i];
        }
        return firstRow;
    }
}