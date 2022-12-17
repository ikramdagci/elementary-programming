import java.util.Scanner;

public class Arrays3 {

    public static void main(String[] args) {
        // arguments
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        int length = scanner.nextInt();

        int[] array = new int[length];
        System.out.println("Array created with " + length + " length.");

        int lastItem = array[length - 1];
        array[length - 1] = 50;

        System.out.println("Last item : " + lastItem);
        System.out.println("Last item of array : " + array[length - 1]);


    }
}
