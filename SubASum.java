public class SubASum {
    


        public static void printArrays(int num[]){
            for(int i=0;i<num.length;i++){
                int sum=0;
                int start=i;
                for(int j=i;j<num.length;j++){
                    int end=j;
                    for(int k=start;k<=end;k++){
                        sum+=num[k];
                        System.out.print(num[k]+" ");
                        
                    }
                    
                    System.out.println();
                }
                System.out.print(sum);
                System.out.println();
            }
        }
    public static void main(String args[]){
            int numbers[]={2,4,6,8,10};
            printArrays(numbers);

    }
        

}
