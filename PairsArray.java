public class PairsArray {

    public static void pairPrint(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+ numbers[i]+","+ numbers[j]+")"+",");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        pairPrint(arr);
    }
}
