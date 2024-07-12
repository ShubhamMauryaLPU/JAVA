import java.util.*;
public class EboxEx6 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the show:");
        int size=sc.nextInt();
        int arr[][]=new int[size][size];
        System.out.println("Enter the number of seats to be booked:");
        int n=sc.nextInt();
        try{
            for(int i=0;i<n;i++){
                System.out.println("Enter the seat number "+(i+1));
                int seat=sc.nextInt();
                if(seat<0 || seat>size*size-1){
                    throw new ArrayIndexOutOfBoundsException("java.lang.ArrayIndexOutOfBoundsException:"+size*size);
                }
                int row=seat/size;
                int col=seat%size;
                if(arr[row][col]==1){
                    throw new Exception("SeatNotAvailableException: Already Booked");
                }
                arr[row][col]=1;
                
            }     
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("The seats booked are:");
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
    }

}
class SeatNotAvailableException extends Exception{
        SeatNotAvailableException(String msg){
            super(msg);
        }
    }