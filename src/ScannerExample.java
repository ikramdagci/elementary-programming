import java.util.Scanner;

/**
 * 8
 */
public class ScannerExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name");

        String name = input.next();

        System.out.println("Hello " + name);

        System.out.println("Please enter your age");

        int age = input.nextInt();

        System.out.println("You are " + age + " years old");


    }
}
