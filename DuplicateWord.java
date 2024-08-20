import java.util.*;

public class DuplicateWord {

    public static void checkWord(String str){
        Set<String>set=new HashSet<>();
        String words[]=str.split(" ");
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    set.add(words[i]);
                }
            }
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        String str= "Big black bug bit a big black dog on his big black nose";
        checkWord(str);
    }
}