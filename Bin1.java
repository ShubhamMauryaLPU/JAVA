public class Bin1 {
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
          binary.insert(0, decimal % 2);
          decimal /= 2;
        }
        return binary.toString();
      }
public static void main(String args[]){
      int decimal = 4;
      String binaryString = decimalToBinary(decimal);
      System.out.println(decimal + " in binary: " + binaryString);
}
      
}
