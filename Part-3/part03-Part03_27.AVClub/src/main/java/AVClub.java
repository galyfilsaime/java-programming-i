
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] strings = input.split(" ");

            for (int i = 0; i < strings.length; i++) {
                String word = strings[i];
                
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }

    }
}
