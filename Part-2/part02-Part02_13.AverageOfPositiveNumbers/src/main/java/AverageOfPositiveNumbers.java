
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double average = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }
            if (number > 0) {
                count++;
                sum = sum + number;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        }
        if (count > 0) {
            average = (double) sum / count;
            System.out.println(average);
        }
    }
}
