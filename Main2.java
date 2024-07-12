import java.util.*;
public class Main2 {

  public static int wordCount(String str){
    int count=1;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)==' '){
        count++;
      }
    }
    return count;
  }
  public static void checkRepAl(String str){
    
    for(int j=0;j<str.length();j++){
      for(int i=j+1;i<str.length();i++){
        if(str.charAt(j)==str.charAt(i) && i<str.length()-1){
          System.out.print(str.charAt(i+1)+" ");
        }
      }
    }
  }
  public static void RotArray(int arr[],int noRot){
    ArrayList<Integer>list=new ArrayList<>();
    for(int i=0;i<arr.length;i++){
      list.add(arr[i]);
    }
    for(int i=0;i<noRot;i++){
      list.add(0,list.get(list.size()-1));
      list.remove(list.size()-1);
    }
    for(int i=0;i<list.size();i++){
      System.out.print(list.get(i)+" ");
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    checkRepAl(str);
    // int arr[]={1,2,3,4,5,6,7};
    // System.out.println("Enter no of rotation: ");
    // int noRot=sc.nextInt();
    // RotArray(arr, noRot);

    
    
  }
}