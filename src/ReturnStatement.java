public class ReturnStatement {


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if(i == 7) {
                System.out.println("found i as 7");
                System.out.println(5+5);
                return;
            }
            System.out.println(i);
        }

        System.out.println("Outer");

        return;
    }


}
