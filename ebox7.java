import java.util.*;
public class ebox7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the event:");
        String name=sc.nextLine();
        System.out.println("Enter the detail of the event:");
        String detail=sc.nextLine();
        System.out.println("Enter the ownername of the event:");
        String ownername=sc.nextLine();
        System.out.println("Enter the type of the event:");
        System.out.println("1.Exhibition");
        System.out.println("2.StageEvent");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:{
                System.out.println("Enter the number of stall");
                Integer stall=sc.nextInt();
                Exhibition e=new Exhibition(name, detail, ownername,stall);
                System.out.println("The projected revenue of the event is "+e.projectedRevenue());
            }  
                break;
            case 2:{
                System.out.println("Enter the number of shows:");
                Integer shows=sc.nextInt();
                System.out.println("Enter the number of seats per show:");
                Integer seats=sc.nextInt();
                StageEvent s=new StageEvent(name, detail, ownername, shows, seats);
                System.out.println("The projected revenue of the event is "+s.projectedRevenue());
                
            }
        
            default:
                break;
        }

        sc.close();
    }
}
abstract class Event{
    String name;
    String detail;
    String ownername;
    Event(String name,String detail,String ownername){
        this.name=name;
        this.detail=detail;
        this.ownername=ownername;
    }
    abstract public Double projectedRevenue();
}
class Exhibition extends Event{
    Integer noOfStall;
    Exhibition(String name,String detail,String ownername,Integer noOfStall){
        super(name,detail,ownername);
        this.noOfStall=noOfStall; 
    }
    public Double projectedRevenue(){
        return 10000.0 *noOfStall;
    }
}
class StageEvent extends Event{
    Integer noOfShows;
    Integer noOfSeatsPerShow;
    StageEvent(String name,String detail,String ownername,Integer noOfShows,Integer noOfSeatsPerShow){
        super(name,detail,ownername);
        this.noOfShows=noOfShows;
        this.noOfSeatsPerShow=noOfSeatsPerShow;
    }
    public Double projectedRevenue(){
        return noOfShows*noOfSeatsPerShow*50.0;
    }
}