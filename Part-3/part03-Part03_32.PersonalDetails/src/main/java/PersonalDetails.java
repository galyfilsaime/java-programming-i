
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longest = "";
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] people = input.split(",");
            String name = people[0];
            int age = Integer.valueOf(people[1]);

            if (longest.length() < name.length()) {
                longest = name;
            }
            sum += age;
            count++;
        }
        double average = 1.0 * sum / count;
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + average);
    }
}
