import java.util.*;
public class DuplicatChar {
    public static void checkDup(String str){
        Set<Character>set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j) && str.charAt(i)!=' '){
                    set.add(str.charAt(i));
                }
            }
        }
        System.out.println(set);
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String str=sc.nextLine().trim().toLowerCase();
        checkDup(str);
    }
}
