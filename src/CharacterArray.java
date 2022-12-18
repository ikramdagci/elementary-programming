public class CharacterArray {

    public static void main(String[] args) {

        char[] chars = {'H','e','l','l','o',' ','W','o','r','l','d'};

        /*
        String str = "Yunus Emre";
        char[] strChars = str.toCharArray();
        */

        //System.out.println("Hello World");

        for (int i = 0; i < chars.length; i++) {
            char item = chars[i];
            System.out.print((item));
        }

        //for each
        for(char charItem : chars){
            System.out.print(charItem);
        }

    }

}
