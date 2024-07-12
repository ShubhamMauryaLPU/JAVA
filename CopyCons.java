
public class CopyCons {
    public static void main(String args[]){
        Student s1=new Student("shubham", 12305091,123);
        s1.print();
        Student s2=new Student(s1);
        s2.pwd=1234;
        s2.print();
    }
    
}
class Student{
    String name;
    int regiNo;
    int pwd;
    Student(String name,int regiNo,int pwd){
        this.name=name;
        this.regiNo=regiNo;
        this.pwd=pwd;
    }
    Student(Student s1){
        this.name=s1.name;
        this.regiNo=s1.regiNo;
    }
    void print(){
        System.out.print(name +"\n"+ regiNo+"\n" + pwd+"\n");
    }
}