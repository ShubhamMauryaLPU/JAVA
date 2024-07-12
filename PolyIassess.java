import java.util.*;
public class PolyIassess {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name of the stall:");
    String name=sc.nextLine();
    System.out.println("Enter the detail of the stall:");
    String detail=sc.nextLine();
    System.out.println("Enter the owner name of the stall:");
    String ownername=sc.nextLine();
    System.out.println("Enter the type of the stall:");
    String type=sc.next().trim();
    System.out.println("Enter the size of the stall in square feet:");
    Integer size=sc.nextInt();
    System.out.println("Does the stall have the TV?(y/n)");
    char ch=sc.next().charAt(0);
    Integer number=0;
    if(ch=='y'){
        System.out.println("Enter the number of TV:");
        number=sc.nextInt();
    }
    Stall s=new Stall(name,detail,ownername);
    if(ch=='y'){
        System.out.println(s.computeCost(type,size,number));
    }
    else{
        System.out.println(s.computeCost(type, size));
    }
   } 
}
class Stall{
    String name;
    String detail;
    String ownerName;
    Stall(){}
    Stall(String name,String detail,String ownerName){
        this.name=name;
        this.detail=detail;
        this.ownerName=ownerName;
    }
    public Double computeCost(String stallType,Integer squareFeet){
        if(stallType.equals("Gold")){
            return 100.0*squareFeet;
        }
        else if(stallType=="Diamond"){
            return 150.0*squareFeet;
        }
        System.out.println(stallType);
        return 200.0*squareFeet;
    }
    public Double computeCost(String stallType,Integer squareFeet,Integer numberofTV){
        if(stallType=="Platinum"){
            return (200.0*squareFeet)+(numberofTV*10000);
        }
        else if(stallType=="Diamond"){
            return (150.0*squareFeet)+(numberofTV*10000);
        }
        return (100.0*squareFeet)+(numberofTV*10000);
    }
}
