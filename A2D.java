import java.util.*;
public class A2D {
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void search(int ar[][],int key){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                if(ar[i][j]==key){
                    System.out.print(i + " " +j);
                }
            }
        }
        System.out.print("key not found");
    }
    public static void main(String args[]){
        int arr[][]=new int[3][3];
        int key=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        print(arr);
        search(arr, key);
        sc.close();
    }
}
