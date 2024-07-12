public class LinearSearch {

    public static int linearSearch(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={12,11,13,134,56,10,15};
        int key=10;
        int index =linearSearch(arr, key);
        if(index== -1){

            System.out.print("Not found");
        }
        else{
            System.out.print(index+1);
        }

    }
}
