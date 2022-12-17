import java.util.Scanner;

public class DoWhileExample2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Enter a negative number");
            number = scanner.nextInt();
        }while(number > -1);

    }

}
