import java.util.*;
public class ques6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                a=a+i;
            }
        }
        System.out.print(a);
        sc.close();
    }
}
