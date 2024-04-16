import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();
        int greatest = 0;
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] people = input.split(",");
            ages.add(Integer.valueOf(people[1]));
            
            for (int i = 0; i < ages.size(); i++) {
                if (greatest < ages.get(i)) {
                    greatest = ages.get(i);
                }
            }
        }
        System.out.println("Age of the oldest: "+ greatest);
    }
}
