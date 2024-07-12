public class DecTobin {

    public static void DecToBin(int decNo){
        String str = "";
        while(decNo>0)
        {
            int rem=decNo%2;
            str+=rem;
            decNo=decNo/2;
        }

        for(int i = str.length()-1; i >=0; i--){
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String args[])
    {
        DecToBin(4);
    }
}
