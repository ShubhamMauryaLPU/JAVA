public class StaticVar {
    public static void main(String args[]){
        Student s1=new Student();
        s1.Schoolname="LPU";
        System.out.println(s1.Schoolname);
        Student s2=new Student();
        System.out.println(s2.Schoolname);
    }
}
class Student{
    String name;
    int roll;
    String Schoolname;
    void set(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    
    String get(){
        return name;
    }
}
