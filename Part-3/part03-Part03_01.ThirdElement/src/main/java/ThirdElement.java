
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            names.add(input);
            
            if (input.equals("")) {
                break;
            }
        }
        System.out.println(names.get(2));
    }
}
