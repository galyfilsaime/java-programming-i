
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int numberOfDays = Integer.valueOf(scanner.nextLine());
        
        // Calculation to calculate the number of seconds in a day
        int seconds = (numberOfDays *24) * 3600; // 1 day consists of 24 hours and each hour consists of 3600 seconds
        
        System.out.println(seconds);
    }
}
