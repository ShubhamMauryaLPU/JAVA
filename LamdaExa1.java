import java.util.*;
public class LamdaExa1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Event>list=new ArrayList<>();
        System.out.println("Enter the number of events");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String[] str=sc.nextLine().split(",");
            Double d=Double.parseDouble(str[2]);
            // Event e=new Event(str[0],str[1],d);
            list.add(new Event(str[0],str[1],d));
        }
        Event s=new Event();
        s.display(list);
    }
}
class Event{
    String eventName;
    String organiserName;
    Double eventCost;
    Event(){}
    Event(String eventName,String organiserName,Double eventCost){
        this.eventName=eventName;
        this.organiserName=organiserName;
        this.eventCost=eventCost;
    }
    void getEventName(String eventName){
        this.eventName=eventName;
    }
    String setEventName(){
        return eventName;
    }
    void getOrganiserName(String orgainserName){
        this.organiserName=orgainserName;
    }
    String setOrganiserName(){
        return organiserName;
    }
    void getEventCost(Double eventCost){
        this.eventCost=eventCost;
    }
    Double setEventCost(){
        return eventCost;
    }
    void display(ArrayList<Event>eventList){
        eventList.forEach(s->System.out.println(s.setEventName()+"|"+s.setOrganiserName()+"|"+s.setEventCost()));
    }
}