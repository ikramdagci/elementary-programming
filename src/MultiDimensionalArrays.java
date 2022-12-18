public class MultiDimensionalArrays {

    public static void main(String[] args) {


       //int[] arr = new int[4];

        int[][] multiArr = new int[2][4];

        for(int i = 0; i < multiArr.length;i++){

            int[] intArr = multiArr[i]; // 2, 5, 7

            for(int j = 0;j < intArr.length;j++) {
                int element = intArr[j];
                System.out.print(element + " ");
            }

            System.out.println();

        }


    }
}
