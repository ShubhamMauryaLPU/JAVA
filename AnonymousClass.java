
public class AnonymousClass {
    interface A{
        void display();
    }
    static abstract class B{
        abstract void print();
    }
    public static void main(String[] args) {
        A a=new A() {
            @Override
            public void display() {
                System.out.println("Interface");
                
            }
        };
        a.display();
        B b=new B() {
            public void print(){
                System.out.println("class B");
            }
        };
        b.print();
    }
    
}