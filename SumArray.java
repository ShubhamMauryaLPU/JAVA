import java.util.*;
public class SumArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];
        System.out.println("Enter the number of seats to be booked");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the seat number"+i);
            int no=sc.nextInt();
            arr[no]=no;
        }
        

    }
}