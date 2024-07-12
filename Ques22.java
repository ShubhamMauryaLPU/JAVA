import java.util.*;
public class Ques22 {

    public static int wordCount(String str){
        int count=1;
        if(str.charAt(0)==' '){
            return 0; 
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().trim();
        System.out.println(wordCount(str));
        
    }
}

