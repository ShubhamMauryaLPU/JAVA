import java.util.*;
public class primeNum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isprime=true;
        if(n==2){
            System.out.print("Prime");
        }
        else{
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime==true){
            System.out.print("Prime");
        }
        else
        System.out.print("Not prime");
        sc.close();
    }
    }
}
