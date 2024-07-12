public class Inheritence {
    public static void main(String args[]){
        Fish shark=new Fish();
        shark.eat();
        shark.breathes();
        shark.swim();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathes(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        super.color="red";
        System.out.println("Swims in water");
        System.out.println(color);
    }
    
}
