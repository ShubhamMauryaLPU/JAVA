
public class RecQues1 {
    public static void decreasingOrder(int n){
        if(n==0){
            return;
        }
        decreasingOrder(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        int n=10;
        decreasingOrder(n);
    }
    
}