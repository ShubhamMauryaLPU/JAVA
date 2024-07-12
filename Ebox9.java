import java.util.*;
public class Ebox9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];
        System.out.println("Enter the number of seats to be booked:");
        int num=sc.nextInt();
        try{
            for(int i=1;i<=num;i++){
                System.out.println("Enter the seat number "+i);
                int seat=sc.nextInt();
                arr[seat-1]=seat;
            }
            System.out.println("The seats booked are:");
            for(int i=1;i<100;i++){
                if(arr[i]!=0){
                    System.out.println(arr[i]);
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        

    }
    
}