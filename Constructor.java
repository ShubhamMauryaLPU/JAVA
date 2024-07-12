public class Constructor {
    public static void main(String args[]){
        Student s1=new Student("shubham",45);
        s1.name="maurya";
    }
}
class Student{
    String name;
    int rollNo;
    Student(String name,int rollNo){
        System.out.println("Constructor is called....");
        this.name=name;
        this.rollNo=rollNo;
        System.out.println(name);
        System.out.println(rollNo);
    }
}
