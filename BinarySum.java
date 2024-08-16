import java.util.*;
public class BinarySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int num1=Integer.parseInt(str1.replaceAll("1","9"));
        int num2=Integer.parseInt(str2);
        System.out.println(String.valueOf(num1+num2));
    }
}
