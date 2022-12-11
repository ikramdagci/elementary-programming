import java.util.Scanner;

public class WhileExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter N ");
        int n = input.nextInt();

        int counter = 1;
        int total = 0;

        while(counter < n) {
            total = total + counter;
            counter++;
        }

        System.out.println(total);



    }

}
