/**
 * 3
 */

public class LogicalOperators {

    public static void main(String[] args) {

        int x = 43;
        int y = 35;
        int z = 12;
        int t = 57;


        boolean q = x < y; //false
        boolean p = z < t; //true

        /*
          && -> Logical AND
          || -> Logical OR     (pipe)
          !  -> Logical NOT
        */

        boolean result = p && q;

        System.out.println(result);

        boolean result2 = p || q;

        System.out.println(result2);

        boolean result3 = !(p && q);

        System.out.println(result3);

        boolean result4 = (5 > 6) && (12 < 17);
        boolean result5 = (x < y) || (t > z);

        boolean result6 = p & q; // önerilmez







    }

}
