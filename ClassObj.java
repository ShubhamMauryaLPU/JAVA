public class ClassObj {
    public static void main(String args[]){
        pen p1=new pen();
        p1.setcol("blue");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}
class pen{
    String color;
    int tip;
    void setcol(String Ncol){
        color=Ncol;
    }
    void setTip(int newtip){
        tip=newtip;
    }
}
