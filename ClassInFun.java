/**
 * ClassInFun
 */
public class ClassInFun {

    int x=10;
    void display(){
        class B{
            public void message(){
                System.out.println("Value= "+x);
            }
        }
        B b=new B();
        b.message();
    }
    
    public static void main(String[] args) {
        ClassInFun c=new ClassInFun();
        c.display();
    }
    
}