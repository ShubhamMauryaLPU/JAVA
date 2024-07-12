public class Outerclass {
    public static void main(String[] args) {
        B b=new B() {
            public void show(){
                System.out.println("class B");
            }
        };
        b.show();
    }
}
abstract class B{
    abstract void show();
}