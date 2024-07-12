public class DecToBin1 {


        public static void DecToBin(int decNo){
            int[] num = new int[32];

            int j = 0;
            while(decNo > 0 ){
                num[j] = decNo % 2;
                decNo = decNo/2;
                j++;
            }

            for(int i=j-1; i>=0; i--){
                System.out.print(num[i]);
            }
            
        }
        public static void main(String args[])
        {
            DecToBin(4);
        }
    
    
}
