import java.util.*;
public class RangeOTab {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            for(int j=1;j<=10;j++){
                System.out.print(i*j+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
