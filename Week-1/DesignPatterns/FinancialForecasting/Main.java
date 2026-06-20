import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current value: ");
        double currentValue = scanner.nextDouble();

        System.out.print("Enter annual growth rate (%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double futureValue =
                ForecastCalculator.predictFutureValue(
                        currentValue,
                        growthRate / 100,
                        years);

        System.out.printf(
                "\nPredicted value after %d years: ₹%.2f%n",
                years,
                futureValue);

        scanner.close();
    }
}