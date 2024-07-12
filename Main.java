import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values: ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("The addition is: "+(a+b));
            System.err.println("The substraction is "+(a-b));
            System.out.println("Multiplication is: "+(a*b));
            System.out.println("The division is "+(a/b));
            throw new MyExp("You are dividing with zero");
    }  
}
class MyExp extends Exception{
    MyExp(String msg){
        super(msg);
    }
}
