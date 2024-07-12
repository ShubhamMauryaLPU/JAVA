import java.util.*;
public class ques3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number (1-7): ");
        int num=sc.nextInt();
        switch (num) {
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
            case 3:
                System.out.print("Tuesday");
            case 4:
                System.out.print("wednesday");
                break;
            case 5:
                System.out.print("Thursday");
            case 6:
                System.out.print("Friday");
            case 7:
                System.out.print("Saturday");
        
            default:
                break;
        }
        sc.close();
    }
}
