import java.util.*;
public class AbsEbox3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1.Exibition");
        System.out.println("2.StageEvent");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:{
                System.out.println("Enter the details in CSV format");
                String[] csv=sc.next().split(",");
                Integer val1=Integer.valueOf(csv[4]);
                Double val2=Double.valueOf(csv[5]);
                Exhibition e=new Exhibition (csv[0],csv[1],csv[2],csv[3],val1,val2);
                e.getName(csv[0]);
                e.getDetail(csv[1]);
                e.gettype(csv[2]);
                e.getOrganiser(csv[3]);
                e.display();
            }
            break;
            case 2:{
                System.out.println("Enter the details in CSV format");
                String[] csv=sc.next().split(",");
                String name1=csv[0].replaceAll("\\s","");
                Integer val1=Integer.valueOf(csv[4]);
                Double val2=Double.valueOf(csv[5]);
                StageEvent e=new StageEvent (name1,csv[1],csv[2],csv[3],val1,val2);
                e.getName(csv[0]);
                e.getDetail(csv[1]);
                e.gettype(csv[2]);
                e.getOrganiser(csv[3]);
                e.display();
            }
            break;
        
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
abstract class Event{
    protected String name;
    protected String detail;
    protected String type;
    protected String organiser;
    abstract Double calculateAmount();
}
class Exhibition extends Event{
    Integer noOfStalls;
    Double rentPerStall;
    Exhibition(String name,String detail,String type,String organiser ,  Integer noOfStalls,Double rentPerStall){
        super.name=name;
        super.detail=detail;
        super.type=type;
        super.organiser=organiser;
        this.noOfStalls=noOfStalls;
        this.rentPerStall=rentPerStall;
    }
    Double calculateAmount(){
        return noOfStalls*rentPerStall;
    }
    void getName(String name){
        super.name=name;
    }
    void getDetail(String detail){
        super.detail=detail;
    }
    void gettype(String type){
        super.type=type;  
    }
    String setName(){
        return name;
    }
    String setDetail(){
        return detail;
    }
    String settype(){
        return type;  
    }
    void getOrganiser(String organiser){
        super.organiser=organiser;
    }
    String setOrganiser(){
        return organiser;
    }
    void display(){
        System.out.println("Exhibition Detail");
        System.out.println("Event Name:"+setName());
        System.out.println("Detail:"+setDetail());
        System.out.println("Type:"+settype());
        System.out.println("Organiser Name:"+setOrganiser());
        System.out.println("Total Cost:"+calculateAmount());

    }
}
class StageEvent extends Event{
    Integer noOfShows;
    Double costPerShow;
    StageEvent(String name,String detail,String type,String organiser ,  Integer noOfShows,Double costPerShow){
        super.name=name;
        super.detail=detail;
        super.type=type;
        super.organiser=organiser;
        this.costPerShow=costPerShow;
        this.noOfShows=noOfShows;
    }
    Double calculateAmount(){
        return costPerShow*noOfShows;
    }
    void getName(String name){
        super.name=name;
    }
    void getDetail(String detail){
        super.detail=detail;
    }
    void gettype(String type){
        super.type=type;  
    }
    void getOrganiser(String organiser){
        super.organiser=organiser;
    }
    String setOrganiser(){
        return organiser;
    }
    String setName(){
        return name;
    }
    String setDetail(){
        return detail;
    }
    String settype(){
        return type;  
    }

    void display(){
        System.out.println("Stage Event Detail");
        System.out.println("Event Name:"+setName());
        System.out.println("Detail:"+setDetail());
        System.out.println("Type:"+settype());
        System.out.println("Organiser Name:"+setOrganiser());
        System.out.println("Total Cost:"+calculateAmount());

    }
}

