//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    public static double getDistance(double speed, double time) {

        double distance = 0;
        return distance = speed * (time / 2);
    }

    public static boolean isValidCar(double[] sensorProbability) {

        double porcentaje = 0;

        for (double v : sensorProbability) {
            porcentaje += v;
        }

        porcentaje /= sensorProbability.length;
        return porcentaje < 10;
    }

    public static double checkObjectWithPatternBlackAndWhite(boolean[][] pattern, boolean[][] object) {
        double pixelesDistintos = 0;
        double porcentaje = 0;

        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                if (pattern[i][j] != object[i][j]) {
                    pixelesDistintos++;
                }
            }
        }
        return porcentaje = (pixelesDistintos * 100) / (pattern.length * pattern[0].length);
    }

    public static double checkObjectWithPatternColour(int[][] pattern, int[][] object) {
        int pixelesDistintos = 0;
        int porcentaje = 0;

        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                if (Math.abs(pattern[i][j] - object[i][j]) > 10) {
                    pixelesDistintos++;
                }
            }
        }
        return porcentaje = (pixelesDistintos * 100) / (pattern.length * pattern[0].length);
    }
}
