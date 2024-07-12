import java.util.*;
public class primeNo {
    
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number :");
        int n=sc.nextInt();
        int i=0;
        
        for(i=2;i<=(n-1);i++){
            if(n==2){
                System.out.print("prime no");
                break;
            }
            if(n%i==0){
                System.out.println("Not a prime no");
                break;
            }
        }
        if(n==i){
            System.out.println("prime no");
        }
        sc.close();
    }
}
