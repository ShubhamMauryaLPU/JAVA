import java.util.*;
public class ArmSrong {
    public static int check(int n){
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum+=Math.pow(lastdigit,3);
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int num2=check(num);
        if(num==num2){
            System.out.println("The the number is armstrong number");
        }
        else{
            System.out.println("Not a Armstorng number");
        }
        sc.close();
    }
}
