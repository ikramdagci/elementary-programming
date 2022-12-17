import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int[] arr = {45, 85, 70, 41};

        int reduce = Arrays.stream(arr).reduce(0, (left, right) -> left + right);
        System.out.println(reduce);


    }


}
