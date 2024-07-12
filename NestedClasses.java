
public class NestedClasses {
    private static int x=10;
    public static class Myclass{
        public void print(){
            System.out.println("print x : "+x);
        }
    }
    public static void main(String args[]){
        // NestedClasses n=new NestedClasses();
        // System.out.println(x);
        // Myclass c =new Myclass();
        // c.print();
        NestedClasses n=new NestedClasses();
        NestedClasses.Myclass.print();
    }  
}