
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }
        for (int number : numbers){
            sum += number;
        }
        double average = (double)sum / numbers.size();
        System.out.println("Average: " + average);
    }
}
