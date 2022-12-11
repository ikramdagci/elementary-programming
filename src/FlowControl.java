public class FlowControl {


    public static void main(String[] args) {


        /**

         while(<boolean_expression>) {
            // repeated statements
         }

         */

        int counter = 0;

        while(counter < 10) {
            System.out.println("Hello world : " + counter);
            counter++;
        }

        System.out.println("Out of loop");

    }

}
