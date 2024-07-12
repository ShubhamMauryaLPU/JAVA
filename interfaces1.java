public class interfaces1 {
    public static void main(String args[]){
        C c=new C();
        c.fun1();
        c.fun2();
    }
}
interface a{
    void fun1();
    public String color="red";
}
interface b{
    void fun2();
    String color="White";
}
class C implements a,b{
    public void fun1(){
        System.out.println(a.color);
        System.out.println("interface A");
    }
    public void fun2(){
        System.out.println(b.color);
        System.out.println("interface B");
    }
    
}
