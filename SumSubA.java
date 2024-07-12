public class SumSubA {

    public static void printSum(int num[]){
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;i<num.length;i++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    sum+= num[k];
                    System.out.println("sum is : "+sum);
                }
            }
        }
    }
    public static void main(String args[]){
        int num[]={1,2,3,4};
        printSum(num);
    }   
}
