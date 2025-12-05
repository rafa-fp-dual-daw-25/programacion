import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(getSalaryMean(new double[]{1500, 4500, 2000, 3400.50}));

        System.out.println(getSalaryMedian(new double[]{1500, 4500, 2000, 3400.50}));

    }

    public static double getSalaryMean(double[] salaries) {
        double meanSalary = 0;
        for (double salary : salaries) {
            meanSalary += salary;
        }
        return meanSalary /= salaries.length;
    }

    public static double getSalaryMedian(double[] salaries) {

        for (int i = 0; i < salaries.length - 1; i++) {
            for (int j = 0; j < salaries.length - i - 1; j++) {
                if (salaries[j] > salaries[j + 1]) {
                    double temp = salaries[j];
                    salaries[j] = salaries[j + 1];
                    salaries[j + 1] = temp;
                }
            }
        }
        double median;
        int n = salaries.length;

        if (n % 2 == 0) {
            return (salaries[n / 2 - 1]) + (salaries[n / 2]) / 2.0;
        } else {
            return salaries[n / 2];
        }
    }

    public static double getPayroll(double salary, int children, double percentage, boolean disability) {
        double discountPercentage = percentage;

        if (children > 0) {
            for (int i = 0; i < children; i++) {
                if (children < 3) {
                    discountPercentage -= 1;
                } else {
                    discountPercentage -= 3;
                }
            }
        }
        if (discountPercentage < 0) {
            discountPercentage = 0;
        }

        double baseSalary = salary * (100 - discountPercentage) / 100;

        if (disability) {
            baseSalary += 500;
        }
        return baseSalary;
    }

    public static double[][] transposeMatrix(double[][] matrix) {

        int row = matrix.length;
        int column = matrix[0].length;
        double[][] matrixT = new double[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixT[j][i] = matrix[i][j];
            }
        }
        return matrixT;
    }
}