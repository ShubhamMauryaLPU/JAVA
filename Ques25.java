import java.util.*;
public class Ques25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n=sc.nextInt();
        int comp=Integer.MAX_VALUE;
        double restult=0;
        int i=0;
        while(n>0){
            int lastdigit=n%10;
            int a=comp;
            if(lastdigit<comp){
                restult+=Math.pow(10,i)*lastdigit;
                comp=lastdigit;
                i++;
            }
            n=n/10;
        }
        System.out.println((int)restult);
    }
}
