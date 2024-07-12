import java.util.*;

public class Ques23 {

    public static String RemoveVowel(String str) {
        StringBuffer str1 = new StringBuffer("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o'
                    && str.charAt(i) != 'u'
                    && str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O'
                    && str.charAt(i) != 'U') {
                str1.append(str.charAt(i));
            }
        }
        return str1.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // System.out.println(RemoveVowel(str));

        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            ch += str.charAt(i);
        }
        System.out.println(ch);
    }

}
