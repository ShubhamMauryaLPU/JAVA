// import java.util.*;
// public class DecToHex {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter binary number");
//         String bin=sc.next();
//         System.out.println("Enter octal number");
//         String oct=sc.next();
//         System.out.println("Enter hexadecimal number");
//         String hex=sc.next();
//         Wrapper w=new Wrapper();
//         w.bin(bin);
//         w.oct(oct);
//         w.hex(hex);
//         w.print(bin, oct, hex);


//     }
    
// }
// class Wrapper{
//     int bin1;
//     int oct1;
//     int hex1;
//     void bin(String bin){
//         bin1=Integer.parseInt(bin,2);
//     }
//     void oct(String oct){
//         oct1=Integer.parseInt(oct,8);
//     }
//     void hex(String hex){
//         hex1=Integer.parseInt(hex,16);
//     }
//     void print(String bin,String oct,String hex){
//         System.out.println("The integer value of the binary number"+bin+" is "+bin1);
//         System.out.println("The integer value of the octal number"+oct+" is "+oct1);
//         System.out.println("The integer value of hexadecimal number"+hex+" is "+hex1);
//     }
// }
import java.util.Scanner;

public class Student {
    private String studentName;
    private int registerNumber;
    private static int noOfStudents = 0;

    public Student(String studentName, int registerNumber) {
        this.studentName = studentName;
        this.registerNumber = registerNumber;
        noOfStudents++;
    }

    public static int getNoOfStudents() {
        return noOfStudents;
    }

    public void displayStudentDetails(int studentNumber) {
        System.out.println("Details of student " + studentNumber + " :");
        System.out.println("Register Number : " + registerNumber);
        System.out.println("Name : " + studentName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100]; // Assuming maximum 100 students

        int studentCount = 0;
        String choice;

        do {
            System.out.println("Enter the student details :");
            System.out.println("Enter the register number :");
            int registerNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter the name :");
            String studentName = scanner.nextLine();

            students[studentCount] = new Student(studentName, registerNumber);
            studentCount++;

            System.out.println("Do you want to continue [ Yes / No ] :");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("Yes"));

        System.out.println("Number of Students are : " + Student.getNoOfStudents());

        for (int i = 0; i < studentCount; i++) {
            students[i].displayStudentDetails(i + 1);
        }

        scanner.close();
    }
}
// import java.util.*;
// public class  Main{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         student s[]=new student[100];
//         int count=0;
//         String str;
//         System.out.print("Enter the student detail : ");
//         do{
//             System.out.println("Enter register number : ");
// …    void display(){
//         System.out.println("Number of Student are : "+count);
//         for(int i=1;i<=count;i++){
//             System.out.println("Details od student "+i+" : "+count);
//             System.out.println("Register Number : "+i);
//             System.out.println("Name : "+name);
            
//         }
//     }
// }