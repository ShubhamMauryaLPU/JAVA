import java.util.*;
public class SortString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();i++){
                if(str.charAt(i)==str.charAt(j)&& i!=str.length()){
                    System.out.println(str.charAt(i+1));
                    break;
                }
            }
        }
    }
}