public class FinalKey {
    public static void main(String args[]){
        Ani a=new Ani();
        a.print();
        a.display();
        Zif z=new Zif();
        z.print();
        z.display();
    }
}
class Ani{
     int a=10;
    int b=20;
    void print(){
        System.out.println("class Ani: "+a);
    }
    final void display(){
        System.out.println("class Ani :"+b);
    }
}
class Zif extends Ani{
    int a=5;
    int b=30;
    void print(){
        super.a=13;
        System.out.println("Class Zif : "+a);
    }
    // void display(){
    //     System.out.println(b);
    // }
}

