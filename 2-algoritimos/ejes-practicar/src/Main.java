//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double[] sueldos = {1500, 1456.10, 3000.50};
        System.out.println(maxSueldo(sueldos));
    }

    public static double maxSueldo(double[] array) {
        double maxSueldo = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxSueldo) {
                maxSueldo = array[i];
            }
        }
        return maxSueldo;
    }
}