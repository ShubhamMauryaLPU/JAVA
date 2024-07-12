public class RevArry {

    public static void Reverse(int arr[]){
        int first=0;
        int last=arr.length-1;
        while(first<last){
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[]={5,10,15,20,25,30};
        Reverse(numbers);
        for(int i=0;i<numbers.length;i++){
        System.out.println(numbers[i]);
        }
    }
}
