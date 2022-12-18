public class AssignArrayItems {

    public static void main(String[] args) {

        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            double current = array[i];
            array[i] = 5.0;
            if (i == 0) {
                continue;
            }
            double previous = array[i - 1];
        }

        for (int i = 0; i < array.length; i++) {
            double current = array[i];
            if(i == (array.length - 1)){
                continue;
            }
            double next = array[i + 1];
        }



        for (double item : array) {
            System.out.println(item);
        }

    }
}
