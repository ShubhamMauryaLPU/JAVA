import java.util.*;
public class Ques26 {
    public static int[] pluseOne(int arr[]) {
        if(arr[arr.length-1]<10){
            arr[arr.length-1]+=1;
        }
        int num=arr.length-1;
        if(arr[arr.length-1]>10){
            while(arr[num]>0){
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size=sc.nextInt();
        int digits[]=new int[size]; 
        for(int i=0;i<size;i++){
            digits[i]=sc.nextInt();
        }
    }
}