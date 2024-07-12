import java.util.*;
public class bin {
    public static void Bin(int binNo){
        int pow=0;
        int  decNo=0;
        while(binNo>0){
            int lastDigit =binNo% 10;
            decNo=decNo+(lastDigit+ (int)Math.pow(2,pow));
            binNo=binNo/10;
        }
        System.out.print("decimal of "+ binNo +" = "+ decNo);
    }
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Bin(n);

        sc.close();
    }
}
