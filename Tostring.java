
public class Tostring {
    public static void main(String args[]){
        Stu s=new Stu();
        System.out.println(s);
    }
    
}
class Stu{
    int a=10;
    String name ="shubham";
    public String  toString(){
        return a+" "+name;
    }
}