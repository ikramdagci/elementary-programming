import java.util.Random;
import java.util.Scanner;

public class MatrixExample {

    public static void main(String[] args) {

//        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] multiArr = new int[2][4];


        //assign
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                multiArr[i][j] = scanner.nextInt();
            }
        }


        //print
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                int element = multiArr[i][j];
                System.out.print(element + " ");
            }
            System.out.println();
        }



    }

}
