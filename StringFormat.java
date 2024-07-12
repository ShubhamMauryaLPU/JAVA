import java.util.Scanner;

public class StringFormat {
    public static String av(int arr[],int N){
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
        int av=sum/N;
        String str=String.format("%.2f",av);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        int sum=0;
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum+" "+av(arr, N));
        
    }
}
