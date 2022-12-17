public class Arrays2 {

    public static void main(String[] args) {

        //intArray3.length = 5; error! read only field

        int[] intArray3 = new int[100];
        //int length = intArray3.length;

        for(int counter = 0; counter < intArray3.length;counter++){
            int element = intArray3[counter]; // 0 , 1
            System.out.print(element);
            System.out.print(",");
        }

    }

}
