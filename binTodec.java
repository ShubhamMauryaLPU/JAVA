import java.util.*;
public class binTodec {

    public static void bin(int binNo){
        int mynum=binNo;
        int pow=0;
        int decNo=0;
        while(binNo>0){
            int lastDigit=binNo%10;
            decNo=decNo+(lastDigit * (int)Math.pow(2,pow));
            binNo=binNo/10;
            pow++;
        }
        System.out.print("Decimal of "+mynum + " = "+decNo);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        bin(n);
        sc.close();
    }
}
