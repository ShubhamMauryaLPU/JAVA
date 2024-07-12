import java.util.HashMap;
public class HashMap1 {
    public static void main(String args[]){
        //create
        HashMap<String,Integer>hm=new HashMap<>();
        //insert
        hm.put("India",140);
        hm.put("China", 135);
        hm.put("USA",35);
        hm.put("Russia",14);
        System.out.println(hm);
        int population=hm.get("India");
        System.out.println(population);
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonasia"));
    }
}
