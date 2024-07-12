public class ques19 {
    public static boolean com (String str , String str1){
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str1.length();i++){
                if(str.charAt(i)!=str1.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str1="shubham";
        String str2="shubham";
        
        System.out.println(com(str1,str2));
    }
}
