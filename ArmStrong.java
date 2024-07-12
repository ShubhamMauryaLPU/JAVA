import java.util.*;
public class ArmStrong {
    public static void checkNo(int num){
        int n=num;
        int sum=0;
        int length=Integer.toString(num).length();
        
        while(num>0){
            int lastdigit=num%10;
            sum+=Math.pow(lastdigit,length);
            num=num/10;
        }
        if(n==sum){
            System.out.println("Arm strong no "+sum);
        }
        else{
            System.out.println("not a armStrong number "+sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkNo(n);
    }
    
}