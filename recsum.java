public class recsum {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int sum1=n;
        sum1+=sum(n-1);
        return sum1;
    }
    public static void main(String args[]){
        sum(5);
    }
}
