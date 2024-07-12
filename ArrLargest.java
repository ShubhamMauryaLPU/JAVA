//import java.util.*;
public class ArrLargest {

    public static int largest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static int smallest(int arr[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        return smallest;
    }
   public static void main(String args[]){
        int arr[]={10,11,12,13,14,15,1,2,3,4};
        
        System.out.println(largest(arr));
        System.out.print(smallest(arr));

   } 
}
