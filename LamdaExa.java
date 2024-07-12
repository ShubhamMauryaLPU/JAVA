import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LamdaExa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Hall>list=new ArrayList<>();
        // Hall h=new Hall();
        System.out.println("Enter the number of halls:");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String[] str=sc.nextLine().split(",");
            Double h1=Double.parseDouble(str[1]);
            list.add(new Hall(str[0],h1,str[2]));
        }
        // Collections.sort(list,Comparator.comparing(Hall::getCostPerDay));
        Collections.sort(list,(hall1,hall2)->hall1.getOwner().compareTo(hall2.getOwner()));
        System.out.format("%-15s %-10s %s\n","Name","Cost","Owner");
        for(Hall hall: list){
            System.out.format("%-15s %-10s %s\n",hall.getName(),hall.getCostPerDay(),hall.getOwner());
        }
    }
}
class Hall{
    String name;
    Double costPerDay;
    String owner;
    Hall(){}
    Hall(String name,Double costPerDay,String owner){
        this.costPerDay=costPerDay;
        this.name=name;
        this.owner=owner;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setOwner(String owner){
        this.owner=owner;
    }
    String getOwner(){
        return owner;
    }
    void setCostPerDay(Double costPerDay){
        this.costPerDay=costPerDay;
    }
    Double getCostPerDay(){
        return costPerDay;
    }
    
}