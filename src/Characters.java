public class Characters {

    public static void main(String[] args) {

        char c = 'A'; //16-bit

        byte b = 'A'; //8-bit

        char c1 = 65;

        char c2 = '\uFF4a';

        System.out.println(c2); // ｊ
        System.out.println(c);  // A
        System.out.println(b);  // A , 65
        System.out.println(c1); // A , ' ' ,


    }

}
