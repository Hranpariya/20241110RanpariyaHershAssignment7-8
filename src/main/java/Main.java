import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter ten double values:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double averageValue = average(numbers);
        System.out.println("The average value is: " + averageValue);
    }

    public static int average(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        if (array.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }
}