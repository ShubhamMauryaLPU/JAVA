import java.util.*;
public class String1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string : ");
        String[] name=sc.nextLine().split(",");
        // for(int i=0;i<name.length;i++)
        // System.out.println(name[i]);
        // String name1=name[0].replaceAll("\\s","");
        System.out.println(name[0]);
        System.out.println(name[1]);
    }
}
