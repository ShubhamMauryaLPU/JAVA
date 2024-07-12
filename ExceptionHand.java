import java.util.*;
public class ExceptionHand {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        try{
            // int num=Integer.parseInt(str);
            Double num=Double.parseDouble(str);
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        
    }
}
