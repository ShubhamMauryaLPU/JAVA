import java.util.Collections;
import java.util.Arrays;
public class StringToUpper {
    public static void main(String[] args) {
        String A="hello";
        String B="java";
        StringBuilder s1=new StringBuilder("");
        StringBuilder s2=new StringBuilder("");
        Character ch=A.charAt(0);
         s1.append(Character.toUpperCase(ch));
         for(int i=1;i<A.length();i++){
            Character ch1=A.charAt(i);
            s1.append(ch1);
         }
        Character ch5=B.charAt(0);
         s2.append(Character.toUpperCase(ch5));
         for(int i=1;i<B.length();i++){
            Character ch6=B.charAt(i);
            s2.append(ch6);
         }
         System.out.println(s1+" "+s2);
    }
}
