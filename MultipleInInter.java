public class MultipleInInter {
    public static void main(String args[]){
        Study s=new Study();
        s.print();
        s.show();
    }
}
interface J{
    void print();
}
interface P{
    void show();
}
class Study implements J, P{
    public void print(){
        System.out.println("I am currently studying java");
    }
    public void show(){
        System.out.println("As well as python");
    }
}
