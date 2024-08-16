import java.util.*;
public class PlusOne {

    public static void addPlusOne(int digits[]){
        int m=digits.length-1;
        for(int i=m;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                return;
            }
            digits[i]=0;
        }
        int arr[]=new int[digits.length+1];
        arr[0]=1;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        addPlusOne(arr);

        
    }
}
