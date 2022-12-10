import java.util.Scanner;

/**
 * 9
 */
public class ConditionalOperators {


    public static void main(String[] args) {

        /*
            if(<boolean_expression>){
                // true
            } else {
                // false
            }
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a as integer");
        int a = input.nextInt();
        System.out.println("Please enter b as integer");
        int b = input.nextInt();

        if(a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }

        System.out.println();

        if(a > b){
            System.out.println("a is greater than b");
        } else if (a == b) {
            System.out.println("a is equals to b");
        } else {
            System.out.println("a is less than b");
        }




        // Ternary If





    }

}
