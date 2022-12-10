/**
 * 5
 */
public class ShiftingOperators {

    public static void main(String[] args) {


        // Right shifting

        byte b  = -123; // 1 0 0 0 0 0 1 0 1
                        // 1 1 0 0 0 0 0 1 0


        int result = b >> 1;

        System.out.println(result);



        byte b1 = 10; //  0 0 0 0 1 0 1 0
                      /// 0 0 0 0 0 1 0 1

        int result1 = b1 >> 2;


        // unsigned right shifting
        int result2 = b >>> 1;

        System.out.println(result2);

        // Left shifting

        int result3 = b1 << 1;

        System.out.println(result3);


        // Augmented assignments

        int result4 = 0;
        result4 += result3;


        b1 <<= 1;

        // f(x) = (2x/3)^-1


    }

}
