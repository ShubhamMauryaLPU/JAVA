import java.util.*;
public class EboxL3 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      //interface
      List<Event>list=new ArrayList<>();
      System.out.println("Enter number of events");  
      int n=sc.nextInt();
      sc.nextLine();
        System.out.println("Enter event details in CSV(Event Name,Event Type,Orgnaizer Name)");
        for(int i=0;i<n;i++){
            String[] str=sc.nextLine().split(",");
            Event e=new Event(str[0],str[1],str[3]);
            list.add(e);
        }
        System.out.println("Filter:");
        System.out.println("1) Using Event name");
        System.out.println("2) Using Event type");
        System.out.println("3) Using Organizer name");
        System.out.println("Choice:");
        int c=sc.nextInt();
        


    }
    
}
class Event{
    String eventName;
    String eventType;
    String organizer;
    Event(){}
    Event(String eventName,String eventType,String organizer){
        this.eventName=eventName;
        this.eventType=eventType;
        this.organizer=organizer;
    }
    public List<Event>filterEvent(List<Event>eventList,String name,int id){
        return eventList;
    }
}