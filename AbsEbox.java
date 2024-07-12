import java.util.*;
public class AbsEbox {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("List of Shapes:");
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Square");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:{
                System.out.println("Enter the radius of the Circle:");
                float radius=sc.nextFloat();
                Shape c=new Circle(radius);
                System.out.printf("The perimeter is %.2f ",c.calculatePerimeter());
            }
                break;
            case 2:{
                System.out.println("Enter the length of the Rectangle:");
                float length=sc.nextFloat();
                System.out.println("Enter the breadth of the Rectangle:");
                float breadth=sc.nextFloat();
                Shape r=new Rectangle(length, breadth);
                System.out.printf("The perimeter is %.2f ",r.calculatePerimeter());

            }
                break;
            case 3:{
                System.out.println("Enter the side of the Square:");
                float side=sc.nextFloat();
                Shape s=new Sqaure(side);
                System.out.printf("The perimeter is %.2f",s.calculatePerimeter());
            }
            default:
                break;
        }
    }
}
abstract class Shape{
    public abstract Double calculatePerimeter();
}
class Rectangle extends Shape{
    float length;
    float breadth;
    Rectangle(float length,float breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public Double calculatePerimeter(){
        return Double.valueOf(2*(length+breadth));
    }
}
class Circle extends Shape{
    float radius;
    Circle(float radius){
        this.radius=radius;
    }
    public Double calculatePerimeter(){
        return 2*3.14*radius;
    }
}
class Sqaure extends Shape{
    float side;
    Sqaure(float side){
        this.side=side;
    }
    public Double calculatePerimeter(){
        return Double.valueOf(4*side);
    }
}
