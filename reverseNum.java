import java.util.*;
public class reverseNum {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num=sc.nextInt();
        while(num>0){
            int lastDigit=num%10;
            System.out.print(lastDigit);
            num=num/10;
        }
        sc.close();
    }
}
