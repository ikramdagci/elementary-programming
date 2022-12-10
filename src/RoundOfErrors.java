/**
 * 1. RoundOfErrors
 */
public class RoundOfErrors {




    public static void main(String[] args) {

        // 0.1 -> 0.00011 0011 0011 0011 0011 0011 0011 0011 0  011 0011 0011 0011 0011 0011 0011

        // (10 / 3) = 3.333
        // (10/3 + 10/3 + 10/3) = 9.99999999
        double d = 1.0;
        System.out.println(d - 0.1 - 0.1 - 0.1 - 0.1 - 0.1); // 0.5
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1); // 0.5

    }


}
