public class Stringcomp {
    public static int compare(String str1,String str2){
        return str1.compareTo(str2);
    }
    public static void main(String args[]){
        String str1=new String("shubham");
        String str2=new String("shubha");
        int a=compare(str1, str2);
        System.out.println(a);
        
    }
}
