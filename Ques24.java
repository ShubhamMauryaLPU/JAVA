import java.util.*;
public class Ques24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        while(n>0){
            int lastdigit=n%10;
            list.add(lastdigit);
            n=n/10;
        }
        Collections.sort(list,Collections.reverseOrder());
        double restult=0;
        for(int i=list.size()-1;i>=0;i--){
            restult+=Math.pow(10,i)*list.get(i);
        }
        System.out.println((int)restult);
        sc.close();
    }
    
}