public class AbsClass {
    public static void main(String args[]){
        Horse sc=new Horse();
        sc.color="black";
        Chicken s=new Chicken();
        s.color="yellow";
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called");
    }
    void walk(){
        System.out.println("walks on four legs");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken constructor is called");
    }
    void walk(){
        System.out.println("walks on two legs");
    }
}