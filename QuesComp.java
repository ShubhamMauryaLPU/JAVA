import java.util.*;
public class QuesComp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j;
        Complex c=new Complex();
        System.out.println("Enter real No: ");
        i=sc.nextInt();
        System.out.println("Enter real No: ");
        j=sc.nextInt();
        c.real(i);
        c.Img(45);
        c.print();
    }
}
class Complex{
    int real;
    int img;
    void real(int real){
        this.real=real;
    }
    void Img(int img){
        this.img=img;
    }
    void print(){
        System.out.println(real +"+"+ "i "+img);
    }
}
