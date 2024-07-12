
public class ArrayObject {
    public static void main(String[] args) {
        Hall a[]=new Hall[2];
        a[0]=new Hall(1);
        a[1]=new Hall(2);
        for(Hall hall:a){
            System.out.println(hall.a);
        }
    }
    
}
class Hall{
    int a;
    Hall (int a){
        this.a=a;
    }
}