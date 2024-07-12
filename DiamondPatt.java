public class DiamondPatt {
    public static void main(String args[]){
        for(int i=5;i>=1;i-- ){  
            for(int j=1;j>i-3;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i-4;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
