import java.util.*;
public class ques18 {
    public static void vowel(String str){
        int count=0;
        StringBuilder str1=new StringBuilder(" ");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
                count++;
                str1.append(ch);
            }
            if(ch=='A'||ch=='E'|| ch=='I' || ch=='O' || ch=='U'){
                count++;
                str1.append(ch);
            }
        }
        System.out.println("The vowel count is : "+count+" Vowels : "+str1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        vowel(str);
    }
}
