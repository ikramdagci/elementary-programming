import java.util.Scanner;

/**
 * 10
 */

public class TernaryIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age");

        int age = scanner.nextInt();

        boolean canUseVote;

        if(age >= 18) {
            canUseVote = true;
        } else {
            canUseVote = false;
        }

        System.out.println("Can use vote = " + canUseVote);


        System.out.println("How many years are you experienced?");

        int experience = scanner.nextInt();

        int salary = 0;

        if(experience > 5) {
            salary = 10000;
        } else {
            salary = 5000;
        }

        System.out.println("Your salary is : " + salary + "TL");

        // Ternary If

        int salary2 = (experience > 5) ? 10000 : 5000;

        System.out.println("Ternary salary " + salary2);

    }
}
