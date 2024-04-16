
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] people = input.split(",");
            int age = Integer.valueOf(people[1]);
            
            if (age > oldest) {
                oldest = age;
                name = people[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
