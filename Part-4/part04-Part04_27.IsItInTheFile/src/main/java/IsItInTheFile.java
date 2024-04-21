
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                strings.add(file.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        if (strings.size() > 0) {
            if (strings.contains(searchedFor)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } else {
            System.out.println("Reading the file " + fileName + " failed.");
        }
    }
}
