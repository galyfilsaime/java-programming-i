
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int index = 0;
        int last = array.length - 1;
        while (index < array.length - 1) {
            int number = array[index];
            System.out.print(number + ", ");
            index++;
        }
        System.out.print(array[last]);
    }
}
