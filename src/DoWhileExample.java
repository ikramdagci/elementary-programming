import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {

        /*

         Karesi, girilen bir pozitif tamsayıdan küçük veya eşit olan en büyük tamsayı nedir?

         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("N > ");
        int n = scanner.nextInt();

        int number = 1;
        int square = 0;

        do {
            square = number * number;
            number++;
        } while(square <= n);

        System.out.println(number - 2);

        /*
        double sqrt = Math.sqrt(n);
        System.out.println(sqrt);
        System.out.println((int)sqrt);
        */



        /*
        while(square < n) {
            square = number * number;
            number++;
        }

        System.out.println(number);

*/










    }

}
