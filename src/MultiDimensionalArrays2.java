public class MultiDimensionalArrays2 {

    public static void main(String[] args) {

        int[][] multiArr = new int[2][4];

        for(int i = 0; i < multiArr.length;i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                int element = multiArr[i][j];
                System.out.print(element + " ");
            }
            System.out.println();
        }






    }

}
