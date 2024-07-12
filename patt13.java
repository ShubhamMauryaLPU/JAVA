public class patt13 {
    public static void main(String arg[]){
        int m=1;
        for(int i=4;i>=1;i--){
            int j;
            for( j=1;j<i-1;j++){
                System.out.print( " ");
            }
            for(int k=1;k<=j;k++){
                System.out.print(m+ " ");
                m++;
            }
            m--;
            
            System.out.println();
        }
    }
}
