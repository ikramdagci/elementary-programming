/**
 * 4
 */

public class BitwiseOperators {

    public static void main(String[] args) {


        byte b = 25;  // 0 0 0 1 1 0 0 1
        byte b1 = 39; // 0 0 1 0 0 1 1 1
                      // 0 0 0 0 0 0 0 1 AND
                      // 0 0 1 1 1 1 1 1 OR

                        // 0 0 1 0 0 1 1 1
        byte b2 = -107; // 1 0 0 1 0 1 0 1
                        // 1 0 1 1 0 1 1 1 --> -73
                        // 0 0 0 0 0 1 0 1 --> 5

        // Bitwise AND

        int result = b & b1;

        System.out.println(result);


        // Bitwise OR

        int result2 = b | b1;

        System.out.println(result2);

        int result3 = b1 | b2;

        System.out.println(result3);

        int result4 = b1 & b2;

        System.out.println(result4);

        // Bitwise NOT

        byte x = 5; // 0 0 0 0 0 1 0 1
                    // 1 1 1 1 1 0 1 0

        int result5 = ~x;

        System.out.println(result5);

        int y = 5;        //   0 0 0 0 0 0 0 0 ' 0 0 0 0 0 0 0 0 ' 0 0 0 0 0 0 0 0 ' 0 0 0 0 0 1 0 1
                          //   1 1 1 1 1 1 1 1 ' 1 1 1 1 1 1 1 1 ' 1 1 1 1 1 1 1 1 ' 1 1 1 1 1 0 1 0
        int result6 = ~y;

        System.out.println(result6);

        // Bitwise XOR

        byte o = 5; // 00000101
        byte r = 7; // 00000111
                    // 00000010

        int result7 = o ^ r;

        System.out.println(result7);


        // Note

        boolean b3 = true; //  1
        boolean b4 = false; // 0

        boolean result8 = b3 | b4;


    }

}
