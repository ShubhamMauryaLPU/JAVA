
public class BinarySearch {

    public static int binarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){

        int numbers[]={5,10,15,20,25,30,35};
        int key=30;
        int index=binarySearch(numbers, key);
        if(index== -1){
            System.out.print("Not found");
        }
        else
        System.out.print(index);
    }
    
}