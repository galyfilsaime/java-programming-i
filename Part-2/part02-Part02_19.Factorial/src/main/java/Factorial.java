
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int i = 1;
        while (i <= number) {
            if (number == 0) {
                break;
            }
            factorial *= i;
            i++;
        }
        System.out.println("Factorial: " + factorial);
    }
}
