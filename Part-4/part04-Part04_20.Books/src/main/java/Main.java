
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        // implement here the program that allows the user to enter 
        // book information and to examine them
        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed?");
        String toBePrinted = scanner.nextLine();

        for (Book book : books) {
            if (toBePrinted.contains("everything")) {
                System.out.println(book);
            }
            if (toBePrinted.contains("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
