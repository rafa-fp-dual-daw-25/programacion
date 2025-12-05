import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {3, 4, 5, 2, 1};

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}
