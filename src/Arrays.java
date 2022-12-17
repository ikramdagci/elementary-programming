public class Arrays {

    public static void main(String[] args) {

        int[] intArray = {0,1,2,3,4,5,6,7,8,9};
        int intArray1[] = {0,1,2,3,4,5,6,7,8,9};
        //int intArray2 = {0,1,2,3,4,5,6,7,8,9}; compile error





        int[] intArray2 = {41,25,54};
         //                 0  1  2
        for(int counter = 0; counter < intArray2.length;counter++){
            int element = intArray2[counter];
            System.out.println(element);
        }

        int lastIndex = intArray2.length - 1;
        int lastElement = intArray2[lastIndex];
        System.out.println(lastElement);






    }



}
