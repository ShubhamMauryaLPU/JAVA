import java.util.*;
public class StringsComp {
    public static boolean compare(String str,String str1){
        boolean bool;
        bool=str.equals(str1);
        return bool;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=new String("shubham");
        
        String str1=new String("maurya");
        boolean bool=compare(str, str1);
        System.out.println(bool);
    }
}
