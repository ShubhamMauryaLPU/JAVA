
public class AnoniClass {
    public static void main(String[] args) {
        Ano a=new Ano() {
            @Override
            public void meth1() {
                System.out.println("meth1");
            }
            public void meth2(){
                System.out.println("meth2");
            }
        };
        a.meth1();
    }
    
}
interface Ano{
    void meth1();
    void meth2();
}