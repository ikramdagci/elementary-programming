import java.util.Scanner;


/**
 * 7
 */
public class ScannerDriver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to triangle area calculator!");
        System.out.println("Please enter height:");
//        double h;
        double h = input.nextDouble();
        System.out.println("Please enter width");
        double t = input.nextDouble();

        double area = (h * t) / 2;

        System.out.println("Calculated area is -> " + area);


    }

}
