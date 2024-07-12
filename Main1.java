
import java.util.*;;
public class Main1 {
    public static void vowelCount(String str){
        int count=0;
        String str1=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u'){
                count++;
                System.out.println("Vowel : "+str1.charAt(i));
            }
        }
        System.out.println("total vowel count "+count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        vowelCount(str);
        sc.close();
    }
}