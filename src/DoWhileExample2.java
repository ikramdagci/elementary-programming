import java.util.Scanner;

public class DoWhileExample2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Lütfen negatif bir tamsayı giriniz");
            number = scanner.nextInt();
        }while(number > -1);

    }

}
