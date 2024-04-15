
import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[8];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int search = Integer.valueOf(scanner.nextLine());
//        System.out.println(search);
        // Implement the search functionality here
        int index = 0;
        int foundAt = 0;
        while (index < array.length) {
            if (array[index] == search) {
                foundAt = index;
                break;
            } else {
                System.out.println(search + " was not found.");
            }
            index++;
        }
        System.out.println(search + " is at index " + foundAt + ".");
    }

}
