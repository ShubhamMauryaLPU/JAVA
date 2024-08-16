import java.util.Scanner;

public class Main1 {

    public static int lengthOfLastWord(String s) {
       String str[]=s.split(" ");
       return str[str.length-1].length(); 
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(lengthOfLastWord(str));
    }
}