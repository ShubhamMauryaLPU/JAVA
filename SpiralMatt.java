public class SpiralMatt {
    public static void spiral(int arr[][]){
        int startR=0;
        int endR=arr.length-1;
        int startC=0;
        int endC=arr[0].length-1;
        while(startR<=endR && startC<=endC){
            for(int j=startC;j<=endC;j++){
                System.out.print(arr[startR][j]+ " ");
            }
            for(int i=startR+1;i<=endR;i++){
                System.out.print(arr[i][endC] + " ");
            }
            for(int j=endC-1;j>=startC;j--){
                if(startR==endR){
                    break;
                }
                System.out.print(arr[endR][j] + " ");
            }
            for(int i=endR-1;i>=startR;i--){
                if(startC==endC){
                    break;
                }
                System.out.print(arr[i][startC] + " ");
            }
            startR++;
            startC++;
            endC--;
            endR--;
        }
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(arr);

    }
}
