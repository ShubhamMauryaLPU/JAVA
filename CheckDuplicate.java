import java.util.*;

public class CheckDuplicate {

    public static void check(String str) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i) && str.charAt(i)!=' ') {
                    set.add(Character.valueOf(str.charAt(i)));
                }
            }
        }
        System.out.println(set);
    }
    public static void check1(String str) {
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar != ' ') {
                if (seen.contains(currentChar)) {
                    duplicates.add(currentChar);
                } else {
                    seen.add(currentChar);
                }
            }
        }
        System.out.println(duplicates);
    }
    public static void check2(String str){
        Set<Character>set=new HashSet<>();
        int i=0;
        for(int j=i+1;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)){
                set.add(str.charAt(i));
            }
            if(j==str.length()-1){
                i++;
                System.out.println(i);
            }
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine().trim().toLowerCase();
        String str="shubham kumar maurya";
        check1(str);
    }
}
