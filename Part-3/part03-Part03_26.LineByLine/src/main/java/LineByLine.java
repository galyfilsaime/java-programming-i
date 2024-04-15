
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] strings = input.split(" ");
            for (int i = 0; i < strings.length; i++) {
                System.out.println(strings[i]);
            }
        }
    }
}
